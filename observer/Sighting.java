package observer;

import java.util.ArrayList;
/**
 * Object representation of a sighting of the cook.
 * @author Tarun
 */
public class Sighting {
    private String location;
    private String details;
    private ArrayList<String> accomplices;
    /**
     * Creates a new sighting.
     * @param location The location that the cook was seen at.
     * @param details The details of the action the cook was doing.
     * @param accomplices The people that the cook was with.
     */
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
    /**
     * Gets the location of the sighting.
     * @return Returns a string representation of the location the sighting was at.
     */
    public String getLocation()
    {
        return location;
    }
    /**
     * Gets the details of the sighting.
     * @return A string representation/description of the details of the encounter witnessed .
     */
    public String getDetails()
    {
        return details;
    }
    /**
     * Lists the accomplices that were with the cook at the time of the sighting.
     * @return A string representation of the list of accomplices at the sighting with the cook. 
     */
    public String getAccomplices()
    {
        return accomplices.toString().replace("["," ").replace("]"," ");
    }
}
