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
        notes = new String();
    }


    @Override
    public void update(String location, String description, ArrayList<String> accomplices) {
        locations.add(location);
        people.addAll(accomplices);
        notes += "- " + description + "\n";


    }

    @Override
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
