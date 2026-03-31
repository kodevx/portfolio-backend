package com.portfolio.rohith.snaps;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class SnapsService {
    private final SnapsRepository snapsRepository;

    public SnapsService(SnapsRepository snapsRepository){ this.snapsRepository = snapsRepository; }

    @Transactional
    public Iterable<Snaps> getAllSnaps() { return this.snapsRepository.findAll(); }

}
