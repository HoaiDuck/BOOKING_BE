package com.example.booking.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "resort_id")
    private Resort resort;
    private String comment;
    private int rating;
    private LocalDateTime createdAt;
}
