package com.cranium.ianarbuckle.craniumapp;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.Gravity;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


import com.facebook.stetho.Stetho;

import java.util.Random;

/**
 * Author: Ian Arbuckle
 * Reference: http://code.tutsplus.com/tutorials/create-a-hangman-game-user-interaction--mobile-21893
 */

public class HangmanActivity extends ActionBarActivity {

    private String[] words;
    private String[] irishWords;
    private String[] amerWords;
    private String[] russWords;
    private Random rand;
    private String currWord;
    private LinearLayout wordLayout;
    private TextView[] charViews;
    private GridView letters;
    private LetterAdapter ltrAdapt;
    private GridLayout category;

    //body part images
    private ImageView[] bodyParts;

    //number of body parts
    private int numParts = 6;

    //current part - will increment when wrong answers are selected
    private int currPart;

    //number of characters in the word
    private int numChars;

    //number correctly guessed
    private int numCorr;

    //help
    private AlertDialog helpAlert;

    //category buttons
    private Button cat1;
    private Button cat2;
    private Button cat3;
    private Button cat4;
    private TextView catText;
    private RelativeLayout gallow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hangman_activity);

        Stetho.initialize(
                Stetho.newInitializerBuilder(this)
                        .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                        .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
                        .build());


        Resources res = getResources();
        words = res.getStringArray(R.array.words);
        irishWords = res.getStringArray(R.array.irish);
        amerWords = res.getStringArray(R.array.american);
        russWords = res.getStringArray(R.array.russian);


        rand = new Random();
        currWord = "";

        wordLayout = (LinearLayout) findViewById(R.id.word);

        letters = (GridView) findViewById(R.id.letters);

        //body parts image views

        bodyParts = new ImageView[numParts];

        bodyParts[0] = (ImageView) findViewById(R.id.head);
        bodyParts[1] = (ImageView) findViewById(R.id.body);
        bodyParts[2] = (ImageView) findViewById(R.id.arm1);
        bodyParts[3] = (ImageView) findViewById(R.id.arm2);
        bodyParts[4] = (ImageView) findViewById(R.id.leg1);
        bodyParts[5] = (ImageView) findViewById(R.id.leg2);


        //category buttons

        cat1 = (Button) findViewById(R.id.cat1Btn);
        cat2 = (Button) findViewById(R.id.cat2Btn);
        cat3 = (Button) findViewById(R.id.cat3Btn);
        cat4 = (Button) findViewById(R.id.cat4Btn);
        catText = (TextView) findViewById(R.id.catText);
        gallow = (RelativeLayout) findViewById(R.id.gallow);


        category = (GridLayout) findViewById(R.id.category);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hangman_game, menu);
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


    public void onClickCat(View v) {
        switch (v.getId()) {
            case R.id.cat1Btn:
                HangmanActivity.this.playGameDictatorship();
                category.setVisibility(View.GONE);
                letters.setVisibility(View.VISIBLE);
                gallow.setVisibility(View.VISIBLE);
                catText.setVisibility(View.GONE);

                break;
            case R.id.cat2Btn:
                HangmanActivity.this.playGameIrish();
                category.setVisibility(View.GONE);
                letters.setVisibility(View.VISIBLE);
                gallow.setVisibility(View.VISIBLE);
                catText.setVisibility(View.GONE);
                break;
            case R.id.cat3Btn:
                HangmanActivity.this.playGameAmerican();
                category.setVisibility(View.GONE);
                letters.setVisibility(View.VISIBLE);
                gallow.setVisibility(View.VISIBLE);
                catText.setVisibility(View.GONE);
                break;
            case R.id.cat4Btn:
                HangmanActivity.this.playGameRussian();
                category.setVisibility(View.GONE);
                letters.setVisibility(View.VISIBLE);
                gallow.setVisibility(View.VISIBLE);
                catText.setVisibility(View.GONE);
                break;
        }
    }


    public void playGameDictatorship() {
        //play a new game
        String newWord = words[rand.nextInt(words.length)];

        while (newWord.equals(currWord)) newWord = words[rand.nextInt(words.length)];

        currWord = newWord;

        charViews = new TextView[currWord.length()];

        wordLayout.removeAllViews();

        //Loop through the characters
        for (int c = 0; c < currWord.length(); c++) {

            charViews[c] = new TextView(this);
            //set the current letter
            charViews[c].setText("" + currWord.charAt(c));

            //set the layout

            charViews[c].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
            charViews[c].setGravity(Gravity.CENTER);
            charViews[c].setTextColor(Color.WHITE);
            charViews[c].setBackgroundResource(R.drawable.letter_bg);

            //add to layout
            wordLayout.addView(charViews[c]);

        }

        ltrAdapt = new LetterAdapter(this);
        letters.setAdapter(ltrAdapt);

        //Initialise part at 0 (start at 0)
        currPart = 0;

        //set word length and correct answers
        numChars = currWord.length();
        numCorr = 0;

        for (int p = 0; p < numParts; p++) {
            bodyParts[p].setVisibility(View.INVISIBLE);
        }


    }

    private void playGameIrish() {
        //play a new game
        String newWord = irishWords[rand.nextInt(irishWords.length)];

        while (newWord.equals(currWord)) newWord = irishWords[rand.nextInt(irishWords.length)];

        currWord = newWord;

        charViews = new TextView[currWord.length()];

        wordLayout.removeAllViews();


        //Loop through the characters
        for (int c = 0; c < currWord.length(); c++) {

            charViews[c] = new TextView(this);
            //set the current letter
            charViews[c].setText("" + currWord.charAt(c));

            //set the layout

            charViews[c].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
            charViews[c].setGravity(Gravity.CENTER);
            charViews[c].setTextColor(Color.WHITE);
            charViews[c].setBackgroundResource(R.drawable.letter_bg);

            //add to layout
            wordLayout.addView(charViews[c]);

        }

        ltrAdapt = new LetterAdapter(this);
        letters.setAdapter(ltrAdapt);

        //Initialise part at 0 (start at 0)
        currPart = 0;

        //set word length and correct answers
        numChars = currWord.length();
        numCorr = 0;

        for (int p = 0; p < numParts; p++) {
            bodyParts[p].setVisibility(View.INVISIBLE);
        }
    }

    private void playGameAmerican() {
        //play a new game
        String newWord = amerWords[rand.nextInt(amerWords.length)];

        while (newWord.equals(currWord)) newWord = amerWords[rand.nextInt(amerWords.length)];

        currWord = newWord;

        charViews = new TextView[currWord.length()];

        wordLayout.removeAllViews();


        //Loop through the characters
        for (int c = 0; c < currWord.length(); c++) {

            charViews[c] = new TextView(this);
            //set the current letter
            charViews[c].setText("" + currWord.charAt(c));

            //set the layout

            charViews[c].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
            charViews[c].setGravity(Gravity.CENTER);
            charViews[c].setTextColor(Color.WHITE);
            charViews[c].setBackgroundResource(R.drawable.letter_bg);

            //add to layout
            wordLayout.addView(charViews[c]);

        }

        ltrAdapt = new LetterAdapter(this);
        letters.setAdapter(ltrAdapt);

        //Initialise part at 0 (start at 0)
        currPart = 0;

        //set word length and correct answers
        numChars = currWord.length();
        numCorr = 0;

        for (int p = 0; p < numParts; p++) {
            bodyParts[p].setVisibility(View.INVISIBLE);
        }
    }

    private void playGameRussian() {
        //play a new game
        String newWord = russWords[rand.nextInt(russWords.length)];

        while (newWord.equals(currWord)) newWord = russWords[rand.nextInt(russWords.length)];

        currWord = newWord;

        charViews = new TextView[currWord.length()];

        wordLayout.removeAllViews();


        //Loop through the characters
        for (int c = 0; c < currWord.length(); c++) {

            charViews[c] = new TextView(this);
            //set the current letter
            charViews[c].setText("" + currWord.charAt(c));

            if (currWord.charAt(c) == ' ') {
                charViews[c].setText(null);

            }


            //set the layout

            charViews[c].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
            charViews[c].setGravity(Gravity.CENTER);
            charViews[c].setTextColor(Color.WHITE);
            charViews[c].setBackgroundResource(R.drawable.letter_bg);

            //add to layout
            wordLayout.addView(charViews[c]);

        }

        ltrAdapt = new LetterAdapter(this);
        letters.setAdapter(ltrAdapt);

        //Initialise part at 0 (start at 0)
        currPart = 0;

        //set word length and correct answers
        numChars = currWord.length();
        numCorr = 0;

        for (int p = 0; p < numParts; p++) {
            bodyParts[p].setVisibility(View.INVISIBLE);
        }
    }

    public void letterPressed(View view) {

        //Find out which letter was pressed

        String ltr = ((TextView) view).getText().toString();

        char letterChar = ltr.charAt(0);

        //disable view

        view.setEnabled(false);
        view.setBackgroundResource(R.drawable.letter_down);

        //check if correct

        boolean correct = false; //initialise to false


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
                winBuild.setTitle("Sup hoss! You guessed the correct letter " + currWord);
                winBuild.setItems(R.array.categories,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                switch (which) {
                                    case 0:
                                        HangmanActivity.this.playGameDictatorship();
                                        break;
                                    case 1:
                                        HangmanActivity.this.playGameIrish();
                                        break;
                                    case 2:
                                        HangmanActivity.this.playGameAmerican();
                                        break;
                                    case 3:
                                        HangmanActivity.this.playGameRussian();
                                        break;

                                }


                            }
                        });
                winBuild.setNegativeButton("Exit",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                HangmanActivity.this.finish();
                            }
                        });
                winBuild.show();

            }
        }

        //Check if the user still has guesses

        else if (currPart < numParts) {
            //show next part
            bodyParts[currPart].setVisibility(View.VISIBLE);
            currPart++;
        } else {
            //user has lost
            disableBtns();
            //let the user know they lost, ask if they want to play again
            AlertDialog.Builder loseBuild = new AlertDialog.Builder(this);
            loseBuild.setTitle("Sorry hoss! The answer was: " + currWord + " Play again");
            loseBuild.setItems(R.array.categories,
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            switch (which) {
                                case 0:
                                    HangmanActivity.this.playGameDictatorship();
                                    break;
                                case 1:
                                    HangmanActivity.this.playGameIrish();
                                    break;
                                case 2:
                                    HangmanActivity.this.playGameAmerican();
                                    break;
                                case 3:
                                    HangmanActivity.this.playGameRussian();
                                    break;
                            }
                        }
                    });
            loseBuild.setNegativeButton("Exit",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            HangmanActivity.this.finish();
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


}
