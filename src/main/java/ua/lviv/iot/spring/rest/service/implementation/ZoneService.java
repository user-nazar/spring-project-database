package ua.lviv.iot.spring.rest.service.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.spring.rest.domain.implementation.Zone;
import ua.lviv.iot.spring.rest.respository.ZoneRepository;

@Service
public class ZoneService extends GeneralService<Zone> {

    @Autowired
    ZoneRepository zoneRepository;

    @Override
    public JpaRepository<Zone, Integer> getRepository() {
        return zoneRepository;
    }
}
