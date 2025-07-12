package com.example.booking.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @JoinColumn(name = "sender_id")
    @ManyToOne
    private User userSender;
    @JoinColumn(name = "receiver_id")
    @ManyToOne
    private User userReceiver;
    private String content;
    private LocalDateTime sentAt;

}
