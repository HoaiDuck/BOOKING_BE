package com.example.booking.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "banner")
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String title;
    private String imageUrl;
    @ManyToOne
    @JoinColumn(name = "resort_id")
    private Resort resort;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
