package observer;

import java.util.ArrayList;
/**
 *  A drug cartel that observes the drug cook/boss
 * @author Tarun
 */
public class Cartel implements Observer{
    private Subject cook;
    private ArrayList<Sighting> sightings;
    /**
     * Creates a new Cartel object, creating a new ArrayList of sightings and registering the Cartel as an observer of the given cook.
     * @param cook The drug cook that the Cartel will observe. 
     */
    public Cartel(Subject cook)
    {
        this.cook = cook;
        sightings = new ArrayList<Sighting>();
        cook.registerObserver(this);
    }
    /**
     * Updates the Cartel on a sighting of the cook.
     * @param location String representation of the location of the cook
     * @param description String description of the sighting of the cook
     * @param accomplices ArrayList of String representations of accomplice names
     */
    @Override
    public void update(String location, String description, ArrayList<String> accomplices) {
        // TODO Auto-generated method stub
        sightings.add(new Sighting(location, description,accomplices));
    }

    @Override
    /**
     * Returns a String that contains all the sightings the Cartel has of the Cook
     * @return A string representation of the list of sightings of the cook
     */
    public String getLog() {
        // TODO Auto-generated method stub
        String log = new String();
        for(Sighting s : sightings)
        {
            
            log+= s.getLocation() + " (" + s.getDetails() + "), with" + s.getAccomplices() + "\n";
           
        }
        return log;
    }
    
}
