package com.example.onlineshopapp.Auction;

import lombok.Value;

import java.math.BigDecimal;
import java.util.Date;

@Value
public class Auction {

    String title;
    String city;
    String category;
    Date startDate;
    Date endDate;
    BigDecimal auctionPrice;


    public static Auction fromAuctionEntity(AuctionEntity auctionEntity) {
        return new Auction(auctionEntity.getTitle(),
                auctionEntity.getCity(),
                auctionEntity.getCategory(),
                auctionEntity.getStartDate(),
                auctionEntity.getEndDate(),
                auctionEntity.getAuctionPrice());
    }
}
