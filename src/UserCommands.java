public class UserCommands {
    private String actionType; // "search', "filter"
    private String details; //Flight number searching

    //Constructor
    public UserCommands(String actionType, String details) {
        this.actionType = actionType;
        this.details = details;
    }

    //Utility Print Method for user actions
    @Override
    public String toString(){
        return actionType + " -> " + details;
    }

    //JIC Getters and Setters
    public String getActionType() {
        return actionType;
    }
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }


}
