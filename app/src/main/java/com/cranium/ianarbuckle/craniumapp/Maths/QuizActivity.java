package com.cranium.ianarbuckle.craniumapp.Maths;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cranium.ianarbuckle.craniumapp.R;


public class QuizActivity extends ActionBarActivity {

    private GridLayout grid1, grid2, grid3, grid4, grid5, grid6, grid7, grid8, grid9, grid10;
    private RelativeLayout blackboard1, blackboard2, blackboard3, blackboard4, blackboard5, blackboard6, blackboard7, blackboard8, blackboard9, blackboard10;

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

    private TextView q1Text, q2Text, q3Text, q4Text, q5Text, q6Text, q7Text, q8Text,  q9Text, q10Text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        //referencing game buttons

        //Question 1

        //Grid Layout

        grid1 = (GridLayout)findViewById(R.id.grid1);

        //Relative Layout (blackboard)

        blackboard1 = (RelativeLayout)findViewById(R.id.q1);

        //question

        q1Text = (TextView)findViewById(R.id.question1aText);



        //buttons

        q1BtnA=(ImageButton)findViewById(R.id.q1BtnA);
        q1BtnB=(ImageButton)findViewById(R.id.q1BtnB);
        q1BtnC=(ImageButton)findViewById(R.id.q1BtnC);
        q1BtnD=(ImageButton)findViewById(R.id.q1BtnD);

        //Question 2

        //Grid Layout

        grid2 = (GridLayout)findViewById(R.id.grid2);

        //Relative Layout (blackboard)

        blackboard2 = (RelativeLayout)findViewById(R.id.q2);

        //question

        q2Text = (TextView)findViewById(R.id.q2Text);

        //buttons

        q2BtnA = (ImageButton)findViewById(R.id.q2BtnA);
        q2BtnB = (ImageButton)findViewById(R.id.q2BtnB);
        q2BtnC = (ImageButton)findViewById(R.id.q2BtnC);
        q2BtnD = (ImageButton)findViewById(R.id.q2BtnD);

        //Question 3

        //Grid Layout

        grid3 = (GridLayout)findViewById(R.id.grid3);

        //Relative Layout (blackboard)

        //question

        q3Text = (TextView)findViewById(R.id.q3Text);

        blackboard3 = (RelativeLayout)findViewById(R.id.q3);

        //buttons

        q3BtnA = (ImageButton)findViewById(R.id.q3BtnA);
        q3BtnB = (ImageButton)findViewById(R.id.q3BtnB);
        q3BtnC = (ImageButton)findViewById(R.id.q3BtnC);
        q3BtnD = (ImageButton)findViewById(R.id.q3BtnD);

        //Question 4

        //Grid Layout

        grid4 = (GridLayout)findViewById(R.id.grid4);

        //question

        q4Text = (TextView)findViewById(R.id.q4Text);

        //Relative Layout (blackboard)

        blackboard4 = (RelativeLayout)findViewById(R.id.q4);

        //buttons

        q4BtnA = (ImageButton)findViewById(R.id.q4BtnA);
        q4BtnB = (ImageButton)findViewById(R.id.q4BtnB);
        q4BtnC = (ImageButton)findViewById(R.id.q4BtnC);
        q4BtnD = (ImageButton)findViewById(R.id.q4BtnD);

        //Question 5

        //Grid Layout

        grid5 = (GridLayout)findViewById(R.id.grid5);

        //question

        q5Text = (TextView)findViewById(R.id.q5Text);

        //Relative Layout (blackboard)

        blackboard5 = (RelativeLayout)findViewById(R.id.q5);

        //buttons

        q5BtnA = (ImageButton)findViewById(R.id.q5BtnA);
        q5BtnB = (ImageButton)findViewById(R.id.q5BtnB);
        q5BtnC = (ImageButton)findViewById(R.id.q5BtnC);
        q5BtnD = (ImageButton)findViewById(R.id.q5BtnD);

        //Question 6

        //Grid Layout

        grid6 = (GridLayout)findViewById(R.id.grid6);

        //question

        q6Text = (TextView)findViewById(R.id.q6Text);

        //Relative Layout (blackboard)

        blackboard6 = (RelativeLayout)findViewById(R.id.q6);

        //buttons

        q6BtnA = (ImageButton)findViewById(R.id.q6BtnA);
        q6BtnB = (ImageButton)findViewById(R.id.q6BtnB);
        q6BtnC = (ImageButton)findViewById(R.id.q6BtnC);
        q6BtnD = (ImageButton)findViewById(R.id.q6BtnD);

        //Question 7

        //Grid Layout

        grid7 = (GridLayout)findViewById(R.id.grid7);

        //question

        q7Text = (TextView)findViewById(R.id.q7Text);

        //Relative Layout (blackboard)

        blackboard7 = (RelativeLayout)findViewById(R.id.q7);

        //buttons

        q7BtnA = (ImageButton)findViewById(R.id.q7BtnA);
        q7BtnB = (ImageButton)findViewById(R.id.q7BtnB);
        q7BtnC = (ImageButton)findViewById(R.id.q7BtnC);
        q7BtnD = (ImageButton)findViewById(R.id.q7BtnD);

        //Question 8

