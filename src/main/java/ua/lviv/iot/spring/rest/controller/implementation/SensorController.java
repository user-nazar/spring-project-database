package ua.lviv.iot.spring.rest.controller.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.spring.rest.domain.implementation.Sensor;
import ua.lviv.iot.spring.rest.service.IGeneralService;
import ua.lviv.iot.spring.rest.service.implementation.SensorService;

@RestController
@RequestMapping("sensor")
public class SensorController extends GeneralController<Sensor> {

    @Autowired
    SensorService sensorService;

    @Override
    public IGeneralService<Sensor> getService() {
        return sensorService;
    }
}
