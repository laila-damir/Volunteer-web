package com.exemple.security.organization;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/organizations")
@RequiredArgsConstructor
public class OrganizationController {
    private final OrganizationService service;


    @PostMapping
    public ResponseEntity<?> save(
            @RequestBody OrganizationRequest request
    ) {
        service.save(request);
        return ResponseEntity.accepted().build();
    }
    @GetMapping
    public ResponseEntity<List<Organization>> findAllBooks() {
        return ResponseEntity.ok(service.findAll());
    }
}

