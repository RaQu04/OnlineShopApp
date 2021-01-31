package com.example.onlineshopapp.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Builder
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String street;
    private String city;
    private String zipCode;
    private String country;
}
