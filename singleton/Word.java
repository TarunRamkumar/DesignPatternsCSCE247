/**
 * A word and its type, definition, and an example sentence.
 * @author Tarun 
 */
public class Word {
    private String word;
    private String type;
    private String definition;
    private String sentence;
    /**
     * Creates a new word and its corresponding attributes
     * @param word The word itself
     * @param type The part of speech of the word
     * @param definition The definition of the word
     * @param sentence An example sentence using the word
     */
    public Word(String word, String type, String definition, String sentence)
    {
        if(word != null)
            this.word = word;
        else
            this.word = "None";

        if(type != null)
            this.type = type;
        else
            this.type = "None";

        if(definition != null)
            this.definition = definition;
        else
            this.definition = "None";
        
        if(sentence != null)
            this.sentence = sentence;
        else
            this.sentence = "None";
            
    }
    /**
     * Gets a string representation of the word
     * @return The word
     */
    public String getWord()
    {
        return this.word;
    }
    /**
     * Creates the "back" of the flashcard; creates a formatted output of the word's part of speech, definition, and example sentence.
     * @return A string representation of the "back" of a flashcard. 
     */
    public String getDescription()
    {
        return "Part of Speech: " + type + "\nDefinition: " +definition + " \n"+ sentence;
    }
}
