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

        ////////////      KEEP WORKING HERE  <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<



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
            choice = cin.nextLine();
            //menu

            if(choice.trim().equals("1") || choice.toLowerCase().equals("one")){
                if(!pickWord()){
                    showPlayerGuesses();/////////////////////////////////////////////////////////////////////implement
                }else{
                    guess();/////////////////////////////////////////////////////////////////////////////////implement
                }

            }else if(choice.trim().equals("2") || choice.toLowerCase().equals("two")){
                showWordList();///////////////////////////////////////////////////////////////////////////////implement

            }else if(choice.trim().equals("3") || choice.toLowerCase().equals("three")){
                showPlayedWords();////////////////////////////////////////////////////////////////////////////implement

            }else if(choice.trim().equals("4") || choice.toLowerCase().equals("four")){
                showPlayerGuesses();///////////////////////////////////////////////////////////////////////////implement
            }else{
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

