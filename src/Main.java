public class Main {
    public static void main(String[] args){
        FlightTracker tracker = new FlightTracker();

        //Testing storing flights in an Array List
        Flight a1 = new Flight("AA123", "JFK", "LAX", "10:30", "13:45", "On Time");
        Flight b2 = new Flight("DL456", "ATL", "ORD", "09:15", "11:00", "Delayed");
        Flight c3 = new Flight("UA789", "SFO", "SEA", "08:00", "09:45", "On Time");

        tracker.addFlight(a1);
        tracker.addFlight(b2);
        tracker.addFlight(c3);

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

        //Testing Event Logs
        Flight f1 = new Flight("AA123", "JFK", "LAX", "10:30", "13:45", "On Time");

        f1.addEvent(new Event("Boarding started", "10:00"));
        f1.addEvent(new Event("Flight delayed due to weather", "10:20"));
        f1.addEvent(new Event("Takeoff", "10:45"));
        tracker.addFlight(f1);

        tracker.showFlightLog("AA123");
        System.out.println();

        tracker.showFlightLog("AA122");



        //Testing the Priority Queue
        System.out.println("Urgent to depart: " + tracker.getNextFlight());

        //Testing User Stack Actions
        tracker.recordAction(new UserCommands("Search", "FlightNumber=AA123"));
        tracker.recordAction(new UserCommands("Filter", "Status=Delayed"));

        tracker.undoLastAction();
        tracker.undoLastAction();
        tracker.undoLastAction(); //Should output no actions to undo
*/
        //Testing Airport Graph
        AirportGraph graph = new AirportGraph();

        Airport jfk = new Airport("JFK", "John F. Kennedy International");
        Airport lax = new Airport("LAX", "Los Angeles International");
        Airport ord = new Airport("ORD", "Chicago O'Hare");
        Airport tpa = new Airport("TPA", "Tampa International Airport");
        Airport mco = new Airport("MCO", "Orlando International Airport");

        graph.addAirport(jfk);
        graph.addAirport(lax);
        graph.addAirport(ord);
        graph.addAirport(tpa);
        graph.addAirport(mco);

        graph.addRoute(jfk, lax);
        graph.addRoute(jfk, ord);
        graph.addRoute(lax, ord);
        graph.addRoute(tpa, mco);
        graph.addRoute(mco, tpa);
        graph.addRoute(jfk, tpa);
        graph.addRoute(jfk, mco);
        graph.addRoute(mco, lax);
        graph.addRoute(tpa, ord);

        graph.printRoutes();
    }
}
