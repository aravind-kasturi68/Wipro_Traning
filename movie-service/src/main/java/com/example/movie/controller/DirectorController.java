package com.example.movie.controller;

import com.example.movie.model.Director;
import com.example.movie.repository.DirectorRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/directors")
public class DirectorController {
    private final DirectorRepository repo;
    public DirectorController(DirectorRepository repo) { this.repo = repo; }

    @GetMapping
    public List<Director> list() { return repo.findAll(); }

    @PostMapping
    public Director create(@RequestBody Director d) { return repo.save(d); }
}
