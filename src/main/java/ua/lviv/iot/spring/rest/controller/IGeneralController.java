package ua.lviv.iot.spring.rest.controller;


import ua.lviv.iot.spring.rest.service.IGeneralService;

import java.util.List;

public interface IGeneralController<T> {
    IGeneralService<T> getService();

    List<T> findAll();

    T findById(Integer id);

    void create(T t);

    void update(Integer id, T t);

    void delete(Integer id);
}
