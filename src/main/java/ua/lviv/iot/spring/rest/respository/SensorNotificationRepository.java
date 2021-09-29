package ua.lviv.iot.spring.rest.respository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.spring.rest.domain.implementation.SensorNotification;

@Repository
public interface SensorNotificationRepository extends JpaRepository<SensorNotification, Integer> {
}
