package ua.lviv.iot.spring.rest.controller.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.spring.rest.domain.implementation.SensorNotification;
import ua.lviv.iot.spring.rest.service.IGeneralService;
import ua.lviv.iot.spring.rest.service.implementation.SensorNotificationService;

@RestController
@RequestMapping("sensor_notification")
public class SensorNotificationController extends GeneralController<SensorNotification> {

    @Autowired
    SensorNotificationService sensorNotificationService;

    @Override
    public IGeneralService<SensorNotification> getService() {
        return sensorNotificationService;
    }
}
