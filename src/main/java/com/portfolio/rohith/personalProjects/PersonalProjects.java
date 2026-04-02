package com.portfolio.rohith.personalProjects;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

@Entity
@Table(name="personalprojects")
public class PersonalProjects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="project_id")
    @JsonProperty("id")
    private Integer Id;

    @Column(name="project_name")
    @JsonProperty("name")
    private String name;

    @Column(name="project_description")
    @JsonProperty("description")
    private String description;

    @Column(name="project_thumbnail")
    @JsonProperty("thumbnail")
    private String thumbnail;

    @Column(name="project_link")
    @JsonProperty("link")
    private String link;

}
