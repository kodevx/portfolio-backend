package com.portfolio.rohith.header;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name="headerlinks")
public class Header {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PAGE_ID")
    @JsonProperty("id")
    private Integer id;

    @Column(name="PAGE_NAME")
    @JsonProperty("name")
    private String name;

    @Column(name="PAGE_URL_LINK")
    @JsonProperty("url_link")
    private String urlLink;
}
