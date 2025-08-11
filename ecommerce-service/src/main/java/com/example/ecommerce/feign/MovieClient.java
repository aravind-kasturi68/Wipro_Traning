package com.example.ecommerce.feign;

import com.example.ecommerce.feign.dto.MovieDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name = "movie-service", path = "/api/movies", fallbackFactory = MovieClientFallbackFactory.class)
public interface MovieClient {
    @GetMapping
    List<MovieDto> getAll();
}
