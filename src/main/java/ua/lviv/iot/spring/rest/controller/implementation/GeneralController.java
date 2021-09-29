package ua.lviv.iot.spring.rest.controller.implementation;


import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.spring.rest.controller.IGeneralController;
import ua.lviv.iot.spring.rest.domain.IGeneralModel;

import java.util.List;

public abstract class GeneralController<T extends IGeneralModel> implements IGeneralController<T> {

    @Override
    @GetMapping("")
    public List<T> findAll() {
        return getService().findAll();
    }

    @Override
    @GetMapping("/{id}")
    public T findById(@PathVariable Integer id) {
        return getService().find(id);
    }

    @Override
    @PostMapping("")
    public void create(@RequestBody T t) {
        getService().create(t);
    }

    @Override
    @PutMapping("/{id}")
    public void update(@PathVariable Integer id, @RequestBody T t) {
        t.setId(id);
        getService().update(t);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        getService().delete(id);
    }
}
