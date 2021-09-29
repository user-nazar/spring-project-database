package ua.lviv.iot.spring.rest.service.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.spring.rest.domain.implementation.Room;
import ua.lviv.iot.spring.rest.respository.RoomRepository;

@Service
public class RoomService extends GeneralService<Room> {

    @Autowired
    RoomRepository roomRepository;

    @Override
    public JpaRepository<Room, Integer> getRepository() {
        return roomRepository;
    }
}
