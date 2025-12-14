package org.example.service;

import org.example.model.Brand;
import org.example.model.Influencer;
import org.example.model.Offer;
import org.example.repository.BrandRepository;
import org.example.repository.InfluencerRepository;
import org.example.repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferServiceImpl implements OfferService {

    private final OfferRepository offerRepo;
    private final BrandRepository brandRepo;
    private final InfluencerRepository influencerRepo;


    @Autowired
    public OfferServiceImpl(OfferRepository offerRepo, BrandRepository brandRepo, InfluencerRepository influencerRepo) {
        this.offerRepo = offerRepo;
        this.brandRepo = brandRepo;
        this.influencerRepo = influencerRepo;
    }

    @Override
    public Offer createOffer(Long brandId, Long influencerId, double amount) {
        Brand brand = brandRepo.findById(brandId).orElseThrow();
        Influencer influencer = influencerRepo.findById(influencerId).orElseThrow();

        if (brand.getBudget() < amount)
            throw new RuntimeException("Not enough budget!");

        Offer offer = new Offer();
        offer.setBrand(brand);
        offer.setInfluencer(influencer);
        offer.setMoneyAmount(amount);

        return offerRepo.save(offer);
    }

    @Override
    public Offer acceptOffer(Long offerId) {
        Offer offer = offerRepo.findById(offerId).orElseThrow();

        if (offer.isAccepted())
            throw new RuntimeException("Offer already accepted!");

        Brand brand = offer.getBrand();
        Influencer influencer = offer.getInfluencer();

        if (brand.getBudget() < offer.getMoneyAmount())
            throw new RuntimeException("Brand does not have enough budget!");

        brand.setBudget(brand.getBudget() - offer.getMoneyAmount());
        influencer.setTotalEarnings(influencer.getTotalEarnings() + offer.getMoneyAmount());
        offer.setAccepted(true);

        brandRepo.save(brand);
        influencerRepo.save(influencer);

        return offerRepo.save(offer);
    }

    @Override
    public List<Offer> getOffers(Long influencerId, Long brandId) {
        if (influencerId != null)
            return offerRepo.findByInfluencerId(influencerId);
        if (brandId != null)
            return offerRepo.findByBrandId(brandId);

        return offerRepo.findAll();
    }
}
