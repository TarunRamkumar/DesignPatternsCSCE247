package observer;

import java.util.ArrayList;

public class Sighting {
    private String location;
    private String details;
    private ArrayList<String> accomplices;
    
    public Sighting(String location, String details, ArrayList<String> accomplices)
    {
        if(location != null)
            this.location = location;
        else
            this.location = "none";
        
        if(details != null)
            this.details = details;
        else
            this.details = "none";
        
        this.accomplices = accomplices;
    
    }

    public String getLocation()
    {
        return location;
    }

    public String getDetails()
    {
        return details;
    }

    public String getAccomplices()
    {
        return accomplices.toString().replace("["," ").replace("]"," ");
    }
}
