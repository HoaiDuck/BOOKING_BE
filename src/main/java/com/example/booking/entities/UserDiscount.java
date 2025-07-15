package com.example.booking.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "userdiscount")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDiscount {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", columnDefinition = "NVARCHAR(36)")
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "discount_id")
    private Discount discount;
    @CreationTimestamp
    @Column(name = "used_at", updatable = false)
    private LocalDateTime usedAt;

//    @CreationTimestamp
//    @Column(name = "created_at", updatable = false, nullable = false)
//    @UpdateTimestamp
//    @Column(name = "updated_at", nullable = false)
}
