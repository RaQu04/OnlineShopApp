package com.example.onlineshopapp.user;

import lombok.*;

import javax.persistence.Embeddable;

@Builder
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Address {

    private String street;
    private String city;
    private String zipCode;
    private String country;
}
