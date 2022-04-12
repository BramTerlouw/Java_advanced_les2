package nl.inholland.INF2aLes1.service;

import nl.inholland.INF2aLes1.model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    private List<Movie> movies = new ArrayList<Movie>();

    public MovieService() {
        movies.add(new Movie(0, "Dune", "Denis Villeneuve", 2021));
        movies.add(new Movie(1, "Doctor Strange in the Multiverse of Madness", "Sam Raimi", 2022));
    }

    public List<Movie> getAll() {
        return movies;
    }

    public Movie getOne(int movieId) {
        Movie movie = null;
        for (Movie m : movies) {
            if ((int) m.getId() == movieId)
                movie = m;
        }
        return movie;
    }

    public Movie insertOne(Movie movie) {
        movies.add(movie);
        return movie;
    }

    public Movie updateOne(int movieId, Movie movie) {
        movies.set(movieId, movie);
        return movie;
    }

    public int deleteOne(int movieId) {
        movies.remove(movieId);
        return movieId;
    }
}
