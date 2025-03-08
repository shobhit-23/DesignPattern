package AirlineManagementSystem;

import AirlineManagementSystem.booking.Booking;
import AirlineManagementSystem.flight.Flight;
import AirlineManagementSystem.seat.Seat;
import AirlineManagementSystem.seat.SeatType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        AirlineManagementSystem airlineManagementSystem=new AirlineManagementSystem();

        //user
        Passenger passenger=new Passenger("U001","Radha","radha@gmail.com","12930932");

        //flights creation
        LocalDateTime departureTime1=LocalDateTime.now().plusDays(1);
        LocalDateTime arrivalTime1= departureTime1.plusHours(2);
        Flight flight1=new Flight("F001","Delhi","Blr",arrivalTime1,departureTime1);

        LocalDateTime departureTime2=LocalDateTime.now().plusDays(3);
        LocalDateTime arrivalTime2= departureTime1.plusHours(1);
        Flight flight2=new Flight("F001","Delhi","Lko",arrivalTime1,departureTime1);

        airlineManagementSystem.addFlight(flight1);
        airlineManagementSystem.addFlight(flight2);

        //create aircrafts
        Aircraft aircraft1= new Aircraft("A001","AirBus A380", 300);
        airlineManagementSystem.addAircraft(aircraft1);

        //search flights
        List<Flight> searchResult= airlineManagementSystem.searchFlights("Delhi","Blr", LocalDate.now().plusDays(1));
        System.out.println("Search Result");
        for(Flight flight:searchResult)
        {
            System.out.println("Flight: "+flight.getFlightNumber()+" - "+flight.getSource()+" to "+flight.getDestination());
        }

        //seats
        Seat seat= new Seat("2A", SeatType.ECONOMY);

        //Book flight
        Booking booking=airlineManagementSystem.bookFlight(flight1,passenger,seat,199);
        if(booking!=null)
            System.out.println("Booking successful. Booking id :"+booking.getBookingNumber());
        else
            System.out.println("Oops! Booking Falied.");

        //Cancel a booking
        airlineManagementSystem.cancelBooking(booking.getBookingNumber());
        System.out.println("Booking Cancelled.");

    }
}
