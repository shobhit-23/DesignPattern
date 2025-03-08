package AirlineManagementSystem;

import AirlineManagementSystem.booking.Booking;
import AirlineManagementSystem.booking.BookingManager;
import AirlineManagementSystem.flight.Flight;
import AirlineManagementSystem.flight.FlightSearch;
import AirlineManagementSystem.payment.Payment;
import AirlineManagementSystem.payment.PaymentProcessor;
import AirlineManagementSystem.seat.Seat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AirlineManagementSystem {
    private final List<Flight> flights;
    private final List<Aircraft> aircrafts;
    private final FlightSearch flightSearch;
    private final BookingManager bookingManager;
    private final PaymentProcessor paymentProcessor;

    public AirlineManagementSystem() {
        this.flights = new ArrayList<>();
        this.aircrafts = new ArrayList<>();
        this.flightSearch = new FlightSearch(flights);
        this.bookingManager = BookingManager.getInstance();
        this.paymentProcessor = PaymentProcessor.getInstance();
    }

    public void addFlight(Flight flight)
    {
        flights.add(flight);
    }
    public void addAircraft(Aircraft aircraft)
    {
        aircrafts.add(aircraft);
    }
    public List<Flight> searchFlights(String source, String destination, LocalDate date)
    {
        return flightSearch.searchFlight(source,destination,date);
    }
    public Booking bookFlight(Flight flight, Passenger passenger, Seat seat,double price)
    {
        return bookingManager.createBooking(flight,passenger,seat,price);
    }
    public void cancelBooking(String bookingNumber)
    {
        bookingManager.cancelBooking(bookingNumber);
    }
    public void processPayment(Payment payment)
    {
        paymentProcessor.processPayment(payment);
    }
}
