package com.exemple.security.organization;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class OrganizationRequest {
    private long organizationID;
    private String name;
    private String description;
    private String location;
    private String contactInformation;
}
