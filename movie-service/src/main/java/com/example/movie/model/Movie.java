package com.example.movie.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Integer releaseYear;
    private Double rating;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    @JsonManagedReference
    private Genre genre;

    @ManyToOne
    @JoinColumn(name = "director_id")
    @JsonManagedReference
    private Director director;

    // getters/setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public Integer getReleaseYear() { return releaseYear; }
    public void setReleaseYear(Integer releaseYear) { this.releaseYear = releaseYear; }
    public Double getRating() { return rating; }
    public void setRating(Double rating) { this.rating = rating; }
    public Genre getGenre() { return genre; }
    public void setGenre(Genre genre) { this.genre = genre; }
    public Director getDirector() { return director; }
    public void setDirector(Director director) { this.director = director; }
}
