package ua.lviv.iot.spring.rest.controller.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.spring.rest.domain.implementation.SensorSettings;
import ua.lviv.iot.spring.rest.service.IGeneralService;
import ua.lviv.iot.spring.rest.service.implementation.SensorSettingsService;

@RestController
@RequestMapping("sensor_settings")
public class SensorSettingsController extends GeneralController<SensorSettings> {

    @Autowired
    SensorSettingsService sensorSettingsService;

    @Override
    public IGeneralService<SensorSettings> getService() {
        return sensorSettingsService;
    }
}
