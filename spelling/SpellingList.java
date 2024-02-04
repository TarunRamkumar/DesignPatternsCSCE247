package spelling;
/**
 * A spellingList of words
 * @author Tarun
 */
public class SpellingList {
    private State state;
    private FirstGradeState firstGradeState;
    private SecondGradeState secondGradeState;
    private ThirdGradeState thirdGradeState;
    /**
     * Creates a new spellingList at the easiest state
     */
    public SpellingList()
    {
        state = firstGradeState = new FirstGradeState(this);
        secondGradeState = new SecondGradeState(this);
        thirdGradeState = new ThirdGradeState(this);
    }
    /**
     * Randomly generates the next word to be spelled
     * @return A string word from the list
     */
    public String getNextWord()
    {
        return state.getNextWord();
    }
    /**
     * Increases the difficulty of the list
     */
    public void increaseGrade()
    {
        state.increaseGrade();
    }
    /**
     * Decreases the difficulty of the list
     */
    public void decreaseGrade()
    {
        state.decreaseGrade();
    }
    /**
     * Gets the object's firstGradeState
     * @return The firstGradeState object
     */
    public State getFirstGradeState()
    {
        return this.firstGradeState;
    }
    /**
     * Gets the object's secondGradeState
     * @return The secondGradeState object
     */
    public State getSecondGradeState()
    {
        return this.secondGradeState;
    }
    /**
     * Gets the object's secondGradeState
     * @return The secondGradeState object
     */
    public State getThirdGradeState()
    {
        return this.thirdGradeState;
    }
    /**
     * Changes the state of the spellingList
     * @param state The state to be applied to the list
     */
    public void setState(State state)
    {
        this.state = state;
    }
}
