package com.portfolio.rohith.contact;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Getter
@Setter

@Entity
@Table(name="contactinfo")
public class Contact {

    @Id
    @Column(name="id")
    @JsonProperty("id")
    private Integer id;

    @Column(name="email_id")
    @JsonProperty("emailId")
    private String emailId;

    @Column(name="mobile_number")
    @JsonProperty("mobileNumber")
    private String mobileNumber;

}
