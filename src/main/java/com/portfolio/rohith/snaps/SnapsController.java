package com.portfolio.rohith.snaps;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/snaps")
@CrossOrigin(origins = { "http://localhost:8000", "http://192.168.1.35:8000/" })
public class SnapsController {

    public final SnapsService snapsService;

    public SnapsController (SnapsService snapsService) {
        this.snapsService = snapsService;
    }

    @RequestMapping("/")
    public Iterable<Snaps> getSnaps() { return this.snapsService.getAllSnaps(); }
}
