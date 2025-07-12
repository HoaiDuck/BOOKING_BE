package com.example.booking.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "resort")
public class Resort {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "partner_id")
    private User userPartner;
    private String name;
    private String description;
    private String location;
    private String policy;
    private LocalDateTime createdAt;
}
