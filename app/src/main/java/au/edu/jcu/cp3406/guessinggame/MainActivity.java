package au.edu.jcu.cp3406.guessinggame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    EditText numberInput;

    public void checkGuess(View view){

        Game game = new Game();
        numberInput = findViewById(R.id.editText);
        int numberGuessed = Integer. parseInt(numberInput. getText(). toString());



        boolean guessedCorrect = false;
        String correctString = new String("Correct! yay for " + game.answer );
        String incorrectString = new String("Incorrect, answer was " + game.answer);

        guessedCorrect = game.check(numberGuessed);
        if (guessedCorrect) {
            Toast.makeText(getApplicationContext(), correctString, Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(), incorrectString, Toast.LENGTH_SHORT).show();

        }

    }
}