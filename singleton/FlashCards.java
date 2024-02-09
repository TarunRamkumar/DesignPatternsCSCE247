import java.util.ArrayList;
import java.util.Random;
/**
 * Object representation of flashcards with words
 * @author Tarun
 */
public class FlashCards {
    private Random rand;
    private static FlashCards flashcards;
    private ArrayList<Word> words; 
    private Word currentWord;
    /**
     * Private constructor initializes instance variables except for flashcards.
     */
    private FlashCards()
    {
        this.rand = new Random();
        this.words = new ArrayList<Word>();
        words = FileReader.getWords();
        currentWord = words.get(0);
    }
    /**
     * Gets the single instance of the class. If the instance is null, it creates a new one.
     * @return The single instance of the class
     */
    public static FlashCards getInstance()
    {
        if(flashcards == null)
            return new FlashCards();

        return flashcards;
    }
    /**
     * Randomly selects a word to display and then removes it from the list/"pile".
     * @return A random word from the list
     */
    public Word getWord()
    {
        return words.remove(rand.nextInt(words.size()));
    }
}
