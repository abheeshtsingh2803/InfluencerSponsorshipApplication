package org.example.controller;

import org.example.model.Offer;
import org.example.service.OfferService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/offers")
public class OfferController {

    private final OfferService service;

    public OfferController(OfferService service) {
        this.service = service;
    }

    @PostMapping
    public Offer create(@RequestParam Long brandId,
                        @RequestParam Long influencerId,
                        @RequestParam double amount) {
        return service.createOffer(brandId, influencerId, amount);
    }

    @PatchMapping("/{id}")
    public Offer accept(@PathVariable Long id) {
        return service.acceptOffer(id);
    }

    @GetMapping
    public List<Offer> getOffers(@RequestParam(required = false) Long influencerId,
                                 @RequestParam(required = false) Long brandId) {
        return service.getOffers(influencerId, brandId);
    }
}