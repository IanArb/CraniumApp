package com.cranium.ianarbuckle.craniumapp.English;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cranium.ianarbuckle.craniumapp.LetterAdapter;
import com.cranium.ianarbuckle.craniumapp.R;
import com.cranium.ianarbuckle.craniumapp.com.cranium.ianarbuckle.craniumapp.game.BaseGameActivity;
import com.google.android.gms.games.Games;

import java.util.Random;


public class ScrambleGame extends BaseGameActivity{

    private String[] class1;
    private String[] class2;
    private String[] class3;
    private String currWord;
    private LinearLayout wordLayout;
    private TextView[] charViews;
    private GridView letters;
    private LetterAdapter ltrAdapt;
    private Random rand;
    private TextView classText1;
    private TextView classText2;
    private TextView classText3;

    private TextView[] lives;
    private int numLives = 6;

    //increment
    private int currLives;

    private int numChars;
    private int numCorr;

    private ImageButton help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scramble_game);

        Resources res = getResources();
        class1 = res.getStringArray(R.array.class1);
        class2 = res.getStringArray(R.array.class2);
        class3 = res.getStringArray(R.array.class3);


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


        classText1 = (TextView) findViewById(R.id.text);
        classText2 = (TextView) findViewById(R.id.text2);
        classText3 = (TextView) findViewById(R.id.text3);
        /*
        cat1 = (Button) findViewById(R.id.cat1Btn);
        cat2 = (Button) findViewById(R.id.cat2Btn);
        cat3 = (Button) findViewById(R.id.cat3Btn);
        category = (GridLayout) findViewById(R.id.category);
        catText = (TextView) findViewById(R.id.catText);
        letterLayout = (RelativeLayout) findViewById(R.id.letterLayout);
        */

        //Google Game Services

        AlertDialog.Builder winBuild = new AlertDialog.Builder(this);
        winBuild.setTitle("Sup hoss! Choose your category!");
        winBuild.setItems(R.array.scramble_cat,
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which) {
                            case 0:
                                ScrambleGame.this.playClass1();
                                break;
                            case 1:
                                ScrambleGame.this.playClass2();
                                break;
                            case 2:
                                ScrambleGame.this.playClass3();
                                break;
                        }


                    }
                });
        winBuild.setNegativeButton("Exit",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        ScrambleGame.this.finish();
                    }
                });
        winBuild.show();

        findViewById(R.id.sign_out_button);
        findViewById(R.id.achievements);
        findViewById(R.id.show_leaderboard);
        findViewById(R.id.help);


    }

    public void OnClick(View v){
        switch(v.getId()){
            case R.id.achievements:
                startActivityForResult(Games.Achievements.getAchievementsIntent(
                        getApiClient()), 1);
                break;
            case R.id.show_leaderboard:
                startActivityForResult(Games.Leaderboards.getLeaderboardIntent(
                        getApiClient(), getString(R.string.scramble_leaderboard)),2);
                break;
            case R.id.sign_out_button:
                ScrambleGame.this.finish();
                break;
            case R.id.help:
                AlertDialog.Builder help = new AlertDialog.Builder(this);
                help.setTitle("How to Play?");
                help.setMessage("You got six lives and must guess the random generated scrambled word");
                help.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){

                    }
                });
                help.show();
                break;
        }
    }

    @Override
    public void onSignInFailed() {
        findViewById(R.id.sign_out_button).setVisibility(View.GONE);
    }

    @Override
    public void onSignInSucceeded() {
        findViewById(R.id.sign_out_button).setVisibility(View.VISIBLE);

    }


    public void playClass1() {

        String newWord = class1[rand.nextInt(class1.length)];

        while (newWord.equals(currWord)) newWord = class1[rand.nextInt(class1.length)];

        currWord = newWord;

        charViews = new TextView[currWord.length()];

        wordLayout.removeAllViews();


        classText1.setVisibility(View.VISIBLE);
        classText2.setVisibility(View.GONE);
        classText3.setVisibility(View.GONE);



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

    public void playClass2() {

        String newWord = class2[rand.nextInt(class2.length)];

        while (newWord.equals(currWord)) newWord = class2[rand.nextInt(class2.length)];

        currWord = newWord;

        charViews = new TextView[currWord.length()];

        wordLayout.removeAllViews();

        classText1.setVisibility(View.GONE);
        classText2.setVisibility(View.VISIBLE);
        classText3.setVisibility(View.GONE);


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

    public void playClass3() {

        String newWord = class3[rand.nextInt(class3.length)];

        while (newWord.equals(currWord)) newWord = class3[rand.nextInt(class3.length)];

        currWord = newWord;

        charViews = new TextView[currWord.length()];

        wordLayout.removeAllViews();


        classText3.setVisibility(View.VISIBLE);
        classText2.setVisibility(View.GONE);
        classText1.setVisibility(View.GONE);


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
                if (getApiClient().isConnected())
                    Games.Achievements.unlock(getApiClient(),
                            getString(R.string.english_correct_guess));
                Games.Leaderboards.submitScore(getApiClient(),
                        getString(R.string.scramble_leaderboard),numCorr);
                numCorr++;
                //disable all buttons
                disableBtns();
                //let the user know they have won, ask if they wish to play again
                AlertDialog.Builder winBuild = new AlertDialog.Builder(this);
                winBuild.setTitle("Sup hoss! You guessed the correct word" + currWord);
                winBuild.setItems(R.array.scramble_cat,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                switch (which) {
                                    case 0:
                                        ScrambleGame.this.playClass1();
                                        break;
                                    case 1:
                                        ScrambleGame.this.playClass2();
                                        break;
                                    case 2:
                                        ScrambleGame.this.playClass3();
                                        break;
                                }


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
            loseBuild.setTitle("Sorry hoss! The answer was:" + currWord +" Play again");
            loseBuild.setItems(R.array.scramble_cat,
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            switch (which) {
                                case 0:
                                    ScrambleGame.this.playClass1();
                                    break;
                                case 1:
                                    ScrambleGame.this.playClass2();
                                    break;
                                case 2:
                                    ScrambleGame.this.playClass3();
                                    break;
                            }


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
