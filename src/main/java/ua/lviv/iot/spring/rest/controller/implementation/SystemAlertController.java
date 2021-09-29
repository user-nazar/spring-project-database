package ua.lviv.iot.spring.rest.controller.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.spring.rest.domain.implementation.SystemAlert;
import ua.lviv.iot.spring.rest.service.IGeneralService;
import ua.lviv.iot.spring.rest.service.implementation.SystemAlertService;

@RestController
@RequestMapping("system_alert")
public class SystemAlertController extends GeneralController<SystemAlert> {

    @Autowired
    SystemAlertService systemAlertService;

    @Override
    public IGeneralService<SystemAlert> getService() {
        return systemAlertService;
    }
}
