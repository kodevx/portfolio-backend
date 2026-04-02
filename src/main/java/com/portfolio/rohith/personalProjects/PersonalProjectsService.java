package com.portfolio.rohith.personalProjects;

import org.springframework.stereotype.Service;

@Service
public class PersonalProjectsService {

    public final PersonalProjectsRepository personalProjectsRepository;

    public PersonalProjectsService(PersonalProjectsRepository personalProjectsRepository) {
        this.personalProjectsRepository = personalProjectsRepository;
    }

    public Iterable<PersonalProjects> getPersonalProjects() {
        return this.personalProjectsRepository.findAll();
    }

    public void addPersonalProjects(PersonalProjects personalProjects) {
        this.personalProjectsRepository.save(personalProjects);
    }

}
