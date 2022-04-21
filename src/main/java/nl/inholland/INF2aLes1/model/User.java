package nl.inholland.INF2aLes1.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue
    private long id;
    private String name;

    // In this case, a user has a collection with multiple movies
    @ManyToMany(mappedBy = "users")
    private Set<Movie> movieCollection = new HashSet<>();


    // Constructors
    public User() {

    }

    public User(String name) {
        this.name = name;
    }


    // Getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // to string implementation
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", movieCollection=" + movieCollection +
                '}';
    }
}
