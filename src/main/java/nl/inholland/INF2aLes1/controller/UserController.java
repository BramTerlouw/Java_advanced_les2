package nl.inholland.INF2aLes1.controller;

import nl.inholland.INF2aLes1.model.User;
import nl.inholland.INF2aLes1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity getAll() {
        List<User> users = userService.getAll();
        return ResponseEntity.status(200).body(users);
    }

    @GetMapping("/{userName}")
    public ResponseEntity getOne(@PathVariable String userName) {
        // Use name instead of id and use query method
        return ResponseEntity.status(200).body(userService.getOne(userName));
    }
}