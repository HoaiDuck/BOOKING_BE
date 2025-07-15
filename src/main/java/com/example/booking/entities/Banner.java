package com.example.booking.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "banner")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id",columnDefinition = "NVARCHAR(36)")
    private UUID id;
    @Column(name = "title",columnDefinition = "NVARCHAR(255)")
    private String title;
    @Column(name = "imageUrl", columnDefinition = "TEXT")
    private String imageUrl;
    @ManyToOne
    @JoinColumn(name = "resort_id")
    private Resort resort;
    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;
    @Column(name = "end_date", nullable = false)
    private LocalDateTime endDate;
}
