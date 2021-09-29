package ua.lviv.iot.spring.rest.service.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.spring.rest.domain.implementation.AccessLevel;
import ua.lviv.iot.spring.rest.respository.AccessLevelRepository;

@Service
public class AccessLevelService extends GeneralService<AccessLevel> {

    @Autowired
    AccessLevelRepository accessLevelRepository;

    @Override
    public JpaRepository<AccessLevel, Integer> getRepository() {
        return accessLevelRepository;
    }

}
