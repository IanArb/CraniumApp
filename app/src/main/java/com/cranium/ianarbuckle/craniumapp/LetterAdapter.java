package com.cranium.ianarbuckle.craniumapp;

/**
 * Date: 15/04/2015
 * Author: Ian Arbuckle
 * Reference: http://code.tutsplus.com/tutorials/create-a-hangman-game-user-interaction--mobile-21893
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

public class LetterAdapter extends BaseAdapter {

    private String[] letters;
    private String[] space;
    private LayoutInflater letterInf;

    public LetterAdapter(Context c) {
        //setup adapter
        letters = new String[26];


        for (int a = 0; a < letters.length; a++) {
            letters[a] = "" + (char) (a + 'A');
            letterInf = LayoutInflater.from(c);
        }

    }


    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return letters.length;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //create a button for the letter at this position in the alphabet
        Button letterBtn;
        if (convertView == null) {
            //inflate the button layout
            letterBtn = (Button) letterInf.inflate(R.layout.letter, parent, false);
        } else {
            letterBtn = (Button) convertView;
        }
        //set the text to this letter
        letterBtn.setText(letters[position]);
        return letterBtn;
    }
}
