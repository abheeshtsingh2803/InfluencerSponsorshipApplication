package org.example.service;

import org.example.model.Influencer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface InfluencerService {
    public Influencer  create(Influencer influencer);
    public Page<Influencer> list(Pageable pageable);
}
