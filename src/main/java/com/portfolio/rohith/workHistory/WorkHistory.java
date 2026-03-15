package com.portfolio.rohith.workHistory;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

@Table(name="workhistory")
public class WorkHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @JsonProperty("id")
    private Integer id;

    @Column(name="company_name")
    @JsonProperty("name")
    private String companyName;

    @Column(name="company_location")
    @JsonProperty("location")
    private String companyLocation;

    @Column(name="first_designation")
    @JsonProperty("first_designation")
    private String firstDesignation;

    @Column(name="second_designation")
    @JsonProperty("second_designation")
    private String secondDesignation;

    @Column(name="third_designation")
    @JsonProperty("third_designation")
    private String thirdDesignation;

    @Column(name="start_date")
    @JsonProperty("start_date")
    private Date startDate;

    @Column(name="end_date")
    @JsonProperty("end_date")
    private Date endDate;

}
