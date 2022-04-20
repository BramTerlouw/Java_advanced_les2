package nl.inholland.INF2aLes1.repository;

import nl.inholland.INF2aLes1.model.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {
}
