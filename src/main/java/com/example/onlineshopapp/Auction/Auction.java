package com.example.onlineshopapp.Auction;

import lombok.Value;

import java.math.BigDecimal;
import java.util.Date;

@Value
public class Auction {

    String auctionTitle;
    String auctionCity;
    String auctionCategory;
    Date auctionStartDate;
    Date auctionEndDate;
    BigDecimal auctionPriceMinimal;
    BigDecimal auctionPriceBuyNow;
    Long auctionVisitors;
    Boolean auctionUserPremium;
    String auctionDescription;


    public static Auction fromAuctionEntity(AuctionEntity auctionEntity) {
        return new Auction(auctionEntity.getAuctionTitle(),
                auctionEntity.getAuctionCity(),
                auctionEntity.getAuctionCategory(),
                auctionEntity.getAuctionStartDate(),
                auctionEntity.getAuctionEndDate(),
                auctionEntity.getAuctionPriceMinimal(),
                auctionEntity.getAuctionPriceBuyNow(),
                auctionEntity.getAuctionVisitors(),
                auctionEntity.getAuctionUserPremium(),
                auctionEntity.getAuctionDescription()
                );
    }
}
