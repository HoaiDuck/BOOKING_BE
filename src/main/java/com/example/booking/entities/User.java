package com.example.booking.entities;

import com.example.booking.enums.Role;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String email;
    private String passwordHash;
    private String fullName;
    private String phone;
    private String address;
    private Role role;
    private LocalDateTime createdAt;
}
