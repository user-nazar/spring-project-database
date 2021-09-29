package ua.lviv.iot.spring.rest.service;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface IGeneralService<T> {
    JpaRepository<T, Integer> getRepository();
    List<T> findAll();
    T find(Integer id);
    @Transactional
    void create(T t);
    @Transactional
    void update(T t);
    @Transactional
    void delete(Integer id);
}
