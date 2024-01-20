package observer;

import java.util.ArrayList;
import java.util.Arrays;

public class Cook implements Subject{
    private ArrayList<Observer> observers;
    private String name;
    
    public Cook(String name)
    {
        if(name != null)
            this.name = name;
        else
            this.name = "John Doe";
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void notifyObservers(String location, String description, ArrayList<String> accomplices) {
        for(Observer o : observers)
        {
            o.update(location, description, accomplices);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        // TODO Auto-generated method stub
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        // TODO Auto-generated method stub
        observers.remove(observer);
    }

    public void enterSighting(String location, String description, String accomplices)
    {
        this.notifyObservers(location, description, new ArrayList<>(Arrays.asList(accomplices.split(", "))));
    }

    public String getName()
    {
        return this.name;
    }

    
}
