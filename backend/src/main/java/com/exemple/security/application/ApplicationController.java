package com.exemple.security.application;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applications")
public class ApplicationController {
    private final ApplicationService service;

    public ApplicationController(ApplicationService service) {
        this.service = service;
    }

    @PostMapping
    public void createApplication(@RequestBody ApplicationRequest request) {
        service.save(request);
    }

    @PutMapping("/{applicationID}/status")
    public void updateStatus(@PathVariable long applicationID, @RequestParam String newStatus) {
        service.updateStatus(applicationID, newStatus);
    }

    @GetMapping
    public List<Application> getAllApplications() {
        return service.findAll();
    }

    @GetMapping("/status")
    public List<Application> getApplicationsByStatus(@RequestParam String status) {
        return service.findByStatus(status);
    }
}

