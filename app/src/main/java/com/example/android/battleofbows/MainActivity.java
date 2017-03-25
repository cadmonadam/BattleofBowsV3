package com.example.android.battleofbows;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String SCOREA_STATE = "scoreArcher";
    private static final String SCOREB_STATE = "scoreBowman";
    //Shows the score for Archer. Archer refers to player1 on the left side.
    int scoreArcher = 0;
    //Shows the score for Bowman. Bowman refers to player2 on the left side.
    int scoreBowman = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(SCOREA_STATE, scoreArcher);
        outState.putInt(SCOREB_STATE, scoreBowman);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreArcher = savedInstanceState.getInt(SCOREA_STATE);
        scoreBowman = savedInstanceState.getInt(SCOREB_STATE);
        displayForArcher(scoreArcher);
        displayForBowman(scoreBowman);

    }


    /**
     * Increase the score for Archer by 10 points.
     */
    public void addTenForArcher(View v) {
        scoreArcher += 10;
        displayForArcher(scoreArcher);
    }

    /**
     * Increase the score for Archer by 9 points.
     */
    public void addNineForArcher(View v) {
        scoreArcher += 9;
        displayForArcher(scoreArcher);
    }

    /**
     * Increase the score for Archer by 7 points.
     */
    public void addSevenForArcher(View v) {
        scoreArcher += 7;
        displayForArcher(scoreArcher);
    }

    /**
     * Increase the score for Archer by 5 points.
     */
    public void addFiveForArcher(View v) {
        scoreArcher += 5;
        displayForArcher(scoreArcher);
    }

    /**
     * Increase the score for Archer by 3 points.
     */
    public void addThreeForArcher(View v) {
        scoreArcher += 3;
        displayForArcher(scoreArcher);
    }

    /**
     * Increase the score for Archer by 1 point.
     */
    public void addOneForArcher(View v) {
        scoreArcher += 1;
        displayForArcher(scoreArcher);
    }


    /**
     * Increase the score for Bowman by 10 points.
     */
    public void addTenForBowman(View v) {
        scoreBowman += 10;
        displayForBowman(scoreBowman);
    }

    /**
     * Increase the score for Bowman by 9 points.
     */
    public void addNineForBowman(View v) {
        scoreBowman += 9;
        displayForBowman(scoreBowman);
    }

    /**
     * IIncrease the score for Bowman by 7 points.
     */
    public void addSevenForBowman(View v) {
        scoreBowman += 7;
        displayForBowman(scoreBowman);
    }

    /**
     * Increase the score for Bowman by 5 points.
     */
    public void addFiveForBowman(View v) {
        scoreBowman += 5;
        displayForBowman(scoreBowman);
    }

    /**
     * Increase the score for Bowman by 3 points.
     */
    public void addThreeForBowman(View v) {
        scoreBowman += 3;
        displayForBowman(scoreBowman);
    }

    /**
     * IIncrease the score for Bowman by 1 point.
     */
    public void addOneForBowman(View v) {
        scoreBowman += 1;
        displayForBowman(scoreBowman);
    }

    /**
     * Resets the score for both Archer and Bowman.
     */

    public void resetScore(View v) {
        scoreArcher = 0;
        scoreBowman = 0;
        displayForArcher(scoreArcher);
        displayForBowman(scoreBowman);
    }

    /**
     * Displays the given score for Archer.
     */
    public void displayForArcher(int score) {
        TextView scoreView = (TextView) findViewById(R.id.archer_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Bowman.
     */
    public void displayForBowman(int score) {
        TextView scoreView = (TextView) findViewById(R.id.bowman_score);
        scoreView.setText(String.valueOf(score));
    }
}

