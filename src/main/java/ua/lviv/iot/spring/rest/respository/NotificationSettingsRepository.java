package ua.lviv.iot.spring.rest.respository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.spring.rest.domain.implementation.NotificationSettings;

@Repository
public interface NotificationSettingsRepository extends JpaRepository<NotificationSettings, Integer> {
}
