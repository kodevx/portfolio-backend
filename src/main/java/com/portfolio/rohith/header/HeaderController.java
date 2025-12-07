package com.portfolio.rohith.header;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/header-data")
@CrossOrigin(origins = { "http://localhost:8000", "http://192.168.1.35:8000/" })
public class HeaderController {

    private final HeaderService headerService;

    private HeaderController(HeaderService headerService) {
        this.headerService = headerService;
    }

    @GetMapping("/")
    public Iterable<Header> getHeaderData() {
        return headerService.getHeaderLinks();
    }

    @PostMapping("/add")
    public Iterable<Header> addHeaderData(@RequestBody Header HeaderLinks) {
        this.headerService.addHeaderLinks(HeaderLinks);
        return this.headerService.getHeaderLinks();
    }
}
