package com.example.movie.repository;

import com.example.movie.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByTitleContainingIgnoreCase(String title);

    @Query(value = "SELECT * FROM movie WHERE release_year > ?1", nativeQuery = true)
    List<Movie> findMoviesReleasedAfter(int year);
}
