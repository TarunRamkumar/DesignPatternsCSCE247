package spelling;
import java.util.ArrayList;
import java.util.Random;
public abstract class State {
    protected SpellingList spellingList;
    private ArrayList<String> words;
    private Random rand;

    public State(SpellingList spellingList)
    {
        this.spellingList = spellingList;
    }

    public String getNextWord()
    {
        return spellingList.getNextWord();
    }

    public abstract void increaseGrade();
    public abstract void decreaseGrade();
    

    
}
