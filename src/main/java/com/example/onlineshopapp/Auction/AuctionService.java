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
                        auction.getTitle(),
                        auction.getCategory(),
                        auction.getCity(),
                        auction.getStartDate(),
                        auction.getEndDate(),
                        auction.getAuctionPrice()));
        return auctionEntity.getId();
    }
}

