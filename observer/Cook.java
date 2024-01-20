package observer;

import java.util.ArrayList;
import java.util.Arrays;
/**
 *  A drug cook
 * @author Tarun
 */
public class Cook implements Subject{
    private ArrayList<Observer> observers;
    private String name;
    /**
     * Creates a new drug cook
     * @param name The name of the cook
     */
    public Cook(String name)
    {
        if(name != null)
            this.name = name;
        else
            this.name = "John Doe";
        this.observers = new ArrayList<Observer>();
    }

    @Override
    /**
     * Notifies the registered observers of the cook of the cook's location, description of action, and accomplices.
     * @param location String representation of the cook's location
     * @param description String description of the cook's action
     * @param accomplices ArrayList of String names of accomplices
     *
     */
    public void notifyObservers(String location, String description, ArrayList<String> accomplices) {
        for(Observer o : observers)
        {
            o.update(location, description, accomplices);
        }
    }

    @Override
    /**
     * Adds new observers of the cook
     * @param observer The observer object to be added/registered
     */
    public void registerObserver(Observer observer) {
        // TODO Auto-generated method stub
        observers.add(observer);

    }

    @Override
    /**
     * Removes the given observer from the cook's list of observers
     * @param observer The observer object to be removed
     */
    public void removeObserver(Observer observer) {
        // TODO Auto-generated method stub
        observers.remove(observer);
    }
    /**
     * Notifies registered observers of the cook's location, description of action, and accomplices they were with 
     * @param location String representation of the cook's location
     * @param description String description of the cook's action
     * @param accomplices String that lists names of accomplices with the cook 
     */
    public void enterSighting(String location, String description, String accomplices)
    {
        notifyObservers(location, description, new ArrayList<>(Arrays.asList(accomplices.split(", "))));
    }
    /**
     * The name of the cook
     * @return A string representation of the cook's name. 
     */
    public String getName()
    {
        return this.name;
    }

    
}
