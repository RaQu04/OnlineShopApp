package com.example.onlineshopapp.auction;

import lombok.Value;

import java.math.BigDecimal;
import java.util.Date;

@Value
public class Auction {

    String title;
    String description;
    Category category;
    BigDecimal amountBuyNow;
    FeatureAuction featureAuction;
    Date endDate;
    int viewCount;
}
