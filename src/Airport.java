public class Airport {
    private String code; //Shortened version of the name
    private String name; //Use for the name of airport

    //Constructor
    public Airport(String code, String name) {
        this.code = code;
        this.name = name;
    }

    //Utility Print Method
    @Override
    public String toString(){
        return code + " - " + name;
    }

    //JIC Getters and Setters
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
