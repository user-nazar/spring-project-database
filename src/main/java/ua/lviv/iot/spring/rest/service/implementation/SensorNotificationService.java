package ua.lviv.iot.spring.rest.service.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.spring.rest.domain.implementation.SensorNotification;
import ua.lviv.iot.spring.rest.respository.SensorNotificationRepository;

@Service
public class SensorNotificationService extends GeneralService<SensorNotification> {

    @Autowired
    SensorNotificationRepository sensorNotificationRepository;

    @Override
    public JpaRepository<SensorNotification, Integer> getRepository() {
        return sensorNotificationRepository;
    }
}
