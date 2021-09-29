package ua.lviv.iot.spring.rest.controller.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.spring.rest.domain.implementation.SystemControl;
import ua.lviv.iot.spring.rest.service.IGeneralService;
import ua.lviv.iot.spring.rest.service.implementation.SystemControlService;

@RestController
@RequestMapping("system_control")
public class SystemControlController extends GeneralController<SystemControl> {

    @Autowired
    SystemControlService systemControlService;

    @Override
    public IGeneralService<SystemControl> getService() {
        return systemControlService;
    }
}
