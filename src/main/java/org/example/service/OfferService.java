package org.example.service;

import org.example.model.Offer;

import java.util.List;

public interface OfferService {
    public Offer createOffer(Long brandId, Long influencerId, double amount);
    public Offer acceptOffer(Long offerId);
    List<Offer> getOffers(Long influencerId, Long brandId);

}
