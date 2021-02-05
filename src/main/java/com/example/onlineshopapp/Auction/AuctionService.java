package com.example.onlineshopapp.Auction;

import org.springframework.stereotype.Service;

@Service
public class AuctionService {

    private final AuctionRepository auctionRepository;

    public AuctionService(AuctionRepository auctionRepository) {
        this.auctionRepository = auctionRepository;
    }

    public Long createUserEntityFromClientAndGetId(Auction auction) {
        final AuctionEntity auctionEntity = auctionRepository.save
                (new AuctionEntity(null,
                        auction.getAuctionTitle(),
                        auction.getAuctionCategory(),
                        auction.getAuctionCity(),
                        auction.getAuctionStartDate(),
                        auction.getAuctionEndDate(),
                        auction.getAuctionPriceMinimal(),
                        auction.getAuctionPriceBuyNow(),
                        auction.getAuctionVisitors(),
                        auction.getAuctionUserPremium(),
                        auction.getAuctionDescription()));
        return auctionEntity.getId();
    }
}

