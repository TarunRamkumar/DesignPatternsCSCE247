package observer;
import java.util.ArrayList;
/**
 * Interface describing the behaviors the cook should have. 
 * @author Tarun
 */
public interface Subject {
    /**
     * Adds a new observer to the subject
     * @param observer The observer that is being added to follow the subject
     */
    public void registerObserver(Observer observer);
    /**
     * Removes an observer from following the subject
     * @param observer The observer to be removed 
     */
    public void removeObserver(Observer observer);
    /**
     * Notifies the observers of the subject's location, description, accomplices. 
     * @param location The location of the subject
     * @param description A description of the subject's action
     * @param accomplices The people the subject were with. 
     */
    public void notifyObservers(String location, String description, ArrayList<String> accomplices);
}
