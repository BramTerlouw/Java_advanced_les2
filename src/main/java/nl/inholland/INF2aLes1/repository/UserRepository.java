package nl.inholland.INF2aLes1.repository;

import nl.inholland.INF2aLes1.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    // Custom query with LIKE
    User findByNameContaining(String name);
}
