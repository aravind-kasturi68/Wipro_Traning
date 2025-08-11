package com.example.ecommerce.feign.dto;

public class MovieDto {
    private Long id;
    private String title;
    private Integer releaseYear;
    private Double rating;

    // getters/setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public Integer getReleaseYear() { return releaseYear; }
    public void setReleaseYear(Integer releaseYear) { this.releaseYear = releaseYear; }
    public Double getRating() { return rating; }
    public void setRating(Double rating) { this.rating = rating; }
}
