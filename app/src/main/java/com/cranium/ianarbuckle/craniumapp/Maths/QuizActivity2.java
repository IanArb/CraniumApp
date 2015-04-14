package com.cranium.ianarbuckle.craniumapp.Maths;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cranium.ianarbuckle.craniumapp.R;
import com.cranium.ianarbuckle.craniumapp.com.cranium.ianarbuckle.craniumapp.game.BaseGameActivity;
import com.google.android.gms.games.Games;


public class QuizActivity2 extends BaseGameActivity {

    private GridLayout grid1, grid2, grid3, grid4, grid5, grid6, grid7, grid8, grid9, grid10;
    private RelativeLayout blackboard1, blackboard2, blackboard3, blackboard4, blackboard5, blackboard6, blackboard7, blackboard8, blackboard9, blackboard10, finish;

    private ImageButton q1BtnA, q1BtnB, q1BtnC, q1BtnD;
    private ImageButton q2BtnA, q2BtnB, q2BtnC, q2BtnD;
    private ImageButton q3BtnA, q3BtnB, q3BtnC, q3BtnD;
    private ImageButton q4BtnA, q4BtnB, q4BtnC, q4BtnD;
    private ImageButton q5BtnA, q5BtnB, q5BtnC, q5BtnD;
    private ImageButton q6BtnA, q6BtnB, q6BtnC, q6BtnD;
    private ImageButton q7BtnA, q7BtnB, q7BtnC, q7BtnD;
    private ImageButton q8BtnA, q8BtnB, q8BtnC, q8BtnD;
    private ImageButton q9BtnA, q9BtnB, q9BtnC, q9BtnD;
    private ImageButton q10BtnA, q10BtnB, q10BtnC, q10BtnD;

    private TextView q1Text, q2Text, q3Text, q4Text, q5Text, q6Text, q7Text, q8Text, q9Text, q10Text, score;

