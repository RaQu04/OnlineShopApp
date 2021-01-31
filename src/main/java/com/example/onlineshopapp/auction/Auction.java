package com.example.onlineshopapp.auction;

import lombok.Value;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;
import java.util.Date;

@Value
public class Auction {

    String title;
    String description;
    @Enumerated(EnumType.STRING)
    Category category;
    BigDecimal amountBuyNow;
    @Enumerated(EnumType.STRING)
    FeatureAuction featureAuction;
    Date endDate;
    int viewCount;
}
