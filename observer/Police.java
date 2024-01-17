package observer;

import java.util.ArrayList;
import java.util.Arrays;

public class Police implements Observer {
    private Subject cook;
    private ArrayList<String> locations;
    private String notes;
    private ArrayList<String> people;
    
    public Police(Subject cook)
    {
        this.cook = cook;
        this.locations = new ArrayList<String>();
        this.people = new ArrayList<String>();
        cook.registerObserver(this);
    }


    @Override
    public void update(String location, String description, ArrayList<String> accomplices) {
        locations.add(location);
        people.addAll(accomplices);
        notes += "\n" + description;


    }

    @Override
    public String getLog() {
        // TODO Auto-generated method stub
        
        return "Locations: \n" + locations.toString() + 
        "\nAccomplices:\n" + people.toString() + 
        "\nNotes: \n"+ notes;
    }
    
}
