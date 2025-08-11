package com.example.ecommerce.feign;

import feign.FeignException;
import org.springframework.stereotype.Component;
import org.springframework.cloud.openfeign.FallbackFactory;
import com.example.ecommerce.feign.dto.MovieDto;
import java.util.List;
import java.util.ArrayList;

@Component
public class MovieClientFallbackFactory implements FallbackFactory<MovieClient> {
    @Override
    public MovieClient create(Throwable cause) {
        return new MovieClient() {
            @Override
            public List<MovieDto> getAll() {
                // fallback: return empty list or cached values
                return new ArrayList<>();
            }
        };
    }
}
