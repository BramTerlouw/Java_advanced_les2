package nl.inholland.INF2aLes1.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Movie {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String director;
    private int yearOfProduction;

    // In this case, multiple users can have this movie in their collection
    @ManyToMany
    private Set<User> users = new HashSet<>();


    // Constructors
    public Movie() {

    }

    public Movie(String name, String director, int yearOfProduction) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.yearOfProduction = yearOfProduction;
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }


    // To string implementation
    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
