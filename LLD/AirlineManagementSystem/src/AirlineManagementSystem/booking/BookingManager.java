package AirlineManagementSystem.booking;

import AirlineManagementSystem.Passenger;
import AirlineManagementSystem.flight.Flight;
import AirlineManagementSystem.seat.Seat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class BookingManager {
    private static BookingManager instance;
    private final Map<String,Booking> bookings;
    private final Object lock= new Object();
    private final AtomicInteger bookingCounter= new AtomicInteger();

    public BookingManager() {
        this.bookings = new ConcurrentHashMap<>();
    }

    public static synchronized BookingManager getInstance()
    {
        if(instance==null)
            instance=new BookingManager();
        return instance;
    }

    public Booking createBooking(Flight flight, Passenger passenger, Seat seat,double price)
    {
        String bookingNumber= generateBookingNumber();
        Booking booking= new Booking(bookingNumber,flight,passenger,seat,price);
        synchronized (lock)
        {
            bookings.put(bookingNumber,booking);
        }
        return booking;
    }
    public void cancelBooking(String bookingNumber)
    {
        synchronized (lock)
        {
            Booking booking=bookings.get(bookingNumber);
            booking.cancel();
        }
    }

    private String generateBookingNumber(){
        int bookingId=bookingCounter.incrementAndGet();
        String timestamp= LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyydMMddHHmmss"));
        return "BKG"+ timestamp + String.format("%06d",bookingId);
    }
}
