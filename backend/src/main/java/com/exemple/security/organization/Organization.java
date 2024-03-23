package com.exemple.security.organization;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_organization")
public class Organization {
    @Id
    @GeneratedValue
    private long organizationID;
    private String name;
    private String description;
    private String location;
    private String contactInformation;
}
