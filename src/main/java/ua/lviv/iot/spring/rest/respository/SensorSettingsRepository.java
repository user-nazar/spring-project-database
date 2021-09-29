package ua.lviv.iot.spring.rest.respository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.spring.rest.domain.implementation.SensorSettings;

@Repository
public interface SensorSettingsRepository extends JpaRepository<SensorSettings, Integer> {
}
