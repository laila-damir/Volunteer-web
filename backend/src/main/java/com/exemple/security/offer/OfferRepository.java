package com.exemple.security.offer;

// OpportunityRepository.java
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OfferRepository  extends JpaRepository<Offer, Integer> {

}
