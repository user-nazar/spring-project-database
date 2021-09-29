package ua.lviv.iot.spring.rest.service.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.spring.rest.domain.implementation.ObjectAndSecurity;
import ua.lviv.iot.spring.rest.respository.ObjectAndSecurityRepository;

@Service
public class ObjectAndSecurityService extends GeneralService<ObjectAndSecurity> {

    @Autowired
    ObjectAndSecurityRepository objectAndSecurityRepository;

    @Override
    public JpaRepository<ObjectAndSecurity, Integer> getRepository() {
        return objectAndSecurityRepository;
    }
}
