package com.cranium.ianarbuckle.craniumapp;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;

import java.util.Random;


public class ScrambleGame extends ActionBarActivity {

    private String[] word;
    private String currWord;
    private LinearLayout wordLayout;
    private TextView[] charViews;
    private GridView letters;
    private LetterAdapter ltrAdapt;
    private Random rand;

    private TextView[] lives;
    private int numLives = 6;

    //increment
    private int currLives;

    private int numChars;
    private int numCorr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scramble_game);

        Resources res = getResources();
        word = res.getStringArray(R.array.word);


        currWord = "";
        rand = new Random();

        lives = new TextView[numLives];

        lives[0] = (TextView) findViewById(R.id.live6);
        lives[1] = (TextView) findViewById(R.id.live5);
        lives[2] = (TextView) findViewById(R.id.live4);
        lives[3] = (TextView) findViewById(R.id.live3);
        lives[4] = (TextView) findViewById(R.id.live2);
        lives[5] = (TextView) findViewById(R.id.live1);

        wordLayout = (LinearLayout) findViewById(R.id.word);
        letters = (GridView) findViewById(R.id.letters);

        playGame();
    }

    public void playGame() {

        String newWord = word[rand.nextInt(word.length)];

        while (newWord.equals(currWord)) newWord = word[rand.nextInt(word.length)];

        currWord = newWord;

        charViews = new TextView[currWord.length()];

        wordLayout.removeAllViews();

        //loop through
        for (int c = 0; c < currWord.length(); c++) {
            charViews[c] = new TextView(this);

            //set the current letter
            charViews[c].setText("" + currWord.charAt(c));

            //set layout

            charViews[c].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
            charViews[c].setGravity(Gravity.CENTER);
            charViews[c].setTextColor(Color.WHITE);
            charViews[c].setBackgroundResource(R.drawable.letter_bg);

            //add layout

            wordLayout.addView(charViews[c]);

        }

        ltrAdapt = new LetterAdapter(this);
        letters.setAdapter(ltrAdapt);

        //set word length & correct answers

        numChars = currWord.length();
        numCorr = 0;

        currLives = 0;

        for (int l = 0; l < numLives; l++) {
            lives[l].setVisibility(View.INVISIBLE);
        }


    }

    public void letterPressed(View view) {
        String ltr = ((TextView) view).getText().toString();
        char letterChar = ltr.charAt(0);


        //disable
        view.setEnabled(false);
        view.setBackgroundResource(R.drawable.letter_down);

        //check if correct
        boolean correct = false;


        //initialise to false

        for (int k = 0; k < currWord.length(); k++) {
            if (currWord.charAt(k) == letterChar) {
                correct = true;
                numCorr++;
                charViews[k].setTextColor(Color.BLACK);
            }

        }
        //Check in case won

        if (correct) {
            if (numCorr == numChars) {
                //disable all buttons
                disableBtns();
                //let the user know they have won, ask if they wish to play again
                AlertDialog.Builder winBuild = new AlertDialog.Builder(this);
                winBuild.setTitle("YAY");
                winBuild.setMessage("You win!\n\nThe answer was:\n\n" + currWord);
                winBuild.setPositiveButton("Play Again",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                ScrambleGame.this.playGame();
                            }
                        });
                winBuild.setNegativeButton("Exit",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                ScrambleGame.this.finish();
                            }
                        });
                winBuild.show();


            }
        }
        //Check if the user still has guesses

        else if (currLives < numLives) {
            //show next part
            lives[currLives].setVisibility(View.VISIBLE);
            currLives++;


        } else {
            //user has lost
            disableBtns();
            AlertDialog.Builder loseBuild = new AlertDialog.Builder(this);
            loseBuild.setTitle("OOPS");
            loseBuild.setMessage("You lose!\n\nThe answer was:\n\n" + currWord);
            loseBuild.setPositiveButton("Play Again",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            ScrambleGame.this.playGame();
                        }
                    });
            loseBuild.setNegativeButton("Exit",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            ScrambleGame.this.finish();
                        }
                    });
            loseBuild.show();

        }
    }


    public void disableBtns() {
        int numLetters = letters.getChildCount();
        for (int l = 0; l < numLetters; l++) {
            letters.getChildAt(l).setEnabled(false);
        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.menu_scramble_game, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
