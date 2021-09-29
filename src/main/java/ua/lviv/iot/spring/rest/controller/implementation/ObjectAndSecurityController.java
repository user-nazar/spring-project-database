package ua.lviv.iot.spring.rest.controller.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.spring.rest.domain.implementation.ObjectAndSecurity;
import ua.lviv.iot.spring.rest.service.IGeneralService;
import ua.lviv.iot.spring.rest.service.implementation.ObjectAndSecurityService;

@RestController
@RequestMapping("object_and_security")
public class ObjectAndSecurityController extends GeneralController<ObjectAndSecurity> {

    @Autowired
    ObjectAndSecurityService objectAndSecurityService;

    @Override
    public IGeneralService<ObjectAndSecurity> getService() {
        return objectAndSecurityService;
    }
}
