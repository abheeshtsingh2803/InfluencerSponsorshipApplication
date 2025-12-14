package org.example.controller;

import org.example.model.Brand;
import org.example.service.BrandService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/brands")
public class BrandController {

    private final BrandService  service;

    public BrandController(BrandService service) {
        this.service = service;
    }

    @PostMapping
    public Brand  create(@RequestBody  Brand brand) {
        return service.create(brand);
    }

    @GetMapping
    public Page <Brand> list(Pageable  pageable) {
        return service.list(pageable);
    }
}