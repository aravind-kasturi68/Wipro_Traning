package com.example.ecommerce.service;

import com.example.ecommerce.feign.MovieClient;
import com.example.ecommerce.feign.dto.MovieDto;
import org.springframework.stereotype.Service;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import java.util.List;

@Service
public class EcommerceService {
    private final MovieClient movieClient;

    public EcommerceService(MovieClient movieClient) {
        this.movieClient = movieClient;
    }

    @CircuitBreaker(name = "movieService", fallbackMethod = "fallbackMovies")
    public List<MovieDto> getMoviesFromMovieService() {
        return movieClient.getAll();
    }

    public List<MovieDto> fallbackMovies(Throwable t) {
        return List.of();
    }
}
