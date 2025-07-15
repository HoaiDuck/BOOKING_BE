package com.example.booking.entities;

import com.example.booking.enums.Status;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "booking")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", columnDefinition = "NVARCHAR(36)")
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "resort_id")
    private Resort resort;
    @Column(name = "total_price", precision =  10, scale = 2)
    private BigDecimal totalPrice;
    @Column(name = "status", nullable = false)
    private Status status;
    @CreationTimestamp
    @Column(name = "create_at",updatable = false)
    private LocalDateTime createdAt;
}
