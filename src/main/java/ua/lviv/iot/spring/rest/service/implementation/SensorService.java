package ua.lviv.iot.spring.rest.service.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.spring.rest.domain.implementation.Sensor;
import ua.lviv.iot.spring.rest.respository.SensorRepository;

@Service
public class SensorService extends GeneralService<Sensor> {

    @Autowired
    SensorRepository sensorRepository;

    @Override
    public JpaRepository<Sensor, Integer> getRepository() {
        return sensorRepository;
    }
}
