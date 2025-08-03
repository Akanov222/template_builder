package edu.template.builder.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class HotelBooking {
    // Обязательные поля
    private final String hotelId;
    private final LocalDate checkInDate;
    private final LocalDate checkOutDate;

    // Опциональные поля
    private final Integer guestCount;
    private final Boolean includesBreakfast;
    private final List<String> amenities;
    private final String specialRequests;

    // Приватный конструктор
    private HotelBooking(Builder builder) {
        this.hotelId = builder.hotelId;
        this.checkInDate = builder.checkInDate;
        this.checkOutDate = builder.checkOutDate;
        this.guestCount = builder.guestCount;
        this.includesBreakfast = builder.includesBreakfast;
        this.amenities = builder.amenities;
        this.specialRequests = builder.specialRequests;
    }

    // Геттеры...

    // Статический метод для создания билдера
    public static Builder builder(String hotelId, LocalDate checkInDate, LocalDate checkOutDate) {
        return new Builder(hotelId, checkInDate, checkOutDate);
    }

    // Сам Builder
    public static final class Builder {
        // Обязательные параметры
        private final String hotelId;
        private final LocalDate checkInDate;
        private final LocalDate checkOutDate;

        // Опциональные параметры с значениями по умолчанию
        private Integer guestCount = 1;
        private Boolean includesBreakfast = false;
        private List<String> amenities = new ArrayList<>();
        private String specialRequests = "";

        // Конструктор с обязательными полями
        public Builder(String hotelId, LocalDate checkInDate, LocalDate checkOutDate) {
            this.hotelId = hotelId;
            this.checkInDate = checkInDate;
            this.checkOutDate = checkOutDate;
        }

        // Методы для опциональных параметров (каждый возвращает Builder)
        public Builder guestCount(Integer val) {
            guestCount = val;
            return this;
        }

        public Builder includesBreakfast(Boolean value) {
            includesBreakfast = value;
            return this;
        }

        public Builder amenity(String value) {
            amenities.add(value);
            return this;
        }

        public Builder specialRequests(String value) {
            specialRequests = value;
            return this;
        }

        // Метод build
        public HotelBooking build() {
            return new HotelBooking(this);
        }
    }
}