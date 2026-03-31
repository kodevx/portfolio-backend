package com.portfolio.rohith.snaps;


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
@Table(name="snaps")
public class Snaps {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name="image_link")
    @JsonProperty("image_link")
    private String imageLink;

    @Column(name="location")
    @JsonProperty("location")
    private String location;

}
