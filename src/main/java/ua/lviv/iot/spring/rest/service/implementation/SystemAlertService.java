package ua.lviv.iot.spring.rest.service.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.spring.rest.domain.implementation.SystemAlert;
import ua.lviv.iot.spring.rest.respository.SystemAlertRepository;

@Service
public class SystemAlertService extends GeneralService<SystemAlert> {

    @Autowired
    SystemAlertRepository systemAlertRepository;

    @Override
    public JpaRepository<SystemAlert, Integer> getRepository() {
        return systemAlertRepository;
    }
}
