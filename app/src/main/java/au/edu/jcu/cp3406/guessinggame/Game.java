package au.edu.jcu.cp3406.guessinggame;

import java.util.Random;

public class Game extends MainActivity {

    public int answer;


    public Game() {
        Random rand = new Random();
        answer = rand.nextInt(11);
    }

    public boolean check(int guess){
        if (answer == guess){
            return true;
        }else{
            return false;
        }
    }

}