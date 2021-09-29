package ua.lviv.iot.spring.rest.service.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.spring.rest.domain.implementation.SensorSettings;
import ua.lviv.iot.spring.rest.respository.SensorSettingsRepository;

@Service
public class SensorSettingsService extends GeneralService<SensorSettings> {

    @Autowired
    SensorSettingsRepository sensorSettingsRepository;

    @Override
    public JpaRepository<SensorSettings, Integer> getRepository() {
        return sensorSettingsRepository;
    }
}
