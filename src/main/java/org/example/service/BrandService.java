package org.example.service;

import org.example.model.Brand;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BrandService {
    public Brand  create(Brand brand);
    public Page<Brand> list(Pageable pageable);
}
