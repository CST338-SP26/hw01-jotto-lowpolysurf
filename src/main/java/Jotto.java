//Chase Miranda
//cst338
//jotto word game

import java.util.ArrayList;

public class Jotto{

    private final int WORD_SIZE = 5;
    private String currentWord = "";
    private int score;
    ArrayList<String> playGuesses = new ArrayList<String>();
    ArrayList<String> playWords = new ArrayList<String>();
    private String filename;
    ArrayList<String> wordList = new ArrayList<String>();
    private final boolean DEBUG = true;

    public Jotto(String filename){
        this.filename = filename;
        readWords();
    }

    public boolean pickWord(){
        return false;
    }
    public String showWordList(){
        return "";
    }
    public ArrayList<String> showPlayerGuesses(){
        return new ArrayList<String>();
    }
    public void playerGuessScores(ArrayList<String> playGuesses){

    }
    public void setCurrentWord(String word){
        this.currentWord = word;
    }
    public ArrayList<String> readWords(){
        return new ArrayList<String>();
    }
    public void play(){

    }
    public int guess(){
        return 0;
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
        return "";
    }
    public boolean addPlayerGuess(String word){
        return false;
    }
    public void updateWordList(){

    }


}

