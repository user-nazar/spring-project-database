package ua.lviv.iot.spring.rest.controller.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.spring.rest.domain.implementation.AccessLevel;
import ua.lviv.iot.spring.rest.service.IGeneralService;
import ua.lviv.iot.spring.rest.service.implementation.AccessLevelService;

@RestController
@RequestMapping("access_level")
public class AccessLevelController extends GeneralController<AccessLevel> {

    @Autowired
    AccessLevelService accessLevelService;

    @Override
    public IGeneralService<AccessLevel> getService() {
        return accessLevelService;
    }
}
