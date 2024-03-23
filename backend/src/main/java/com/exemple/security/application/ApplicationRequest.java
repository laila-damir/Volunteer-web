package com.exemple.security.application;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ApplicationRequest {
    private long id;
    private String volunteerID;
    private String opportunityID;
    private String status;
}

