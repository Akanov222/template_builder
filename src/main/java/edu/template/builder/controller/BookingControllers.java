package edu.template.builder.controller;

import edu.template.builder.dto.HotelBookingRequest;
import edu.template.builder.model.HotelBooking;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/bookings")
public class BookingControllers {

    @PostMapping
    public ResponseEntity<HotelBooking> createBooking(@RequestBody HotelBookingRequest request) {
        HotelBooking booking = HotelBooking.builder(
                    request.getHotelId(),
                    request.getCheckInDate(),
                    request.getCheckOutDate())
                .guestCount(request.getGuestCount())
                .includesBreakfast(request.getIncludesBreakfast())
                .amenity(String.valueOf(request.getAmenities()))
                .specialRequests(request.getSpecialRequests())
                .build();
        return ResponseEntity.ok(booking);

    }
}
