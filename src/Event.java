public class Event {
    private String description;
    private String timestamp;

    //Constructor
    public Event(String description, String timestamp) {
        this.description = description;
        this.timestamp = timestamp;
    }

    //Utility print method
    @Override
    public String toString(){
        return "[" + timestamp + "] " + description;
    }
}
