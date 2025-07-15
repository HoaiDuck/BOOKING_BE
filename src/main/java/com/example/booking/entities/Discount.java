package com.example.booking.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "discount")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", columnDefinition = "NVARCHAR(36)")
    private UUID id;
    @Column(name = "code", columnDefinition = "NVARCHAR(5)", nullable = false, unique = true)
    private String code;
    @Column(name = "percent", columnDefinition = "INT CHECK (percent >=1 AND percent <=100)", nullable = false)
    private int percent;
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;
    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;
    @Column(name = "end_date", nullable = false)
    private LocalDateTime endDate;
    @Column(name = "max_usage", columnDefinition = "INT CHECK (max_usage >= 1)")
    private int maxUsage;
}
