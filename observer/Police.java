package observer;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * The police chasing the Drug Cartels and Cooks
 * @author Tarun
 */
public class Police implements Observer {
    private Subject cook;
    private ArrayList<String> locations;
    private String notes;
    private ArrayList<String> people;
    /**
     * Creates a new Police object.
     * @param cook The cook the police are following
     */
    public Police(Subject cook)
    {
        this.cook = cook;
        this.locations = new ArrayList<String>();
        this.people = new ArrayList<String>();
        cook.registerObserver(this);
        notes = new String();
    }


    @Override
    /**
     * Updates the police on the location, description, and accomplices of the cook they are following. 
     * @param location String representation of the cook's location
     * @param description String description of the cook's action
     * @param accomplices ArrayList of accomplice names 
     */
    public void update(String location, String description, ArrayList<String> accomplices) {
        locations.add(location);
        people.addAll(accomplices);
        notes += "- " + description + "\n";
    }

    @Override
    /**
     * The information the police have on the cook they are following.
     * @return A string representation of the police's sightings of the cook. 
     */
    public String getLog() {
        // TODO Auto-generated method stub
        for(int i = 0; i < people.size()-1; i++)
        {
            for(int j = i+1; j < people.size();j++)
            {
                if(people.get(i).equals(people.get(j)))
                {
                    people.remove(j);
                    
                }
            }
        }
        String loc = new String(); 
        String peop = new String();
        for(String l : locations)
        {
            loc += "- " + locations.get(locations.indexOf(l)) + "\n";
        }
        for(String p : people)
        {
            peop += "- " + people.get(people.indexOf(p)) + "\n";
        }
        return "Locations: \n" + loc +
        "\nNotes:\n"+ notes +  
        "\nAccomplices:\n" + peop;
        
    }
    
}
