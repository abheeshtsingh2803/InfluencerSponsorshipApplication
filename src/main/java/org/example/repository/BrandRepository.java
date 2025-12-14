package org.example.repository;

import org.example.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface BrandRepository extends JpaRepository<Brand,Long> {
}
