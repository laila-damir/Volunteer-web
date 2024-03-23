package com.exemple.security.offer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class OfferService {
    private final OfferRepository offerRepository;

    public void save(OfferRequest request) {
        Offer offer = Offer.builder()
                .id(request.getId())
                .title(request.getTitle())
                .description(request.getDescription())
                .location(request.getLocation())
                .dateTime(request.getDateTime())
                .duration(request.getDurationInHours())
                .skillsRequiredPreferred(request.getSkillsRequiredPreferred())
                .id(request.getOrganizationID())
                .build();
        offerRepository.save(offer);
    }

    public List<Offer> findAll() {
        return offerRepository.findAll();
    }
    static List<Offer> getAllOffers() {
        return null;
    }

    static Offer getOfferById(String id) {
        return null;
    }

    static Offer createOffer(Offer opportunity) {
        return null;
    }

    static void deleteOffer(String id) {

    }
}

