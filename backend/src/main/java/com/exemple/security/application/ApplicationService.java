package com.exemple.security.application;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ApplicationService {
    private final ApplicationRepository repository;

    public ApplicationService(ApplicationRepository repository) {
        this.repository = repository;
    }

    public void save(ApplicationRequest request) {
        Application application = Application.builder()
                .id(request.getId())
                .volunteerID(request.getVolunteerID())
                .opportunityID(request.getOpportunityID())
                .status(request.getStatus())
                .build();
        repository.save(application);
    }

    public void updateStatus(long applicationID, String newStatus) {
        Optional<Application> optionalApplication = repository.findById(applicationID);
        if (optionalApplication.isPresent()) {
            Application application = optionalApplication.get();
            application.setStatus(newStatus);
            repository.save(application);
        } else {
            throw new IllegalArgumentException("Application not found with ID: " + applicationID);
        }
    }

    public List<Application> findAll() {
        return repository.findAll();
    }

    public List<Application> findByStatus(String status) {
        return repository.findAll().stream()
                .filter(application -> application.getStatus().equalsIgnoreCase(status))
                .collect(Collectors.toList());
    }
}

