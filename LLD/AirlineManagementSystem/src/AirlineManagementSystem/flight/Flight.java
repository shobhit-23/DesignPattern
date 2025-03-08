package AirlineManagementSystem.flight;

import AirlineManagementSystem.seat.Seat;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Flight {
    private final String flightNumber;
    private final String source;
    private final String destination;
    private final LocalDateTime departureTime;
    private final LocalDateTime arrivalTime;
    private final List<Seat> availableSeats;

    public Flight(String flightNumber, String source, String destination, LocalDateTime arrivalTime, LocalDateTime departureTime) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.availableSeats = new ArrayList<>();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getSource() {
        return source;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public List<Seat> getAvailableSeats() {
        return availableSeats;
    }
}
