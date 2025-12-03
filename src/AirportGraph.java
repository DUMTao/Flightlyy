//Importing relevant libraries
import java.util.*;

public class AirportGraph {
    private Map<Airport, Set<Airport>> routes;

    //Constructor
    public AirportGraph() {
        routes = new HashMap<>();
    }

    // ----------------
    // Add Airport (Airport airport)
    // ----------------
    public void addAirport(Airport airport){
        routes.putIfAbsent(airport, new HashSet<>());
    }

    // ----------------
    // Add Route (Airport from, Airport to)
    // ----------------
    public void addRoute(Airport from, Airport to){
        routes.get(from).add(to);
        routes.get(to).add(from); //Conditional addition if they're connected bidirectionally
    }

    // ----------------
    // Print Routes ()
    // ----------------
    public void printRoutes(){
        for (Airport a : routes.keySet()){
            System.out.print(a + " -> ");

            //Iterate through the destination codes from a
            for (Airport destination : routes.get(a)){
                System.out.print(destination.getCode() + " ");
            }
            System.out.println(); //Formatting things
        }
    }

    //Necessary Getters and Setters guys
    public Map<Airport, Set<Airport>> getRoutes() {
        return routes;
    }

    public void setRoutes(Map<Airport, Set<Airport>> routes) {
        this.routes = routes;
    }
}
