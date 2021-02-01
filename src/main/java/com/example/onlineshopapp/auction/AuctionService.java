package com.example.onlineshopapp.auction;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuctionService {

    private final AuctionRepository auctionRepository;

    public AuctionService(AuctionRepository auctionRepository) {
        this.auctionRepository = auctionRepository;
    }

    public static Auction fromAuctionEntity(AuctionEntity auctionEntity){
        return new Auction(auctionEntity.getTitle(),
                auctionEntity.getDescription(),
                auctionEntity.getCategory(),
                auctionEntity.getAmountBuyNow(),
                auctionEntity.getFeatureAuction(),
                auctionEntity.getEndDate(),
                auctionEntity.getViewCount());
    }

    public List<Auction> getAllAuction() {
        return auctionRepository.findAll().stream()
                .map(AuctionService::fromAuctionEntity)
                .collect(Collectors.toList());
    }
}
