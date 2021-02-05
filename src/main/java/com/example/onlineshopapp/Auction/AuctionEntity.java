package com.example.onlineshopapp.Auction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity(name ="Users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuctionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
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

}