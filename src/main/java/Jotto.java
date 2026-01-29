import java.util.ArrayList;

public class Jotto(){

    private final int WORD_SIZE = 5;
    private String currentWord = "";
    private int score;
    ArrayList<String> playGuesses = new ArrayList<String>();
    ArrayList<String> playWords = new ArrayList<String>();
    private string filename;
    ArrayList<String> wordList = new ArrayList<String>();
    private final boolean DEBUG = true;

    public Jotto(String filename){
        this.filename = filename;
        readWords();
    }

    public boolean pickWord(){

    }
    public String showWordList(){

    }
    public ArrayList<String> showPlayerGuesses(){

    }
    public void playerGuessScores(ArrayList<String>){

    }
    public void setCurrentWord(String word){
        this.currentWord = word;
    }
    public ArrayList<String> readWords(){

    }
    public void play(){

    }
    public int guess(){

    }
    public ArrayList<String> getPlayedWords() {
        return playWords;
    }
    public String getCurrentWord(){
        return currentWord;
    }
    public int getLetterCount(String word){
        return word.length();
    }
    public String showPlayedWords(){
        
    }
    public boolean addPlayerGuess(String word){

    }
    public void updateWordList(){

    }


}













































/**
 * @author feng3302
 * @version 0.1.0
 * @Since 1/29/26
 **/
public class Jotto {
}
