package com.example.onlineshopapp.auction;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class AuctionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    private String title;
    private String description;
    private Category category;
    private BigDecimal minimumAmount;
    private BigDecimal amountBuyNow;

}
