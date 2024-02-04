package spelling;

    /**
     * The programs second easiest state
     * @author Tarun
     */
public class SecondGradeState extends State {
    /**
     * Creates a new second grade state object
     * @param spellingList The spellingList the state should be applied to
     */
    public SecondGradeState(SpellingList spellingList)
    {
        super(spellingList);
        this.words = FileReader.getWords("spelling\\second.txt");
    }
    /**
     * Increases the state of the spellingList to the third grade
     */
    public void increaseGrade()
    {
        spellingList.setState(spellingList.getThirdGradeState());
    }
    /**
     * Decreases the state of the spellingList to the first grade
     */
    public void decreaseGrade()
    {
        spellingList.setState(spellingList.getFirstGradeState());
    }
}
