package iterator;
import java.util.Iterator;
/**
 * TaskList iterator implementing iterator
 */
public class TaskListIterator implements Iterator {
    private Ticket[] tickets;
    private int position;
    /**
     * Creates a new iterator
     * @param tickets Tickets to add
     */
    public TaskListIterator(Ticket[] tickets)
    {
        this.tickets = tickets;
        position = 0;
    }
    /**
     * Returns true if the next ticket is not null
     */
    public boolean hasNext()
    {
        return tickets[position+1]!=null && position < tickets.length;
        
    }
    /**
     * Iterats to next list
     */
    public Ticket next()
    {
        if(hasNext()){
            position++;
            return tickets[position];
        }
        return null;
    }
}
