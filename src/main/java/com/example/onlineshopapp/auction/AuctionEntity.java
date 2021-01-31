package com.example.onlineshopapp.auction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuctionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    private String title;
    private String description;
    @Enumerated(EnumType.STRING)
    private Category category;
    private BigDecimal minimumAmount;
    private BigDecimal amountBuyNow;
    @Enumerated(EnumType.STRING)
    private FeatureAuction featureAuction;
    private String location;
    private Date startDate;
    private Date endDate;
    private int viewCount;

}
