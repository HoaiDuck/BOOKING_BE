package com.example.booking.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "images")
public class Images {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

}
