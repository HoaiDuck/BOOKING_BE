package com.example.booking.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "bookingdetail")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", columnDefinition = "NVARCHAR(36)")
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;
    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;
    @Column(name = "check_in", nullable = false)
    private LocalDateTime checkIn;
    @Column(name = "check_out" , nullable = false)
    private LocalDateTime checkOut;
    @Column(name = "guests", nullable = false, columnDefinition = "INT CHECK(guests >=1)")
    private int guests;
}
