package ua.lviv.iot.spring.rest.controller.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.spring.rest.domain.implementation.Zone;
import ua.lviv.iot.spring.rest.service.IGeneralService;
import ua.lviv.iot.spring.rest.service.implementation.ZoneService;

@RestController
@RequestMapping("zone")
public class ZoneController extends GeneralController<Zone> {

    @Autowired
    ZoneService zoneService;

    @Override
    public IGeneralService<Zone> getService() {
        return zoneService;
    }
}
