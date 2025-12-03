//Import relevant libraries
import java.util.ArrayList;
import java.util.HashMap;

import java.util.PriorityQueue;
import java.util.Comparator;

import java.util.Stack;


public class FlightTracker {
    private ArrayList<Flight> flights;
    private HashMap<String, Flight> flightHashMap; //key = flightNumber for this case
    private PriorityQueue<Flight> priorityFlights; //Sorted by urgency and departure time
    private Stack<UserCommands> userHistory;

    //General constructor
    public FlightTracker(){
        flights = new ArrayList<>();
        flightHashMap = new HashMap<>();

        //Compares the priority queue based on departureTime int and urgent flights
        priorityFlights = new PriorityQueue<>((f1, f2) -> {
            //If one flight is delayed and the others are not, delayed comes first
            //Check if the first is delayed and the other isn't
            if (f1.getStatus().equals("Delayed") && !(f2.getStatus().equals("Delayed"))){
                return -1; //Place f1 in front of f2
            }
            else if (!f1.getStatus().equals("Delayed") && f2.getStatus().equals("Delayed")){
                return 1; //Place f2 in front of f1
            }

            //Else they're equal therefore; compare by departure time
            return f1.getDepartureTime().compareTo(f2.getDepartureTime());
        });

        userHistory = new Stack<>();
    }

    // ----------------
    //Add Flight (Flight flight)
    // ----------------
    public void addFlight(Flight flight){
        flights.add(flight); //Add to AL
        flightHashMap.put(flight.getFlightNumber(), flight); //Add to HM
        priorityFlights.add(flight); //Add to PQ
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
    // Get Next Flight ()
    // ----------------
    public Flight getNextFlight(){
        return priorityFlights.peek(); // Get the highest priority departure
    }

    // ----------------
    // Record Action (UserHistory action)
    // ----------------
    public void recordAction(UserCommands action){
        userHistory.push(action); //Add the action onto the stack of commands
    }

    // ----------------
    // Undo Last Action ()
    // ----------------
    public void undoLastAction(){
        //Check if the stack 'userHistory' is not empty
        if (!userHistory.isEmpty()){
            UserCommands last = userHistory.pop(); //Take the tip of the stack
            System.out.println("Undo: " + last);
        }
        //Else there's no actions to undo
        else {
            System.out.println("No action to undo.");
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
