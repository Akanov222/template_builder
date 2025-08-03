package edu.template.builder.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class HotelBookingRequest {
    private String hotelId;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private Integer guestCount;
    private Boolean includesBreakfast;
    private List<String> amenities;
    private String specialRequests;
}
