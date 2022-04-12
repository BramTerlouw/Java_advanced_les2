package nl.inholland.INF2aLes1.model;

public class Movie {

    private long id;
    private String name;
    private String director;
    private int yearOfProduction;

    public Movie(long id, String name, String director, int yearOfProduction) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.yearOfProduction = yearOfProduction;
    }

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
