package com.example.onlineshopapp.mock;

import com.example.onlineshopapp.auction.AuctionEntity;
import com.example.onlineshopapp.auction.AuctionRepository;
import com.example.onlineshopapp.auction.Category;
import com.example.onlineshopapp.auction.FeatureAuction;
import com.example.onlineshopapp.user.*;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;

@Service
public class MockData {

    private final UserRepository userRepository;
    private final AuctionRepository auctionRepository;

    public MockData(UserRepository userRepository, AuctionRepository auctionRepository) {
        this.userRepository = userRepository;
        this.auctionRepository = auctionRepository;
    }

    @PostConstruct
    public void mockData(){

        UserEntity userEntity = new UserEntity(
                null,
                "John",
                "Snow",
                "john123",
                "jon123",
                new Address("ul. Testowa 12", "Poznań", "12-123", "Poland"),
                Date.from(Instant.now()),
                Status.ACTIVE,
                TypeAccount.NORMAL);
        userRepository.save(userEntity);

        AuctionEntity auctionEntity = new AuctionEntity(
                null,
                "Laptop Dell",
                "Mam na sprzedaż laptopa",
                Category.ELEKTRONIKA,
                BigDecimal.valueOf(100),
                BigDecimal.valueOf(200),
                FeatureAuction.NO,
                "Kalisz",
                Date.from(Instant.now()),
                Date.from(Instant.now()),
                0
        );

        auctionRepository.save(auctionEntity);

    }
}
