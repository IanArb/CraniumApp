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


public class Geo_Quiz2 extends BaseGameActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo__quiz1);

        //images
        findViewById(R.id.imageBritain).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.imageIreland).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.imageFrance).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.imageDenmark).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.imageGermany).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.imageItaly).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.imageSpain).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.imageSweden).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.imageSwiss).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.imagePoland).setOnTouchListener(new MyTouchListener());

        //containers
        findViewById(R.id.ireland).setOnDragListener(new MyDragListener());
        findViewById(R.id.britain).setOnDragListener(new MyDragListener());
        findViewById(R.id.france).setOnDragListener(new MyDragListener());
        findViewById(R.id.germany).setOnDragListener(new MyDragListener());
        findViewById(R.id.spain).setOnDragListener(new MyDragListener());
        findViewById(R.id.poland).setOnDragListener(new MyDragListener());
        findViewById(R.id.switzerland).setOnDragListener(new MyDragListener());
        findViewById(R.id.sweden).setOnDragListener(new MyDragListener());
        findViewById(R.id.italy).setOnDragListener(new MyDragListener());
        findViewById(R.id.denmark).setOnDragListener(new MyDragListener());

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
