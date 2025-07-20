package com.example.booking.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "message")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", columnDefinition = "NVARCHAR(36)")
    private UUID id;
    @JoinColumn(name = "sender_id")
    @ManyToOne
    private User userSender;
    @JoinColumn(name = "receiver_id")
    @ManyToOne
    private User userReceiver;
    @Column(name = "content", columnDefinition = "TEXT")
    private String content;
    @CreationTimestamp
    @Column(name = "send_at",updatable = false)
    private LocalDateTime sentAt;

}
