package com.portfolio.rohith.header;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class HeaderService {

    private final HeaderRepository headerRepository;

    public HeaderService(HeaderRepository headerRepository) {
        this.headerRepository = headerRepository;
    }

    @Transactional
    public Iterable<Header> getHeaderLinks() {
        return headerRepository.findAll();
    }
}
