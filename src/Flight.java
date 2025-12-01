import java.util.LinkedList;

public class Flight {
    private String flightNumber;
    private String originAirport;
    private String destinationAirport;
    private String departureTime;
    private String arrivalTime;
    private String status; //This will be used for "On Time", "Delayed", "Cancelled" etc
    private LinkedList<Event> eventLog;

    //Constructor
    public Flight(String flightNumber, String originAirport, String destinationAirport, String departureTime, String arrivalTime, String status) {
        this.flightNumber = flightNumber;
        this.originAirport = originAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.status = status;

        this.eventLog = new LinkedList<>();
    }

    //Utility print method
    @Override
    public String toString(){
        return flightNumber + " | " + originAirport + " -> " + destinationAirport +
                " | Departure @: " + departureTime + " | Arrival @: " + arrivalTime +
                " | Status: " + status;
    }

    // ----------------
    //Add Event (Event event)
    // ----------------
    public void addEvent(Event event){
        eventLog.add(event);
    }

    // ----------------
    // Print Events ()
    // ----------------
    public void printEvents(){
        for (Event e : eventLog){
            System.out.println(e);
        }
    }

    //Helluva Getters and Setters
    public String getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOriginAirport() {
        return originAirport;
    }
    public void setOriginAirport(String originAirport) {
        this.originAirport = originAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }
    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getStatus() {
        return status;
    }

    //This one is really the only important one ngl
    public void setStatus(String status) {
        this.status = status;
    }

}
