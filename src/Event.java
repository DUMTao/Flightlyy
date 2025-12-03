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

    //JIC Getters and Setters
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }


}
