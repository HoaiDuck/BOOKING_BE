package com.example.booking.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "discount")
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(columnDefinition = "varchar(36)")
    private UUID id;
    private String code;
    private int percent;
    private String description;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int maxUsage;
}
