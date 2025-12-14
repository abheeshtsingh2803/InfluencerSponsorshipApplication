package org.example.repository;

import org.example.model.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfferRepository extends JpaRepository<Offer ,Long> {
    List<Offer> findByInfluencerId(Long influencerId);
    List<Offer> findByBrandId(Long brandId);
}
