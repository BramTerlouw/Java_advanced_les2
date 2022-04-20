package nl.inholland.INF2aLes1.service;

import nl.inholland.INF2aLes1.model.Movie;
import nl.inholland.INF2aLes1.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAll() {
        return (List<Movie>) movieRepository.findAll();
    }

    public Movie getOne(long id) {
        return movieRepository.findById(id).get();
    }

    public Movie insertOne(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie updateOne(Movie movie) {
        return movieRepository.save(movie);
    }

    public void deleteOne(long id) {
        movieRepository.deleteById(id);
    }
}
