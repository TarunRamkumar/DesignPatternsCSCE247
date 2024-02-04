package spelling;
import java.util.ArrayList;
import java.util.Random;
/**
 * The state of the spellingList
 * @author Tarun
 */
public abstract class State {
    protected SpellingList spellingList;
    protected ArrayList<String> words;
    private Random rand;
    /**
     * Creates a new state
     * @param spellingList The spellingList the state should be applied to
     */
    public State(SpellingList spellingList)
    {
        this.spellingList = spellingList;
        words = new ArrayList<String>();
        rand = new Random();
    }
    /**
     * Randomly generates a word from the word list
     * @return A random string word
     */
    public String getNextWord()
    {
        return words.get(rand.nextInt(words.size()));
    }
    /**
     * Increases/Decreases the grades in the children
     */
    public abstract void increaseGrade();
    public abstract void decreaseGrade();
    

    
}
