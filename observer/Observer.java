package observer;

import java.util.ArrayList;
/**
 * Interface that outlines the behaviors that the observers of the subject have. 
 * @author Tarun
 */
public interface Observer {
    /**
     * Updates the observers on the location, description, and accomplices of the subject. 
     * @param location String representation of the subject's location
     * @param description String description of the subject's action
     * @param accomplices ArrayList of accomplice names 
     */
    public void update(String location, String description, ArrayList<String> accomplices);
    /**
     * Gets the notes of the observers
     * @return A string representation of the observer's sightings of the subject. 
     */
    public String getLog();
}
