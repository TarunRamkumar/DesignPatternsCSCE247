package spelling;
/**
 * The program's hardest state
 * @author Tarun
 */
public class ThirdGradeState extends State {
    /**
     * Creates a new ThirdGradeState
     * @param spellingList The spellingList to apply the state to
     */
    public ThirdGradeState(SpellingList spellingList)
    {
        super(spellingList);
        this.words = FileReader.getWords("spelling\\third.txt");
    }
    /**
     * Prints an error message as this is the highest grade 
     */
    public void increaseGrade()
    {
        System.out.println("Sorry, you are already at the highest level. Cannot increase further.");
    }
    /**
     * Sets the state of the spellingList to the secondGrade
     */
    public void decreaseGrade()
    {
        spellingList.setState(spellingList.getSecondGradeState());
    }
}
