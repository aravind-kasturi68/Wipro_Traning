package com.example.movie.controller;

import com.example.movie.model.Movie;
import com.example.movie.repository.MovieRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    private final MovieRepository repo;
    public MovieController(MovieRepository repo) { this.repo = repo; }

    @GetMapping
    public List<Movie> list() { return repo.findAll(); }

    @GetMapping("/search")
    public List<Movie> search(@RequestParam String q) {
        return repo.findByTitleContainingIgnoreCase(q);
    }

    @GetMapping("/after/{year}")
    public List<Movie> after(@PathVariable int year) {
        return repo.findMoviesReleasedAfter(year);
    }

    @GetMapping("/{id}")
    public Movie get(@PathVariable Long id) { return repo.findById(id).orElse(null); }

    @PostMapping
    public Movie create(@RequestBody Movie m) { return repo.save(m); }

    @PutMapping("/{id}")
    public Movie update(@PathVariable Long id, @RequestBody Movie m) {
        m.setId(id);
        return repo.save(m);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { repo.deleteById(id); }
}
