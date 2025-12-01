public class Main {
    public static void main(String[] args){
        FlightTracker tracker = new FlightTracker();


        //Testing storing flights in an Array List
        Flight a1 = new Flight("AA123", "JFK", "LAX", "10:30", "13:45", "On Time");
        Flight b2 = new Flight("DL456", "ATL", "ORD", "09:15", "11:00", "Delayed");

        tracker.addFlight(a1);
        tracker.addFlight(b2);

        tracker.printFlights();
        System.out.println();
/*
        //Test Searching in the HashMap
        Flight x = tracker.searchFlight("AA123");
        Flight y = tracker.searchFlight("AA122");
        if (x != null) {
            System.out.println("Found Flight: " + x);
        }
        else {
            System.out.println("Sorry, that flight is not in out database.");
        }

        if (y != null) {
            System.out.println("Found Flight: " + y);
        }
        else {
            System.out.println("Sorry, that flight is not in out database.");
        }
*/
        //Testing Event Logs
        Flight f1 = new Flight("AA123", "JFK", "LAX", "10:30", "13:45", "On Time");

        f1.addEvent(new Event("Boarding started", "10:00"));
        f1.addEvent(new Event("Flight delayed due to weather", "10:20"));
        f1.addEvent(new Event("Takeoff", "10:45"));
        tracker.addFlight(f1);

        tracker.showFlightLog("AA123");
        System.out.println();

        tracker.showFlightLog("AA122");
    }
}
