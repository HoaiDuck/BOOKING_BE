package com.example.booking.entities;

import com.example.booking.enums.RoomType;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "resort_id")
    private Resort resort;
    private RoomType roomType;
    private BigDecimal price;
    private int quantity;
    private String description;
}
