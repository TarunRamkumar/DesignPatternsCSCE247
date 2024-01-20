package observer;

import java.util.ArrayList;

public class Cartel implements Observer{
    private Subject cook;
    private ArrayList<Sighting> sightings;

    public Cartel(Subject cook)
    {
        this.cook = cook;
        sightings = new ArrayList<Sighting>();
        cook.registerObserver(this);
    }
    @Override
    public void update(String location, String description, ArrayList<String> accomplices) {
        // TODO Auto-generated method stub
        sightings.add(new Sighting(location, description,accomplices));
    }

    @Override
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
