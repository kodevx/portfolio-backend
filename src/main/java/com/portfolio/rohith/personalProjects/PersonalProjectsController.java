package com.portfolio.rohith.personalProjects;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personal-projects/")
@CrossOrigin(origins = { "https://rnair.tech/", "http://localhost:8000" })
public class PersonalProjectsController {

    private final PersonalProjectsService personalProjectsService;

    private PersonalProjectsController(PersonalProjectsService personalProjectsService) {
        this.personalProjectsService = personalProjectsService;
    }

    @GetMapping("/")
    public Iterable<PersonalProjects> getAllPersonalProjectsData() {
        return personalProjectsService.getPersonalProjects();
    }
}

