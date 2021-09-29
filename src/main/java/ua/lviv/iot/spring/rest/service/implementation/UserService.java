package ua.lviv.iot.spring.rest.service.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.spring.rest.domain.implementation.User;
import ua.lviv.iot.spring.rest.respository.UserRepository;

@Service
public class UserService extends GeneralService<User> {

    @Autowired
    UserRepository userRepository;

    @Override
    public JpaRepository<User, Integer> getRepository() {
        return userRepository;
    }
}
