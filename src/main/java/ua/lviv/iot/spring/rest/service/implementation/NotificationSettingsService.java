package ua.lviv.iot.spring.rest.service.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.spring.rest.domain.implementation.NotificationSettings;
import ua.lviv.iot.spring.rest.respository.NotificationSettingsRepository;

@Service
public class NotificationSettingsService extends GeneralService<NotificationSettings> {

    @Autowired
    NotificationSettingsRepository notificationSettingsRepository;

    @Override
    public JpaRepository<NotificationSettings, Integer> getRepository() {
        return notificationSettingsRepository;
    }
}
