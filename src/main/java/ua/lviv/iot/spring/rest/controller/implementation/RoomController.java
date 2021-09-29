package ua.lviv.iot.spring.rest.controller.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.spring.rest.domain.implementation.Room;
import ua.lviv.iot.spring.rest.service.IGeneralService;
import ua.lviv.iot.spring.rest.service.implementation.RoomService;

@RestController
@RequestMapping("room")
public class RoomController extends GeneralController<Room> {

    @Autowired
    RoomService roomService;

    @Override
    public IGeneralService<Room> getService() {
        return roomService;
    }
}
