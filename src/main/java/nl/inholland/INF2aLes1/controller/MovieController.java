package nl.inholland.INF2aLes1.controller;

import nl.inholland.INF2aLes1.model.Movie;
import nl.inholland.INF2aLes1.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public ResponseEntity getAll() {
        List<Movie> movies = movieService.getAll();
        return ResponseEntity.status(200).body(movies);
    }

    @GetMapping("/{movieId}")
    public Movie getOne(@PathVariable String movieId) {
        return movieService.getOne(Integer.parseInt(movieId));
    }

    @PostMapping
    public Movie insertOne(@RequestBody Movie movie) {
        return movieService.insertOne(movie);
    }

    @PutMapping("/{movieId}")
    public Movie updateOne(@PathVariable String movieId, @RequestBody Movie movie) {
        return movieService.updateOne(Integer.parseInt(movieId), movie);
    }

    @DeleteMapping("/{movieId}")
    public int deleteOne(@PathVariable String movieId) {
        return movieService.deleteOne(Integer.parseInt(movieId));
    }
}
