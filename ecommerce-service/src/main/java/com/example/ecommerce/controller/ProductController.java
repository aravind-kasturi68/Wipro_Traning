package com.example.ecommerce.controller;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductRepository repo;
    public ProductController(ProductRepository repo) { this.repo = repo; }

    @GetMapping
    public List<Product> list() { return repo.findAll(); }

    @GetMapping("/search")
    public List<Product> search(@RequestParam String q) { return repo.findByNameContainingIgnoreCase(q); }

    @GetMapping("/{id}")
    public Product get(@PathVariable Long id) { return repo.findById(id).orElse(null); }

    @PostMapping
    public Product create(@RequestBody Product p) { return repo.save(p); }

    @PutMapping("/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product p) {
        p.setId(id); return repo.save(p);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { repo.deleteById(id); }
}
