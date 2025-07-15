package com.example.booking.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "resort")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Resort {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", columnDefinition = "NVARCHAR(36)")
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "partner_id")
    private User userPartner;
    @Column(name = "name", columnDefinition = "NVARCHAR(255)")
    private String name;
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;
    @Column(name = "location", columnDefinition = "NVARCHAR(255)")
    private String location;
    @Column(name = "policy", columnDefinition = "TEXT")
    private String policy;
    @CreationTimestamp
    @Column(name = "create_at", updatable = false)
    private LocalDateTime createdAt;
}
