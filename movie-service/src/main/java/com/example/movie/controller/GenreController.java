package com.example.movie.controller;

import com.example.movie.model.Genre;
import com.example.movie.repository.GenreRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/genres")
public class GenreController {
    private final GenreRepository repo;
    public GenreController(GenreRepository repo) { this.repo = repo; }

    @GetMapping
    public List<Genre> list() { return repo.findAll(); }

    @PostMapping
    public Genre create(@RequestBody Genre g) { return repo.save(g); }
}
