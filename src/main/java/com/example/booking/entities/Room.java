package com.example.booking.entities;

import com.example.booking.enums.RoomType;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "room")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", columnDefinition = "NVARCHAR(36)")
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "resort_id")
    private Resort resort;
    @Column(name = "room_type", nullable = false)
    private RoomType roomType;
    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    private BigDecimal price;
    @Column(name = "quantity", nullable = false)
    private int quantity;
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;
}
