package nl.inholland.INF2aLes1.service;

import nl.inholland.INF2aLes1.model.User;
import nl.inholland.INF2aLes1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAll() {
        return (List<User>) userRepository.findAll();
    }

    public User getOne(String name) {
        // Use name instead of id and use query method
        return userRepository.findByNameContaining(name);
    }

    public User insertOne(User user) {
        return userRepository.save(user);
    }
}
