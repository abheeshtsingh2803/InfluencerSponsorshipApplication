package org.example.service;

import org.example.model.Influencer;
import org.example.repository.InfluencerRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class InfluencerServiceImpl implements InfluencerService {

    private final InfluencerRepository repo;

    public InfluencerServiceImpl(InfluencerRepository repo) {
        this.repo = repo;
    }

    public Influencer create(Influencer influencer) {
        return repo.save(influencer);
    }

    public Page<Influencer> list(Pageable  pageable) {
        return repo.findAll(pageable);
    }
}
