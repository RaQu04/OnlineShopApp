package com.example.onlineshopapp.Auction;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuctionController {

    private final AuctionService auctionService;

    public AuctionController(AuctionService auctionService) {
        this.auctionService = auctionService;
    }
}
