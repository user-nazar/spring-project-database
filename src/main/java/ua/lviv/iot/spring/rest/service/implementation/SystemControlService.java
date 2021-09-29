package ua.lviv.iot.spring.rest.service.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.spring.rest.domain.implementation.SystemControl;
import ua.lviv.iot.spring.rest.respository.SystemControlRepository;

@Service
public class SystemControlService extends GeneralService<SystemControl> {

    @Autowired
    SystemControlRepository systemControlRepository;

    @Override
    public JpaRepository<SystemControl, Integer> getRepository() {
        return systemControlRepository;
    }
}