    private int numCorr = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_activity2);



        //referencing game views

        score = (TextView) findViewById(R.id.score);


        //Question 1

        //Grid Layout

        grid1 = (GridLayout) findViewById(R.id.grid1);

        //Relative Layout (blackboard)

        blackboard1 = (RelativeLayout) findViewById(R.id.q1);

        //question

        q1Text = (TextView) findViewById(R.id.question1bText);


        //buttons

        q1BtnA = (ImageButton) findViewById(R.id.q1BtnA);
        q1BtnB = (ImageButton) findViewById(R.id.q1BtnB);
        q1BtnC = (ImageButton) findViewById(R.id.q1BtnC);
        q1BtnD = (ImageButton) findViewById(R.id.q1BtnD);

        //Question 2

        //Grid Layout

        grid2 = (GridLayout) findViewById(R.id.grid2);

        //Relative Layout (blackboard)

        blackboard2 = (RelativeLayout) findViewById(R.id.q2);

        //question

        q2Text = (TextView) findViewById(R.id.question2bText);

        //buttons

        q2BtnA = (ImageButton) findViewById(R.id.q2BtnA);
        q2BtnB = (ImageButton) findViewById(R.id.q2BtnB);
        q2BtnC = (ImageButton) findViewById(R.id.q2BtnC);
        q2BtnD = (ImageButton) findViewById(R.id.q2BtnD);

        //Question 3

        //Grid Layout

        grid3 = (GridLayout) findViewById(R.id.grid3);

        //Relative Layout (blackboard)

        //question

        q3Text = (TextView) findViewById(R.id.question3bText);

        blackboard3 = (RelativeLayout) findViewById(R.id.q3);

        //buttons

        q3BtnA = (ImageButton) findViewById(R.id.q3BtnA);
        q3BtnB = (ImageButton) findViewById(R.id.q3BtnB);
        q3BtnC = (ImageButton) findViewById(R.id.q3BtnC);
        q3BtnD = (ImageButton) findViewById(R.id.q3BtnD);

        //Question 4

        //Grid Layout

        grid4 = (GridLayout) findViewById(R.id.grid4);

        //question

        q4Text = (TextView) findViewById(R.id.question4bText);

        //Relative Layout (blackboard)

        blackboard4 = (RelativeLayout) findViewById(R.id.q4);

        //buttons

        q4BtnA = (ImageButton) findViewById(R.id.q4BtnA);
        q4BtnB = (ImageButton) findViewById(R.id.q4BtnB);
        q4BtnC = (ImageButton) findViewById(R.id.q4BtnC);
        q4BtnD = (ImageButton) findViewById(R.id.q4BtnD);

        //Question 5

        //Grid Layout

        grid5 = (GridLayout) findViewById(R.id.grid5);

        //question

        q5Text = (TextView) findViewById(R.id.question5bText);

        //Relative Layout (blackboard)

        blackboard5 = (RelativeLayout) findViewById(R.id.q5);

        //buttons

        q5BtnA = (ImageButton) findViewById(R.id.q5BtnA);
        q5BtnB = (ImageButton) findViewById(R.id.q5BtnB);
        q5BtnC = (ImageButton) findViewById(R.id.q5BtnC);
        q5BtnD = (ImageButton) findViewById(R.id.q5BtnD);

        //Question 6

        //Grid Layout

        grid6 = (GridLayout) findViewById(R.id.grid6);

        //question

        q6Text = (TextView) findViewById(R.id.question6bText);

        //Relative Layout (blackboard)

        blackboard6 = (RelativeLayout) findViewById(R.id.q6);

        //buttons

        q6BtnA = (ImageButton) findViewById(R.id.q6BtnA);
        q6BtnB = (ImageButton) findViewById(R.id.q6BtnB);
        q6BtnC = (ImageButton) findViewById(R.id.q6BtnC);
        q6BtnD = (ImageButton) findViewById(R.id.q6BtnD);

        //Question 7

        //Grid Layout

        grid7 = (GridLayout) findViewById(R.id.grid7);

        //question

        q7Text = (TextView) findViewById(R.id.question7bText);

        //Relative Layout (blackboard)

        blackboard7 = (RelativeLayout) findViewById(R.id.q7);

        //buttons

        q7BtnA = (ImageButton) findViewById(R.id.q7BtnA);
        q7BtnB = (ImageButton) findViewById(R.id.q7BtnB);
        q7BtnC = (ImageButton) findViewById(R.id.q7BtnC);
        q7BtnD = (ImageButton) findViewById(R.id.q7BtnD);

        //Question 8

        //Grid Layout

        grid8 = (GridLayout) findViewById(R.id.grid8);

        //question

        q8Text = (TextView) findViewById(R.id.question8bText);

        //Relative Layout (blackboard)

        blackboard8 = (RelativeLayout) findViewById(R.id.q8);

        //buttons

        q8BtnA = (ImageButton) findViewById(R.id.q8BtnA);
        q8BtnB = (ImageButton) findViewById(R.id.q8BtnB);
        q8BtnC = (ImageButton) findViewById(R.id.q8BtnC);
        q8BtnD = (ImageButton) findViewById(R.id.q8BtnD);

        //Question 9

        //Grid Layout

        grid9 = (GridLayout) findViewById(R.id.grid9);

        //question

        q9Text = (TextView) findViewById(R.id.question9bText);

        //Relative Layout (blackboard)

        blackboard9 = (RelativeLayout) findViewById(R.id.q9);

        //buttons

        q9BtnA = (ImageButton) findViewById(R.id.q9BtnA);
        q9BtnB = (ImageButton) findViewById(R.id.q9BtnB);
        q9BtnC = (ImageButton) findViewById(R.id.q9BtnC);
        q9BtnD = (ImageButton) findViewById(R.id.q9BtnD);

        //Question 10

        //Grid Layout

        grid10 = (GridLayout) findViewById(R.id.grid10);

        //question

        q10Text = (TextView) findViewById(R.id.question10bText);

        //Relative Layout (blackboard)

        blackboard10 = (RelativeLayout) findViewById(R.id.q10);

        //buttons

        q10BtnA = (ImageButton) findViewById(R.id.q10BtnA);
        q10BtnB = (ImageButton) findViewById(R.id.q10BtnB);
        q10BtnC = (ImageButton) findViewById(R.id.q10BtnC);
        q10BtnD = (ImageButton) findViewById(R.id.q10BtnD);

        finish = (RelativeLayout) findViewById(R.id.finish);

        findViewById(R.id.achievements);
        findViewById(R.id.show_leaderboard);
        findViewById(R.id.exit);


    }

    @Override
    public void onSignInFailed() {

    }

    @Override
    public void onSignInSucceeded() {

    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.achievements:
                startActivityForResult(Games.Achievements.getAchievementsIntent(
                        getApiClient()), 1);
                break;
            case R.id.show_leaderboard:
                startActivityForResult(Games.Leaderboards.getLeaderboardIntent(
                        getApiClient(), getString(R.string.maths_leaderboard)),2);
                break;
            case R.id.exit:
                Intent i = new Intent(this, MathsActivity.class);
                this.startActivity(i);
                break;
        }
    }

    public void GameBtns(View v) {

        switch (v.getId()) {

            case R.id.q1BtnA:
                //increment correct answer
                numCorr++;
                if (getApiClient().isConnected())
                    Games.Achievements.unlock(getApiClient(),
                            getString(R.string.maths_badge));
                Games.Leaderboards.submitScore(getApiClient(),
                        getString(R.string.maths_leaderboard),numCorr);
                AlertDialog.Builder dialogA = new AlertDialog.Builder(this);
                dialogA.setTitle("Hurray!");
                dialogA.setMessage("50 is the correct answer!");
                dialogA.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {



                        //set q1 to gone
                        grid1.setVisibility(View.GONE);
                        q1BtnA.setVisibility(View.GONE);
                        q1BtnB.setVisibility(View.GONE);
                        q1BtnC.setVisibility(View.GONE);
                        q1BtnD.setVisibility(View.GONE);
                        blackboard1.setVisibility(View.GONE);

                        //set up next question
                        grid2.setVisibility(View.VISIBLE);
                        q2BtnA.setVisibility(View.VISIBLE);
                        q2BtnB.setVisibility(View.VISIBLE);
                        q2BtnC.setVisibility(View.VISIBLE);
                        q2BtnD.setVisibility(View.VISIBLE);
                        blackboard2.setVisibility(View.VISIBLE);
                    }
                });

                dialogA.show();
                break;

            case R.id.q1BtnB:
                AlertDialog.Builder dialogB = new AlertDialog.Builder(this);
                dialogB.setTitle("Wrong!");
                dialogB.setMessage("50 is the correct answer!");
                dialogB.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid1.setVisibility(View.GONE);
                        q1BtnA.setVisibility(View.GONE);
                        q1BtnB.setVisibility(View.GONE);
                        q1BtnC.setVisibility(View.GONE);
                        q1BtnD.setVisibility(View.GONE);
                        blackboard1.setVisibility(View.GONE);

                        //set up next question
                        grid2.setVisibility(View.VISIBLE);
                        q2BtnA.setVisibility(View.VISIBLE);
                        q2BtnB.setVisibility(View.VISIBLE);
                        q2BtnC.setVisibility(View.VISIBLE);
                        q2BtnD.setVisibility(View.VISIBLE);
                        blackboard2.setVisibility(View.VISIBLE);
                    }
                });

                dialogB.show();
                break;

            case R.id.q1BtnC:
                AlertDialog.Builder dialogC = new AlertDialog.Builder(this);
                dialogC.setTitle("Wrong!");
                dialogC.setMessage("50 is the correct answer!");
                dialogC.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid1.setVisibility(View.GONE);
                        q1BtnA.setVisibility(View.GONE);
                        q1BtnB.setVisibility(View.GONE);
                        q1BtnC.setVisibility(View.GONE);
                        q1BtnD.setVisibility(View.GONE);
                        blackboard1.setVisibility(View.GONE);

                        //set up next question
                        grid2.setVisibility(View.VISIBLE);
                        q2BtnA.setVisibility(View.VISIBLE);
                        q2BtnB.setVisibility(View.VISIBLE);
                        q2BtnC.setVisibility(View.VISIBLE);
                        q2BtnD.setVisibility(View.VISIBLE);
                        blackboard2.setVisibility(View.VISIBLE);
                    }
                });

                dialogC.show();
                break;

            case R.id.q1BtnD:
                AlertDialog.Builder dialogD = new AlertDialog.Builder(this);
                dialogD.setTitle("Wrong!");
                dialogD.setMessage("50 is the correct answer!");
                dialogD.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid1.setVisibility(View.GONE);
                        q1BtnA.setVisibility(View.GONE);
                        q1BtnB.setVisibility(View.GONE);
                        q1BtnC.setVisibility(View.GONE);
                        q1BtnD.setVisibility(View.GONE);
                        blackboard1.setVisibility(View.GONE);

                        //set up next question
                        grid2.setVisibility(View.VISIBLE);
                        q2BtnA.setVisibility(View.VISIBLE);
                        q2BtnB.setVisibility(View.VISIBLE);
                        q2BtnC.setVisibility(View.VISIBLE);
                        q2BtnD.setVisibility(View.VISIBLE);
                        blackboard2.setVisibility(View.VISIBLE);
                    }
                });

                dialogD.show();
                break;

            //Question 2

            case R.id.q2BtnA:
                //increment correct answer
                numCorr++;
                if (getApiClient().isConnected())
                    Games.Achievements.unlock(getApiClient(),
                            getString(R.string.maths_badge));
                Games.Leaderboards.submitScore(getApiClient(),
                        getString(R.string.maths_leaderboard),numCorr);
                AlertDialog.Builder dialogQ2A = new AlertDialog.Builder(this);
                dialogQ2A.setTitle("Hurray!");
                dialogQ2A.setMessage("255 is the correct answer!");
                dialogQ2A.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {



                        //set q1 to gone
                        grid2.setVisibility(View.GONE);
                        q2BtnA.setVisibility(View.GONE);
                        q2BtnB.setVisibility(View.GONE);
                        q2BtnC.setVisibility(View.GONE);
                        q2BtnD.setVisibility(View.GONE);
                        blackboard2.setVisibility(View.GONE);

                        //set up next question
                        grid3.setVisibility(View.VISIBLE);
                        q3BtnA.setVisibility(View.VISIBLE);
                        q3BtnB.setVisibility(View.VISIBLE);
                        q3BtnC.setVisibility(View.VISIBLE);
                        q3BtnD.setVisibility(View.VISIBLE);
                        blackboard3.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ2A.show();
                break;

            case R.id.q2BtnB:
                AlertDialog.Builder dialogQ2B = new AlertDialog.Builder(this);
                dialogQ2B.setTitle("Wrong!");
                dialogQ2B.setMessage("255 is the correct answer!");
                dialogQ2B.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {


                        //set q1 to gone
                        grid2.setVisibility(View.GONE);
                        q2BtnA.setVisibility(View.GONE);
                        q2BtnB.setVisibility(View.GONE);
                        q2BtnC.setVisibility(View.GONE);
                        q2BtnD.setVisibility(View.GONE);
                        blackboard2.setVisibility(View.GONE);

                        //set up next question
                        grid3.setVisibility(View.VISIBLE);
                        q3BtnA.setVisibility(View.VISIBLE);
                        q3BtnB.setVisibility(View.VISIBLE);
                        q3BtnC.setVisibility(View.VISIBLE);
                        q3BtnD.setVisibility(View.VISIBLE);
                        blackboard3.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ2B.show();
                break;

            case R.id.q2BtnC:
                AlertDialog.Builder dialogQ2C = new AlertDialog.Builder(this);
                dialogQ2C.setTitle("Wrong!");
                dialogQ2C.setMessage("255 is the correct answer!");
                dialogQ2C.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {


                        //set q1 to gone
                        grid2.setVisibility(View.GONE);
                        q2BtnA.setVisibility(View.GONE);
                        q2BtnB.setVisibility(View.GONE);
                        q2BtnC.setVisibility(View.GONE);
                        q2BtnD.setVisibility(View.GONE);
                        blackboard2.setVisibility(View.GONE);

                        //set up next question
                        grid3.setVisibility(View.VISIBLE);
                        q3BtnA.setVisibility(View.VISIBLE);
                        q3BtnB.setVisibility(View.VISIBLE);
                        q3BtnC.setVisibility(View.VISIBLE);
                        q3BtnD.setVisibility(View.VISIBLE);
                        blackboard3.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ2C.show();
                break;

            case R.id.q2BtnD:
                AlertDialog.Builder dialogQ2D = new AlertDialog.Builder(this);
                dialogQ2D.setTitle("Wrong!");
                dialogQ2D.setMessage("255 is the correct answer!");
                dialogQ2D.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {


                        //set q1 to gone
                        grid2.setVisibility(View.GONE);
                        q2BtnA.setVisibility(View.GONE);
                        q2BtnB.setVisibility(View.GONE);
                        q2BtnC.setVisibility(View.GONE);
                        q2BtnD.setVisibility(View.GONE);
                        blackboard2.setVisibility(View.GONE);

                        //set up next question
                        grid3.setVisibility(View.VISIBLE);
                        q3BtnA.setVisibility(View.VISIBLE);
                        q3BtnB.setVisibility(View.VISIBLE);
                        q3BtnC.setVisibility(View.VISIBLE);
                        q3BtnD.setVisibility(View.VISIBLE);
                        blackboard3.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ2D.show();
                break;

            //question 3
            case R.id.q3BtnA:
                //increment correct answer
                numCorr++;
                if (getApiClient().isConnected())
                    Games.Achievements.unlock(getApiClient(),
                            getString(R.string.maths_badge));
                Games.Leaderboards.submitScore(getApiClient(),
                        getString(R.string.maths_leaderboard),numCorr);
                AlertDialog.Builder dialogQ3A = new AlertDialog.Builder(this);
                dialogQ3A.setTitle("Hurray!");
                dialogQ3A.setMessage("35,640 is the correct answer!");
                dialogQ3A.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {



                        //set q1 to gone
                        grid3.setVisibility(View.GONE);
                        q3BtnA.setVisibility(View.GONE);
                        q3BtnB.setVisibility(View.GONE);
                        q3BtnC.setVisibility(View.GONE);
                        q3BtnD.setVisibility(View.GONE);
                        blackboard3.setVisibility(View.GONE);

                        //set up next question
                        grid4.setVisibility(View.VISIBLE);
                        q4BtnA.setVisibility(View.VISIBLE);
                        q4BtnB.setVisibility(View.VISIBLE);
                        q4BtnC.setVisibility(View.VISIBLE);
                        q4BtnD.setVisibility(View.VISIBLE);
                        blackboard4.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ3A.show();
                break;

            case R.id.q3BtnB:
                AlertDialog.Builder dialogQ3B = new AlertDialog.Builder(this);
                dialogQ3B.setTitle("Wrong!");
                dialogQ3B.setMessage("35,640 is the correct answer!");
                dialogQ3B.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid3.setVisibility(View.GONE);
                        q3BtnA.setVisibility(View.GONE);
                        q3BtnB.setVisibility(View.GONE);
                        q3BtnC.setVisibility(View.GONE);
                        q3BtnD.setVisibility(View.GONE);
                        blackboard3.setVisibility(View.GONE);

                        //set up next question
                        grid4.setVisibility(View.VISIBLE);
                        q4BtnA.setVisibility(View.VISIBLE);
                        q4BtnB.setVisibility(View.VISIBLE);
                        q4BtnC.setVisibility(View.VISIBLE);
                        q4BtnD.setVisibility(View.VISIBLE);
                        blackboard4.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ3B.show();
                break;

            case R.id.q3BtnC:
                AlertDialog.Builder dialogQ3C = new AlertDialog.Builder(this);
                dialogQ3C.setTitle("Wrong!");
                dialogQ3C.setMessage("35,640 is the correct answer!");
                dialogQ3C.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid3.setVisibility(View.GONE);
                        q3BtnA.setVisibility(View.GONE);
                        q3BtnB.setVisibility(View.GONE);
                        q3BtnC.setVisibility(View.GONE);
                        q3BtnD.setVisibility(View.GONE);
                        blackboard3.setVisibility(View.GONE);

                        //set up next question
                        grid4.setVisibility(View.VISIBLE);
                        q4BtnA.setVisibility(View.VISIBLE);
                        q4BtnB.setVisibility(View.VISIBLE);
                        q4BtnC.setVisibility(View.VISIBLE);
                        q4BtnD.setVisibility(View.VISIBLE);
                        blackboard4.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ3C.show();
                break;

            case R.id.q3BtnD:
                AlertDialog.Builder dialogQ3D = new AlertDialog.Builder(this);
                dialogQ3D.setTitle("Wrong!");
                dialogQ3D.setMessage("35,640 is the correct answer!");
                dialogQ3D.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid3.setVisibility(View.GONE);
                        q3BtnA.setVisibility(View.GONE);
                        q3BtnB.setVisibility(View.GONE);
                        q3BtnC.setVisibility(View.GONE);
                        q3BtnD.setVisibility(View.GONE);
                        blackboard3.setVisibility(View.GONE);

                        //set up next question
                        grid4.setVisibility(View.VISIBLE);
                        q4BtnA.setVisibility(View.VISIBLE);
                        q4BtnB.setVisibility(View.VISIBLE);
                        q4BtnC.setVisibility(View.VISIBLE);
                        q4BtnD.setVisibility(View.VISIBLE);
                        blackboard4.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ3D.show();
                break;

            //Question 4

            case R.id.q4BtnA:
                //increment correct answer
                numCorr++;
                if (getApiClient().isConnected())
                    Games.Achievements.unlock(getApiClient(),
                            getString(R.string.maths_badge));
                Games.Leaderboards.submitScore(getApiClient(),
                        getString(R.string.maths_leaderboard),numCorr);
                AlertDialog.Builder dialogQ4A = new AlertDialog.Builder(this);
                dialogQ4A.setTitle("Hurray!");
                dialogQ4A.setMessage("0.58 is the correct answer!");
                dialogQ4A.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {



                        //set q1 to gone
                        grid4.setVisibility(View.GONE);
                        q4BtnA.setVisibility(View.GONE);
                        q4BtnB.setVisibility(View.GONE);
                        q4BtnC.setVisibility(View.GONE);
                        q4BtnD.setVisibility(View.GONE);
                        blackboard4.setVisibility(View.GONE);

                        //set up next question
                        grid5.setVisibility(View.VISIBLE);
                        q5BtnA.setVisibility(View.VISIBLE);
                        q5BtnB.setVisibility(View.VISIBLE);
                        q5BtnC.setVisibility(View.VISIBLE);
                        q5BtnD.setVisibility(View.VISIBLE);
                        blackboard5.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ4A.show();
                break;

            case R.id.q4BtnB:
                AlertDialog.Builder dialogQ4B = new AlertDialog.Builder(this);
                dialogQ4B.setTitle("Wrong!");
                dialogQ4B.setMessage("0.58 is the correct answer!");
                dialogQ4B.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid4.setVisibility(View.GONE);
                        q4BtnA.setVisibility(View.GONE);
                        q4BtnB.setVisibility(View.GONE);
                        q4BtnC.setVisibility(View.GONE);
                        q4BtnD.setVisibility(View.GONE);
                        blackboard4.setVisibility(View.GONE);

                        //set up next question
                        grid5.setVisibility(View.VISIBLE);
                        q5BtnA.setVisibility(View.VISIBLE);
                        q5BtnB.setVisibility(View.VISIBLE);
                        q5BtnC.setVisibility(View.VISIBLE);
                        q5BtnD.setVisibility(View.VISIBLE);
                        blackboard5.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ4B.show();
                break;

            case R.id.q4BtnC:
                AlertDialog.Builder dialogQ4C = new AlertDialog.Builder(this);
                dialogQ4C.setTitle("Wrong!");
                dialogQ4C.setMessage("0.58 is the correct answer!");
                dialogQ4C.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid4.setVisibility(View.GONE);
                        q4BtnA.setVisibility(View.GONE);
                        q4BtnB.setVisibility(View.GONE);
                        q4BtnC.setVisibility(View.GONE);
                        q4BtnD.setVisibility(View.GONE);
                        blackboard4.setVisibility(View.GONE);

                        //set up next question
                        grid5.setVisibility(View.VISIBLE);
                        q5BtnA.setVisibility(View.VISIBLE);
                        q5BtnB.setVisibility(View.VISIBLE);
                        q5BtnC.setVisibility(View.VISIBLE);
                        q5BtnD.setVisibility(View.VISIBLE);
                        blackboard5.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ4C.show();
                break;

            case R.id.q4BtnD:
                AlertDialog.Builder dialogQ4D = new AlertDialog.Builder(this);
                dialogQ4D.setTitle("Wrong!");
                dialogQ4D.setMessage("0.58 is the correct answer!");
                dialogQ4D.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid4.setVisibility(View.GONE);
                        q4BtnA.setVisibility(View.GONE);
                        q4BtnB.setVisibility(View.GONE);
                        q4BtnC.setVisibility(View.GONE);
                        q4BtnD.setVisibility(View.GONE);
                        blackboard4.setVisibility(View.GONE);

                        //set up next question
                        grid5.setVisibility(View.VISIBLE);
                        q5BtnA.setVisibility(View.VISIBLE);
                        q5BtnB.setVisibility(View.VISIBLE);
                        q5BtnC.setVisibility(View.VISIBLE);
                        q5BtnD.setVisibility(View.VISIBLE);
                        blackboard5.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ4D.show();
                break;

            //Question 5

            case R.id.q5BtnA:
                //increment correct answer
                numCorr++;

                if (getApiClient().isConnected())
                    Games.Achievements.unlock(getApiClient(),
                            getString(R.string.maths_badge));
                Games.Leaderboards.submitScore(getApiClient(),
                        getString(R.string.maths_leaderboard),numCorr);
                AlertDialog.Builder dialogQ5A = new AlertDialog.Builder(this);
                dialogQ5A.setTitle("Hurray!");
                dialogQ5A.setMessage("59 is the correct answer!");
                dialogQ5A.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {


                        //set q1 to gone
                        grid5.setVisibility(View.GONE);
                        q5BtnA.setVisibility(View.GONE);
                        q5BtnB.setVisibility(View.GONE);
                        q5BtnC.setVisibility(View.GONE);
                        q5BtnD.setVisibility(View.GONE);
                        blackboard5.setVisibility(View.GONE);

                        //set up next question
                        grid6.setVisibility(View.VISIBLE);
                        q6BtnA.setVisibility(View.VISIBLE);
                        q6BtnB.setVisibility(View.VISIBLE);
                        q6BtnC.setVisibility(View.VISIBLE);
                        q6BtnD.setVisibility(View.VISIBLE);
                        blackboard6.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ5A.show();
                break;

            case R.id.q5BtnB:
                AlertDialog.Builder dialogQ5B = new AlertDialog.Builder(this);
                dialogQ5B.setTitle("Wrong!");
                dialogQ5B.setMessage("59 is the correct answer!");
                dialogQ5B.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid5.setVisibility(View.GONE);
                        q5BtnA.setVisibility(View.GONE);
                        q5BtnB.setVisibility(View.GONE);
                        q5BtnC.setVisibility(View.GONE);
                        q5BtnD.setVisibility(View.GONE);
                        blackboard5.setVisibility(View.GONE);

                        //set up next question
                        grid6.setVisibility(View.VISIBLE);
                        q6BtnA.setVisibility(View.VISIBLE);
                        q6BtnB.setVisibility(View.VISIBLE);
                        q6BtnC.setVisibility(View.VISIBLE);
                        q6BtnD.setVisibility(View.VISIBLE);
                        blackboard6.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ5B.show();
                break;

            case R.id.q5BtnC:
                AlertDialog.Builder dialogQ5C = new AlertDialog.Builder(this);
                dialogQ5C.setTitle("Wrong!");
                dialogQ5C.setMessage("59 is the correct answer!");
                dialogQ5C.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid5.setVisibility(View.GONE);
                        q5BtnA.setVisibility(View.GONE);
                        q5BtnB.setVisibility(View.GONE);
                        q5BtnC.setVisibility(View.GONE);
                        q5BtnD.setVisibility(View.GONE);
                        blackboard5.setVisibility(View.GONE);

                        //set up next question
                        grid6.setVisibility(View.VISIBLE);
                        q6BtnA.setVisibility(View.VISIBLE);
                        q6BtnB.setVisibility(View.VISIBLE);
                        q6BtnC.setVisibility(View.VISIBLE);
                        q6BtnD.setVisibility(View.VISIBLE);
                        blackboard6.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ5C.show();
                break;

            case R.id.q5BtnD:
                AlertDialog.Builder dialogQ5D = new AlertDialog.Builder(this);
                dialogQ5D.setTitle("Wrong!");
                dialogQ5D.setMessage("59 is the correct answer!");
                dialogQ5D.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid5.setVisibility(View.GONE);
                        q5BtnA.setVisibility(View.GONE);
                        q5BtnB.setVisibility(View.GONE);
                        q5BtnC.setVisibility(View.GONE);
                        q5BtnD.setVisibility(View.GONE);
                        blackboard5.setVisibility(View.GONE);

                        //set up next question
                        grid6.setVisibility(View.VISIBLE);
                        q6BtnA.setVisibility(View.VISIBLE);
                        q6BtnB.setVisibility(View.VISIBLE);
                        q6BtnC.setVisibility(View.VISIBLE);
                        q6BtnD.setVisibility(View.VISIBLE);
                        blackboard6.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ5D.show();
                break;

            case R.id.q6BtnA:
                //increment correct answer
                numCorr++;
                if (getApiClient().isConnected())
                    Games.Achievements.unlock(getApiClient(),
                            getString(R.string.maths_badge));
                Games.Leaderboards.submitScore(getApiClient(),
                        getString(R.string.maths_leaderboard),numCorr);
                AlertDialog.Builder dialogQ6A = new AlertDialog.Builder(this);
                dialogQ6A.setTitle("Hurray!");
                dialogQ6A.setMessage("1,211 is the correct answer!");
                dialogQ6A.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {



                        //set q1 to gone
                        grid6.setVisibility(View.GONE);
                        q6BtnA.setVisibility(View.GONE);
                        q6BtnB.setVisibility(View.GONE);
                        q6BtnC.setVisibility(View.GONE);
                        q6BtnD.setVisibility(View.GONE);
                        blackboard6.setVisibility(View.GONE);

                        //set up next question
                        grid7.setVisibility(View.VISIBLE);
                        q7BtnA.setVisibility(View.VISIBLE);
                        q7BtnB.setVisibility(View.VISIBLE);
                        q7BtnC.setVisibility(View.VISIBLE);
                        q7BtnD.setVisibility(View.VISIBLE);
                        blackboard7.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ6A.show();
                break;

            case R.id.q6BtnB:
                AlertDialog.Builder dialogQ6B = new AlertDialog.Builder(this);
                dialogQ6B.setTitle("Wrong!");
                dialogQ6B.setMessage("1,211 is the correct answer!");
                dialogQ6B.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid6.setVisibility(View.GONE);
                        q6BtnA.setVisibility(View.GONE);
                        q6BtnB.setVisibility(View.GONE);
                        q6BtnC.setVisibility(View.GONE);
                        q6BtnD.setVisibility(View.GONE);
                        blackboard6.setVisibility(View.GONE);

                        //set up next question
                        grid7.setVisibility(View.VISIBLE);
                        q7BtnA.setVisibility(View.VISIBLE);
                        q7BtnB.setVisibility(View.VISIBLE);
                        q7BtnC.setVisibility(View.VISIBLE);
                        q7BtnD.setVisibility(View.VISIBLE);
                        blackboard7.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ6B.show();
                break;

            case R.id.q6BtnC:
                AlertDialog.Builder dialogQ6C = new AlertDialog.Builder(this);
                dialogQ6C.setTitle("Wrong!");
                dialogQ6C.setMessage("1,211 is the correct answer!");
                dialogQ6C.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid6.setVisibility(View.GONE);
                        q6BtnA.setVisibility(View.GONE);
                        q6BtnB.setVisibility(View.GONE);
                        q6BtnC.setVisibility(View.GONE);
                        q6BtnD.setVisibility(View.GONE);
                        blackboard6.setVisibility(View.GONE);

                        //set up next question
                        grid7.setVisibility(View.VISIBLE);
                        q7BtnA.setVisibility(View.VISIBLE);
                        q7BtnB.setVisibility(View.VISIBLE);
                        q7BtnC.setVisibility(View.VISIBLE);
                        q7BtnD.setVisibility(View.VISIBLE);
                        blackboard7.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ6C.show();
                break;

            case R.id.q6BtnD:
                AlertDialog.Builder dialogQ6D = new AlertDialog.Builder(this);
                dialogQ6D.setTitle("Wrong!");
                dialogQ6D.setMessage("1,211 is the correct answer!");
                dialogQ6D.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid6.setVisibility(View.GONE);
                        q6BtnA.setVisibility(View.GONE);
                        q6BtnB.setVisibility(View.GONE);
                        q6BtnC.setVisibility(View.GONE);
                        q6BtnD.setVisibility(View.GONE);
                        blackboard6.setVisibility(View.GONE);

                        //set up next question
                        grid7.setVisibility(View.VISIBLE);
                        q7BtnA.setVisibility(View.VISIBLE);
                        q7BtnB.setVisibility(View.VISIBLE);
                        q7BtnC.setVisibility(View.VISIBLE);
                        q7BtnD.setVisibility(View.VISIBLE);
                        blackboard7.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ6D.show();
                break;

            //question 7

            case R.id.q7BtnA:
                //increment correct answer
                numCorr++;
                if (getApiClient().isConnected())
                    Games.Achievements.unlock(getApiClient(),
                            getString(R.string.maths_badge));
                Games.Leaderboards.submitScore(getApiClient(),
                        getString(R.string.maths_leaderboard),numCorr);
                AlertDialog.Builder dialogQ7A = new AlertDialog.Builder(this);
                dialogQ7A.setTitle("Hurray!");
                dialogQ7A.setMessage("11,552 is the correct answer!");
                dialogQ7A.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {



                        //set q1 to gone
                        grid7.setVisibility(View.GONE);
                        q7BtnA.setVisibility(View.GONE);
                        q7BtnB.setVisibility(View.GONE);
                        q7BtnC.setVisibility(View.GONE);
                        q7BtnD.setVisibility(View.GONE);
                        blackboard7.setVisibility(View.GONE);

                        //set up next question
                        grid8.setVisibility(View.VISIBLE);
                        q8BtnA.setVisibility(View.VISIBLE);
                        q8BtnB.setVisibility(View.VISIBLE);
                        q8BtnC.setVisibility(View.VISIBLE);
                        q8BtnD.setVisibility(View.VISIBLE);
                        blackboard8.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ7A.show();
                break;

            case R.id.q7BtnB:
                AlertDialog.Builder dialogQ7B = new AlertDialog.Builder(this);
                dialogQ7B.setTitle("Wrong!");
                dialogQ7B.setMessage("11,552 is the correct answer!");
                dialogQ7B.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid7.setVisibility(View.GONE);
                        q7BtnA.setVisibility(View.GONE);
                        q7BtnB.setVisibility(View.GONE);
                        q7BtnC.setVisibility(View.GONE);
                        q7BtnD.setVisibility(View.GONE);
                        blackboard7.setVisibility(View.GONE);

                        //set up next question
                        grid8.setVisibility(View.VISIBLE);
                        q8BtnA.setVisibility(View.VISIBLE);
                        q8BtnB.setVisibility(View.VISIBLE);
                        q8BtnC.setVisibility(View.VISIBLE);
                        q8BtnD.setVisibility(View.VISIBLE);
                        blackboard8.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ7B.show();
                break;

            case R.id.q7BtnC:
                AlertDialog.Builder dialogQ7C = new AlertDialog.Builder(this);
                dialogQ7C.setTitle("Wrong!");
                dialogQ7C.setMessage("11,552 is the correct answer!");
                dialogQ7C.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid7.setVisibility(View.GONE);
                        q7BtnA.setVisibility(View.GONE);
                        q7BtnB.setVisibility(View.GONE);
                        q7BtnC.setVisibility(View.GONE);
                        q7BtnD.setVisibility(View.GONE);
                        blackboard7.setVisibility(View.GONE);

                        //set up next question
                        grid8.setVisibility(View.VISIBLE);
                        q8BtnA.setVisibility(View.VISIBLE);
                        q8BtnB.setVisibility(View.VISIBLE);
                        q8BtnC.setVisibility(View.VISIBLE);
                        q8BtnD.setVisibility(View.VISIBLE);
                        blackboard8.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ7C.show();
                break;

            case R.id.q7BtnD:
                AlertDialog.Builder dialogQ7D = new AlertDialog.Builder(this);
                dialogQ7D.setTitle("Wrong!");
                dialogQ7D.setMessage("11,552 is the correct answer!");
                dialogQ7D.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid7.setVisibility(View.GONE);
                        q7BtnA.setVisibility(View.GONE);
                        q7BtnB.setVisibility(View.GONE);
                        q7BtnC.setVisibility(View.GONE);
                        q7BtnD.setVisibility(View.GONE);
                        blackboard7.setVisibility(View.GONE);

                        //set up next question
                        grid8.setVisibility(View.VISIBLE);
                        q8BtnA.setVisibility(View.VISIBLE);
                        q8BtnB.setVisibility(View.VISIBLE);
                        q8BtnC.setVisibility(View.VISIBLE);
                        q8BtnD.setVisibility(View.VISIBLE);
                        blackboard8.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ7D.show();
                break;

            //question 8

            case R.id.q8BtnA:
                //increment correct answer
                numCorr++;
                if (getApiClient().isConnected())
                    Games.Achievements.unlock(getApiClient(),
                            getString(R.string.maths_badge));
                Games.Leaderboards.submitScore(getApiClient(),
                        getString(R.string.maths_leaderboard),numCorr);
                AlertDialog.Builder dialogQ8A = new AlertDialog.Builder(this);
                dialogQ8A.setTitle("Hurray!");
                dialogQ8A.setMessage("13.29 is the correct answer!");
                dialogQ8A.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {



                        //set q1 to gone
                        grid8.setVisibility(View.GONE);
                        q8BtnA.setVisibility(View.GONE);
                        q8BtnB.setVisibility(View.GONE);
                        q8BtnC.setVisibility(View.GONE);
                        q8BtnD.setVisibility(View.GONE);
                        blackboard8.setVisibility(View.GONE);

                        //set up next question
                        grid9.setVisibility(View.VISIBLE);
                        q9BtnA.setVisibility(View.VISIBLE);
                        q9BtnB.setVisibility(View.VISIBLE);
                        q9BtnC.setVisibility(View.VISIBLE);
                        q9BtnD.setVisibility(View.VISIBLE);
                        blackboard9.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ8A.show();
                break;

            case R.id.q8BtnB:
                AlertDialog.Builder dialogQ8B = new AlertDialog.Builder(this);
                dialogQ8B.setTitle("Wrong!");
                dialogQ8B.setMessage("13.29 is the correct answer!");
                dialogQ8B.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid8.setVisibility(View.GONE);
                        q8BtnA.setVisibility(View.GONE);
                        q8BtnB.setVisibility(View.GONE);
                        q8BtnC.setVisibility(View.GONE);
                        q8BtnD.setVisibility(View.GONE);
                        blackboard8.setVisibility(View.GONE);

                        //set up next question
                        grid9.setVisibility(View.VISIBLE);
                        q9BtnA.setVisibility(View.VISIBLE);
                        q9BtnB.setVisibility(View.VISIBLE);
                        q9BtnC.setVisibility(View.VISIBLE);
                        q9BtnD.setVisibility(View.VISIBLE);
                        blackboard9.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ8B.show();
                break;

            case R.id.q8BtnC:
                AlertDialog.Builder dialogQ8C = new AlertDialog.Builder(this);
                dialogQ8C.setTitle("Wrong!");
                dialogQ8C.setMessage("13.29 is the correct answer!");
                dialogQ8C.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid8.setVisibility(View.GONE);
                        q8BtnA.setVisibility(View.GONE);
                        q8BtnB.setVisibility(View.GONE);
                        q8BtnC.setVisibility(View.GONE);
                        q8BtnD.setVisibility(View.GONE);
                        blackboard8.setVisibility(View.GONE);

                        //set up next question
                        grid9.setVisibility(View.VISIBLE);
                        q9BtnA.setVisibility(View.VISIBLE);
                        q9BtnB.setVisibility(View.VISIBLE);
                        q9BtnC.setVisibility(View.VISIBLE);
                        q9BtnD.setVisibility(View.VISIBLE);
                        blackboard9.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ8C.show();
                break;

            case R.id.q8BtnD:
                AlertDialog.Builder dialogQ8D = new AlertDialog.Builder(this);
                dialogQ8D.setTitle("Wrong!");
                dialogQ8D.setMessage("13.29 is the correct answer!");
                dialogQ8D.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid8.setVisibility(View.GONE);
                        q8BtnA.setVisibility(View.GONE);
                        q8BtnB.setVisibility(View.GONE);
                        q8BtnC.setVisibility(View.GONE);
                        q8BtnD.setVisibility(View.GONE);
                        blackboard8.setVisibility(View.GONE);

                        //set up next question
                        grid9.setVisibility(View.VISIBLE);
                        q9BtnA.setVisibility(View.VISIBLE);
                        q9BtnB.setVisibility(View.VISIBLE);
                        q9BtnC.setVisibility(View.VISIBLE);
                        q9BtnD.setVisibility(View.VISIBLE);
                        blackboard9.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ8D.show();
                break;

            //question 9

            case R.id.q9BtnA:
                //increment correct answer
                numCorr++;
                if (getApiClient().isConnected())
                    Games.Achievements.unlock(getApiClient(),
                            getString(R.string.maths_badge));
                Games.Leaderboards.submitScore(getApiClient(),
                        getString(R.string.maths_leaderboard),numCorr);
                AlertDialog.Builder dialogQ9A = new AlertDialog.Builder(this);
                dialogQ9A.setTitle("Wrong!");
                dialogQ9A.setMessage("0.8 is the correct answer!");
                dialogQ9A.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {



                        //set q1 to gone
                        grid9.setVisibility(View.GONE);
                        q9BtnA.setVisibility(View.GONE);
                        q9BtnB.setVisibility(View.GONE);
                        q9BtnC.setVisibility(View.GONE);
                        q9BtnD.setVisibility(View.GONE);
                        blackboard9.setVisibility(View.GONE);

                        //set up next question
                        grid10.setVisibility(View.VISIBLE);
                        q10BtnA.setVisibility(View.VISIBLE);
                        q10BtnB.setVisibility(View.VISIBLE);
                        q10BtnC.setVisibility(View.VISIBLE);
                        q10BtnD.setVisibility(View.VISIBLE);
                        blackboard10.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ9A.show();
                break;

            case R.id.q9BtnB:
                AlertDialog.Builder dialogQ9B = new AlertDialog.Builder(this);
                dialogQ9B.setTitle("Wrong!");
                dialogQ9B.setMessage("0.8 is the correct answer!");
                dialogQ9B.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid9.setVisibility(View.GONE);
                        q9BtnA.setVisibility(View.GONE);
                        q9BtnB.setVisibility(View.GONE);
                        q9BtnC.setVisibility(View.GONE);
                        q9BtnD.setVisibility(View.GONE);
                        blackboard9.setVisibility(View.GONE);

                        //set up next question
                        grid10.setVisibility(View.VISIBLE);
                        q10BtnA.setVisibility(View.VISIBLE);
                        q10BtnB.setVisibility(View.VISIBLE);
                        q10BtnC.setVisibility(View.VISIBLE);
                        q10BtnD.setVisibility(View.VISIBLE);
                        blackboard10.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ9B.show();
                break;

            case R.id.q9BtnC:
                AlertDialog.Builder dialogQ9C = new AlertDialog.Builder(this);
                dialogQ9C.setTitle("Wrong!");
                dialogQ9C.setMessage("0.8 is the correct answer!");
                dialogQ9C.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid9.setVisibility(View.GONE);
                        q9BtnA.setVisibility(View.GONE);
                        q9BtnB.setVisibility(View.GONE);
                        q9BtnC.setVisibility(View.GONE);
                        q9BtnD.setVisibility(View.GONE);
                        blackboard9.setVisibility(View.GONE);

                        //set up next question
                        grid10.setVisibility(View.VISIBLE);
                        q10BtnA.setVisibility(View.VISIBLE);
                        q10BtnB.setVisibility(View.VISIBLE);
                        q10BtnC.setVisibility(View.VISIBLE);
                        q10BtnD.setVisibility(View.VISIBLE);
                        blackboard10.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ9C.show();
                break;

            case R.id.q9BtnD:
                AlertDialog.Builder dialogQ9D = new AlertDialog.Builder(this);
                dialogQ9D.setTitle("Wrong!");
                dialogQ9D.setMessage("0.8 is the correct answer!");
                dialogQ9D.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid9.setVisibility(View.GONE);
                        q9BtnA.setVisibility(View.GONE);
                        q9BtnB.setVisibility(View.GONE);
                        q9BtnC.setVisibility(View.GONE);
                        q9BtnD.setVisibility(View.GONE);
                        blackboard9.setVisibility(View.GONE);

                        //set up next question
                        grid10.setVisibility(View.VISIBLE);
                        q10BtnA.setVisibility(View.VISIBLE);
                        q10BtnB.setVisibility(View.VISIBLE);
                        q10BtnC.setVisibility(View.VISIBLE);
                        q10BtnD.setVisibility(View.VISIBLE);
                        blackboard10.setVisibility(View.VISIBLE);
                    }
                });

                dialogQ9D.show();
                break;

            //question 10
            case R.id.q10BtnA:
                //increment correct answer
                numCorr++;
                if (getApiClient().isConnected())
                    Games.Achievements.unlock(getApiClient(),
                            getString(R.string.maths_badge));
                Games.Leaderboards.submitScore(getApiClient(),
                        getString(R.string.maths_leaderboard),numCorr);
                AlertDialog.Builder dialogQ10A = new AlertDialog.Builder(this);
                dialogQ10A.setTitle("Hurray!");
                dialogQ10A.setMessage("228 is the correct answer!");
                dialogQ10A.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {


                        //set q1 to gone
                        grid10.setVisibility(View.GONE);
                        q10BtnA.setVisibility(View.GONE);
                        q10BtnB.setVisibility(View.GONE);
                        q10BtnC.setVisibility(View.GONE);
                        q10BtnD.setVisibility(View.GONE);
                        blackboard10.setVisibility(View.GONE);

                        //set up scoreboard
                        finish.setVisibility(View.VISIBLE);

                        //Display score


                        score.setText("Your overall score is "+numCorr);


                    }
                });

                dialogQ10A.show();
                break;

            case R.id.q10BtnB:
                AlertDialog.Builder dialogQ10B = new AlertDialog.Builder(this);
                dialogQ10B.setTitle("Wrong!");
                dialogQ10B.setMessage("228 is the correct answer!");
                dialogQ10B.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid10.setVisibility(View.GONE);
                        q10BtnA.setVisibility(View.GONE);
                        q10BtnB.setVisibility(View.GONE);
                        q10BtnC.setVisibility(View.GONE);
                        q10BtnD.setVisibility(View.GONE);
                        blackboard10.setVisibility(View.GONE);

                        //set up scoreboard
                        finish.setVisibility(View.VISIBLE);

                        //Display score


                        score.setText("Your overall score is "+numCorr);

                    }
                });

                dialogQ10B.show();
                break;

            case R.id.q10BtnC:
                AlertDialog.Builder dialogQ10C = new AlertDialog.Builder(this);
                dialogQ10C.setTitle("Wrong!");
                dialogQ10C.setMessage("228 is the correct answer!");
                dialogQ10C.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid10.setVisibility(View.GONE);
                        q10BtnA.setVisibility(View.GONE);
                        q10BtnB.setVisibility(View.GONE);
                        q10BtnC.setVisibility(View.GONE);
                        q10BtnD.setVisibility(View.GONE);
                        blackboard10.setVisibility(View.GONE);

                        //set up scoreboard
                        finish.setVisibility(View.VISIBLE);

                        //Display score

                        score.setText("Your overall score is "+numCorr+"%");

                    }
                });

                dialogQ10C.show();
                break;

            case R.id.q10BtnD:
                AlertDialog.Builder dialogQ10D = new AlertDialog.Builder(this);
                dialogQ10D.setTitle("Wrong!");
                dialogQ10D.setMessage("228 is the correct answer!");
                dialogQ10D.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid10.setVisibility(View.GONE);
                        q10BtnA.setVisibility(View.GONE);
                        q10BtnB.setVisibility(View.GONE);
                        q10BtnC.setVisibility(View.GONE);
                        q10BtnD.setVisibility(View.GONE);
                        blackboard10.setVisibility(View.GONE);

                        //set up scoreboard
                        finish.setVisibility(View.VISIBLE);

                        //Display score

                        score.setText("Your overall score is "+numCorr);
                    }
                });

                dialogQ10D.show();
                break;


        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quiz, menu);
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