        //Grid Layout

        grid8 = (GridLayout)findViewById(R.id.grid8);

        //question

        q8Text = (TextView)findViewById(R.id.q8Text);

        //Relative Layout (blackboard)

        blackboard8 = (RelativeLayout)findViewById(R.id.q8);

        //buttons

        q8BtnA = (ImageButton)findViewById(R.id.q8BtnA);
        q8BtnB = (ImageButton)findViewById(R.id.q8BtnB);
        q8BtnC = (ImageButton)findViewById(R.id.q8BtnC);
        q8BtnD = (ImageButton)findViewById(R.id.q8BtnD);

        //Question 9

        //Grid Layout

        grid9 = (GridLayout)findViewById(R.id.grid9);

        //question

        q9Text = (TextView)findViewById(R.id.q9Text);

        //Relative Layout (blackboard)

        blackboard9 = (RelativeLayout)findViewById(R.id.q9);

        //buttons

        q9BtnA = (ImageButton)findViewById(R.id.q9BtnA);
        q9BtnB = (ImageButton)findViewById(R.id.q9BtnB);
        q9BtnC = (ImageButton)findViewById(R.id.q9BtnC);
        q9BtnD = (ImageButton)findViewById(R.id.q9BtnD);

        //Question 10

        //Grid Layout

        grid10 = (GridLayout)findViewById(R.id.grid10);

        //question

        q10Text = (TextView)findViewById(R.id.q10Text);

        //Relative Layout (blackboard)

        blackboard10 = (RelativeLayout)findViewById(R.id.q10);

        //buttons

        q10BtnA = (ImageButton)findViewById(R.id.q10BtnA);
        q10BtnB = (ImageButton)findViewById(R.id.q10BtnB);
        q10BtnC = (ImageButton)findViewById(R.id.q10BtnC);
        q10BtnD = (ImageButton)findViewById(R.id.q10BtnD);



    }

    public void GameBtns(View v){
        switch(v.getId()){
            case R.id.q1BtnA:
                AlertDialog.Builder ans = new AlertDialog.Builder(this);
                ans.setTitle("Hurray!");
                ans.setMessage("50 is the correct answer!");
                ans.setPositiveButton("Next Question", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid1.setVisibility(View.GONE);
                        q1BtnA.setVisibility(View.GONE);
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

                ans.show();

                break;
            case R.id.q1BtnB:
                AlertDialog.Builder ans2 = new AlertDialog.Builder(this);
                ans2.setTitle("Sorry hoss that's wrong!");
                ans2.setMessage("50 is the correct answer!");
                ans2.setPositiveButton("Next Question", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid1.setVisibility(View.GONE);
                        q1BtnA.setVisibility(View.GONE);
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

                ans2.show();

                break;
            case R.id.q1BtnC:

                AlertDialog.Builder ans3 = new AlertDialog.Builder(this);
                ans3.setTitle("Sorry hoss that's wrong!");
                ans3.setMessage("50 is the correct answer!");
                ans3.setPositiveButton("Next Question", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid1.setVisibility(View.GONE);
                        q1BtnA.setVisibility(View.GONE);
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

                ans3.show();

                break;
            case R.id.q1BtnD:

                AlertDialog.Builder ans4 = new AlertDialog.Builder(this);
                ans4.setTitle("Sorry hoss that's wrong!");
                ans4.setMessage("50 is the correct answer!");
                ans4.setPositiveButton("Next Question", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid1.setVisibility(View.GONE);
                        q1BtnA.setVisibility(View.GONE);
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
                ans4.show();

                break;

            //question 2

            case R.id.q2BtnA:

                AlertDialog.Builder ans5 = new AlertDialog.Builder(this);
                ans5.setTitle("Hurray!");
                ans5.setMessage("525 is the correct answer!");
                ans5.setPositiveButton("Next Question", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid2.setVisibility(View.GONE);
                        q2BtnA.setVisibility(View.GONE);
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
                ans5.show();

                break;

            case R.id.q2BtnB:

                AlertDialog.Builder ans6 = new AlertDialog.Builder(this);
                ans6.setTitle("Sorry hoss, that's wrong!");
                ans6.setMessage("525 is the correct answer!");
                ans6.setPositiveButton("Next Question", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid2.setVisibility(View.GONE);
                        q2BtnA.setVisibility(View.GONE);
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
                ans6.show();

                break;

            case R.id.q2BtnC:

                AlertDialog.Builder ans7 = new AlertDialog.Builder(this);
                ans7.setTitle("Sorry hoss, that's wrong!");
                ans7.setMessage("525 is the correct answer!");
                ans7.setPositiveButton("Next Question", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid2.setVisibility(View.GONE);
                        q2BtnA.setVisibility(View.GONE);
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
                ans7.show();

                break;

            case R.id.q2BtnD:

                AlertDialog.Builder ans8 = new AlertDialog.Builder(this);
                ans8.setTitle("Sorry hoss, that's wrong!");
                ans8.setMessage("255 is the correct answer!");
                ans8.setPositiveButton("Next Question", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //set q1 to gone
                        grid2.setVisibility(View.GONE);
                        q2BtnA.setVisibility(View.GONE);
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
                ans8.show();

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
