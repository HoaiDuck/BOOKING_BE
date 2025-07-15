package com.example.booking.entities;

import com.example.booking.enums.Role;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.zip.CheckedOutputStream;

@Entity
@Table(name = "user")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", columnDefinition = "NVARCHAR(36)")
    private UUID id;
    @Column(name = "email", columnDefinition = "TEXT")
    private String email;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "full_name", columnDefinition = "NVARCHAR(100)")
    private String fullName;
    @Column(name = "phone", length = 10,  nullable = false)
    private String phone;
    @Column(name = "address", columnDefinition = "NVARCHAR(100)")
    private String address;
    @Column(name = "role", nullable = false)
    private Role role;
    @CreationTimestamp
    @Column(name = "create_at", updatable = false)
    private LocalDateTime createdAt;
}
