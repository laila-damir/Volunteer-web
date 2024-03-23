package com.exemple.security.offer;

import jakarta.persistence.ElementCollection;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder

public class OfferRequest {
    private long id;
    private String title;
    private String description;
    private String location;
    private Date dateTime;
    private int durationInHours;
    @ElementCollection
    private List<String> skillsRequiredPreferred;
    private long organizationID;
}
