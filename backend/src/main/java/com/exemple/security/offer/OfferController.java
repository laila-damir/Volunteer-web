package com.exemple.security.offer;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/offers")
@RequiredArgsConstructor
public class OfferController {

    private final OfferService offerService;

    @GetMapping
    public ResponseEntity<List<Offer>> getAllOffers() {
        List<Offer> opportunities = OfferService.getAllOffers();
        return new ResponseEntity<>(opportunities, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Offer> getOfferById(@PathVariable("id") String id) {
        Offer opportunity = OfferService.getOfferById(id);
        if (opportunity != null) {
            return new ResponseEntity<>(opportunity, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public  static ResponseEntity<Offer> createOpportunity(@RequestBody Offer opportunity) {
        Offer createdOpportunity = OfferService.createOffer(opportunity);
        return new ResponseEntity<>(createdOpportunity, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public static ResponseEntity<Void> deleteOpportunity(@PathVariable("id") String id) {
        OfferService.deleteOffer(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

