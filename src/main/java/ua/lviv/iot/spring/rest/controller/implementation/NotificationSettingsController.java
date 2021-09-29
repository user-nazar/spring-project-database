package ua.lviv.iot.spring.rest.controller.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.spring.rest.domain.implementation.NotificationSettings;
import ua.lviv.iot.spring.rest.service.IGeneralService;
import ua.lviv.iot.spring.rest.service.implementation.NotificationSettingsService;

@RestController
@RequestMapping("notification_settings")
public class NotificationSettingsController extends GeneralController<NotificationSettings> {

    @Autowired
    NotificationSettingsService notificationSettingsService;

    @Override
    public IGeneralService<NotificationSettings> getService() {
        return notificationSettingsService;
    }
}
