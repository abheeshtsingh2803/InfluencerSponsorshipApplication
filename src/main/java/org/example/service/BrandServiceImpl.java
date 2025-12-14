package org.example.service;

import org.example.model.Brand;
import org.example.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepo;

    @Autowired
    public BrandServiceImpl(BrandRepository brandRepo) {
        this.brandRepo = brandRepo;
    }

    @Override
    public Brand create(Brand brand) {
        return brandRepo.save(brand);
    }

    @Override
    public Page<Brand> list(Pageable pageable) {
        return brandRepo.findAll(pageable);
    }
}
