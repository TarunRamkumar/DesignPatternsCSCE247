package spelling;
/**
 * Program's easiest state
 * @author Tarun
 */
public class FirstGradeState extends State {
    /**
     * Creates a new FirstGradeState
     * @param spellingList The spellingList the state should be applied to
     */
    public FirstGradeState(SpellingList spellingList)
    {

        super(spellingList);
        this.words = FileReader.getWords("spelling\\first.txt");
    }
    /**
     * Increases the state of the spellingList to the SecondGrade
     */
    public void increaseGrade()
    {
        spellingList.setState(spellingList.getSecondGradeState());
    }
    /**
     * Prints an error message as the state cannot be decreased further
     */
    public void decreaseGrade()
    {
        System.out.println("Sorry, you are already at the lowest level. Cannot decrease further.");
    }
}
