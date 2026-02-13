//Chase Miranda
//cst338
//jotto word game

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Jotto{

    private final int WORD_SIZE = 5;
    private String currentWord = "";
    private int score = 0;
    ArrayList<String> playGuesses = new ArrayList<String>();
    ArrayList<String> playWords = new ArrayList<String>();
    private String filename = "";
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
        StringBuilder out = new StringBuilder();
        out.append("Current list of played words:\n");
        for (String word : wordList) {
            out.append(word).append("\n");
        }
        return out.toString();
    }
    public ArrayList<String> showPlayerGuesses(){
        //empty
        if(playGuesses.isEmpty()){
            System.out.println("No words have been played");
        }
        //not empty
        StringBuilder out = new StringBuilder();
        out.append("Current list of played words:\n");
        for (String playGuess : playGuesses) {
            out.append(playGuess).append("\n");
        }
        System.out.println(out);

        System.out.println("Would you like to add the words to the word list? (y/n)");
        Scanner cin = new Scanner(System.in);
        String choice = "";
        choice = cin.nextLine().trim().toLowerCase();
        if(choice.equals("y")){
            updateWordList();
            showWordList();
        }
        return playGuesses;
    }
    public void playerGuessScores(ArrayList<String> playGuesses){

    }
    public void setCurrentWord(String word){
        this.currentWord = word;
    }
    public ArrayList<String> readWords(){
        ArrayList<String> wordList = new ArrayList<String>();
        File file = new File(filename);

        try (Scanner fin = new Scanner(file)){
            while(fin.hasNextLine()){
                String data = fin.nextLine();
                wordList.add(data);
            }
        }catch (FileNotFoundException e){
            System.out.println("Couldn't open " + filename);
            e.printStackTrace();
        }
        return wordList;
    }
    public void play(){
        Scanner cin = new Scanner(System.in);
        String choice = "";

        //do
        do{
            //menu
            System.out.println("Welcome to the game.\n" +
                    "Current Score: " + score +
                    "\n=-=-=-=-=-=-=-=-=-=-=\n" +
                    "Choose one of the following:\n" +
                    "1:     Start the Game\n" +
                    "2:     See the word list\n" +
                    "3:     See the chosen words\n" +
                    "4:     Show player guesses\n" +
                    "zz to exit\n" +
                    "=-=-=-=-=-=-=-=-=-=-=");
            System.out.print("What is your choice: ");
            choice = cin.nextLine().trim().toLowerCase();
            //menu

            switch (choice) {
                case "1", "one" -> {
                    if (pickWord()) {
                        guess();
                    } else {
                        showPlayerGuesses();
                    }
                }
                case "2", "two" ->
                        showWordList();
                case "3", "three" ->
                        showPlayedWords();
                case "4", "four" ->
                        showPlayerGuesses();
                default ->
                        System.out.println("I don't know what " + choice + " is.");
            }
        }while(!choice.toLowerCase().trim().equals("zz"));

        //enter to continue
        System.out.println("Press enter to continue");
        try {
            System.in.read();
        } catch (IOException e){
            e.printStackTrace();
        }
        //enter to continue
    }
    public int guess(){
        ArrayList<String> currentGuess = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        int letterCount = 0;
        int score = WORD_SIZE + 1;
        String wordGuess = "";

        do{
            System.out.println("Current score: " + score);
            System.out.print("What is your guess (q to quit): ");
            wordGuess = scan.nextLine().trim().toLowerCase();

            if(!wordGuess.equals("q")){
             if(wordGuess.length() == 5){
                 addPlayerGuess(wordGuess);
                 if(getCurrentWord().trim().toLowerCase().equals(wordGuess)){
                     System.out.println("Correct");
                     currentGuess.add(wordGuess);
                     playerGuessScores(currentGuess);
                 }
             }else{
                 System.out.println("Word must be correct length (5 letters). You entered " + wordGuess.length() + " letters.");
                 score--;
             }
            }else{
                score = Math.min(0,score);
            }
        }while(!wordGuess.equals("q"));


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
        //empty
        if(playWords.isEmpty()){
            return "No words have been played";
        }
        //not empty
        StringBuilder out = new StringBuilder();
        out.append("Current list of played words:\n");
        for (String playWord : playWords) {
            out.append(playWord).append("\n");
        }
        return out.toString();
    }
    public boolean addPlayerGuess(String word){
        return false;
    }
    public void updateWordList(){

    }


}

