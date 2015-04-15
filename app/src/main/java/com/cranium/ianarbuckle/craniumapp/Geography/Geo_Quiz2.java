package com.cranium.ianarbuckle.craniumapp.Geography;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.DragShadowBuilder;
import android.view.View.OnDragListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.cranium.ianarbuckle.craniumapp.R;
import com.cranium.ianarbuckle.craniumapp.com.cranium.ianarbuckle.craniumapp.game.BaseGameActivity;
import com.google.android.gms.games.Games;

/*
 *
 *
 *
 *
 *
Date 15/04/2015
 *
 *
@author Cillian Murray
@reference http://www.vogella.com/tutorials/AndroidDragAndDrop/article.html
 *
 */


public class Geo_Quiz2 extends BaseGameActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo__quiz2);

        //images
        findViewById(R.id.imageAlabama).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.imageArizona).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.imageCalifornia).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.imageKentucy).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.imageKansas).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.imageMinnesota).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.imageNewYork).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.imageMonoglia).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.imageLouisiana).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.imageFlorida).setOnTouchListener(new MyTouchListener());

        //containers
        findViewById(R.id.alabama).setOnDragListener(new MyDragListener());
        findViewById(R.id.arizona).setOnDragListener(new MyDragListener());
        findViewById(R.id.california).setOnDragListener(new MyDragListener());
        findViewById(R.id.kentucy).setOnDragListener(new MyDragListener());
        findViewById(R.id.kansas).setOnDragListener(new MyDragListener());
        findViewById(R.id.minnesota).setOnDragListener(new MyDragListener());
        findViewById(R.id.newyork).setOnDragListener(new MyDragListener());
        findViewById(R.id.mongolia).setOnDragListener(new MyDragListener());
        findViewById(R.id.louisiana).setOnDragListener(new MyDragListener());
        findViewById(R.id.florida).setOnDragListener(new MyDragListener());

        //Google Games Services
        findViewById(R.id.badges);
        findViewById(R.id.leaders);


    }

    public void OnClick(View v) {
        switch (v.getId()) {
            case R.id.badges:
                startActivityForResult(Games.Achievements.getAchievementsIntent(
                        getApiClient()), 1);
                break;
            case R.id.leaders:
                startActivityForResult(Games.Leaderboards.getLeaderboardIntent(
                        getApiClient(), getString(R.string.geo_leaderboard)),2);
                break;
            case R.id.help:
                AlertDialog.Builder help = new AlertDialog.Builder(this);
                help.setTitle("How to Play?");
                help.setMessage("You drag the flag to it's correct position");
                help.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){

                    }
                });
                help.show();

                break;
            case R.id.exitBtn:
                Intent e = new Intent(this, GeographyActivity.class);
                startActivity(e);
                break;
        }
    }

    @Override
    public void onSignInFailed() {

    }

    @Override
    public void onSignInSucceeded() {

    }

    private final class MyTouchListener implements OnTouchListener {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                ClipData data = ClipData.newPlainText("", "");
                DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
                view.startDrag(data, shadowBuilder, view, 0);
                view.setVisibility(View.INVISIBLE);
                return true;
            } else {
                return false;
            }
        }
    }

    class MyDragListener implements OnDragListener {

        @Override
        public boolean onDrag(View v, DragEvent event) {
            int action = event.getAction();
            switch (event.getAction()) {
                case DragEvent.ACTION_DRAG_STARTED:
                    // do nothing
                    break;
                case DragEvent.ACTION_DRAG_ENTERED:


                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    //do nothing
                    break;
                case DragEvent.ACTION_DROP:
                    // Dropped, reassign View to ViewGroup
                    View view = (View) event.getLocalState();
                    ViewGroup owner = (ViewGroup) view.getParent();
                    owner.removeView(view);
                    LinearLayout container = (LinearLayout) v;
                    container.addView(view);
                    view.setVisibility(View.VISIBLE);




                    break;
                case DragEvent.ACTION_DRAG_ENDED:


                default:
                    break;


            }
            return true;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_geo__quiz1, menu);
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
