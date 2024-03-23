package com.exemple.security.organization;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class OrganizationService {
    private final OrganizationRepository repository;


    public void save(OrganizationRequest request) {
        Organization organization = Organization.builder()
                .organizationID(request.getOrganizationID())
                .name(request.getName())
                .description(request.getDescription())
                .location(request.getLocation())
                .contactInformation(request.getContactInformation())
                .build();
        repository.save(organization);
    }

    public List<Organization> findAll() {
        return repository.findAll();
    }
}
