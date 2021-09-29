package ua.lviv.iot.spring.rest.controller.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.spring.rest.domain.implementation.User;
import ua.lviv.iot.spring.rest.service.IGeneralService;
import ua.lviv.iot.spring.rest.service.implementation.UserService;

@RestController
@RequestMapping("user")
public class UserController extends GeneralController<User> {

    @Autowired
    UserService userService;

    @Override
    public IGeneralService<User> getService() {
        return userService;

    }
}

