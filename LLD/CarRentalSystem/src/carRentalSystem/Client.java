package carRentalSystem;

import java.time.LocalDate;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        RentalSystem rentalSystem=RentalSystem.getInstance();

        //Add car to the rental system
        Car car1= new Car("Toyota","Innova",2022,"AB123",50);
        Car car2= new Car("Honda","Civic",2021,"HHI78",45);
        Car car3= new Car("Ford","Mustang", 2023,"JKL567",90);
        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);
        rentalSystem.addCar(car3);

        //create customers
        Customer customer= new Customer("John","john@gmail.com","DL32");

        //Make reservations
        LocalDate startDate= LocalDate.now();
        LocalDate endDate= startDate.plusDays(3);
        List<Car> availableCars= rentalSystem.searchCars("Toyota","Innova",startDate,endDate);

        if(availableCars.isEmpty())
        {
            System.out.println("No available cars found");
        }
        else {
            Car selectedCar= availableCars.getFirst();
            Reservation reservation=rentalSystem.makeReservation(customer,selectedCar,startDate,endDate);
            if(reservation!=null)
            {
                boolean paymentSuccess= rentalSystem.processPayment(reservation);
                if(paymentSuccess)
                {
                    System.out.println("Reservation Successful.");
                }
                else {
                    System.out.println("Payment failed.Reservation cancelled.");
                    rentalSystem.cancelReservation(reservation.getReservationId());
                }
            }
            else {
                System.out.println("Selected car is not available for given date.");
            }
        }
    }
}
