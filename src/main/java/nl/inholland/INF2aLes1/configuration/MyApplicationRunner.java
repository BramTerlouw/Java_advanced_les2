package nl.inholland.INF2aLes1.configuration;

import nl.inholland.INF2aLes1.model.Movie;
import nl.inholland.INF2aLes1.model.User;
import nl.inholland.INF2aLes1.service.MovieService;
import nl.inholland.INF2aLes1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner {

    @Autowired
    private MovieService movieService;

    @Autowired
    private UserService userService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

    movieService.insertOne(new Movie("Application movie 1", "Bram", 2022));
    movieService.insertOne(new Movie("Application movie 2", "Mark", 2023));
    userService.insertOne(new User("Bram"));
    userService.insertOne(new User("Mark"));

    }
}
