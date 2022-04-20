package nl.inholland.INF2aLes1.controller;

import nl.inholland.INF2aLes1.model.Movie;
import nl.inholland.INF2aLes1.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/movies")
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
    public ResponseEntity getOne(@PathVariable String movieId) {
        return ResponseEntity.status(200).body(movieService.getOne(Integer.parseInt(movieId)));
    }

    @PostMapping
    public ResponseEntity insertOne(@RequestBody Movie movie) {
        movieService.insertOne(movie);
        return ResponseEntity.status(201).body(movie);
    }

    @PutMapping("/{movieId}")
    public ResponseEntity updateOne(@PathVariable long movieId, @RequestBody Movie movie) {

        Movie exist_Movie = movieService.getOne(movieId);

        exist_Movie.setName(movie.getName());
        exist_Movie.setDirector(movie.getDirector());
        exist_Movie.setYearOfProduction(movie.getYearOfProduction());

        Movie result = movieService.updateOne(exist_Movie);
        return ResponseEntity.status(204).body(result);
    }

    @DeleteMapping("/{movieId}")
    public ResponseEntity deleteOne(@PathVariable String movieId) {
        movieService.deleteOne(Long.parseLong((movieId)));
        return ResponseEntity.status(200).body(movieId);
    }
}
