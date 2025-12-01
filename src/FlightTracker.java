//Import relevant libraries
import java.util.ArrayList;
import java.util.HashMap;

public class FlightTracker {
    private ArrayList<Flight> flights;
    private HashMap<String, Flight> flightHashMap; //key = flightNumber for this case

    //General constructor
    public FlightTracker(){
        flights = new ArrayList<>();
        flightHashMap = new HashMap<>();
    }

    // ----------------
    //Add Flight (Flight flight)
    // ----------------
    public void addFlight(Flight flight){
        flights.add(flight); //Add to AL
        flightHashMap.put(flight.getFlightNumber(), flight); //Add to HM
    }

    // ----------------
    // Search Flight (String Flight Number)
    // ----------------
    public Flight searchFlight(String flightNumber){
        return flightHashMap.get(flightNumber);
    }

    // ----------------
    // Show Flight Logs (String flightnumber)
    // ----------------
    public void showFlightLog(String flightNumber){
        //Create a new flight object with the user's flightnumber
        Flight f = flightHashMap.get(flightNumber);

        //Check if the flight exists
        if (f != null){
            System.out.println("Event log for flight " + f.getFlightNumber() + ":");
            f.printEvents();
        }
        else {
            System.out.println("Sorry, this flight is not in our database.");
        }
    }


    // ----------------
    // Print Flights ()
    // ----------------
    public void printFlights(){
        for (Flight f : flights){
            System.out.println(f); //Uses overriden print method
        }
    }
}
