package org.example.controller;

import org.example.model.Influencer;
import org.example.service.InfluencerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/influencers")
public class InfluencerController {

    private final InfluencerService  service;

    public InfluencerController(InfluencerService service) {
        this.service = service;
    }

    @PostMapping
    public Influencer  create(@RequestBody  Influencer influencer) {
        return service.create(influencer);
    }

    @GetMapping
    public Page<Influencer> list(Pageable pageable) {
        return service.list(pageable);
    }
}
