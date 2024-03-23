package com.exemple.security.application;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_application")
public class Application {
    @Id
    @GeneratedValue
    private long id;
    private String volunteerID;
    private String opportunityID;
    private String status;
}
