package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     *
     *     TEAM A
     *
     * */
    int scoreA = 0;

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Adds 6 points
     */
    public void SixPointsA(View v) {
        scoreA += 6;
        displayForTeamA(scoreA);

    }

    /**
     * Adds 3 points
     */
    public void ThreePointsA(View v) {
        scoreA += 3;
        displayForTeamA(scoreA);
    }

    /**
     * Adds 2 points
     */
    public void TwoPointsA(View v) {
        scoreA += 2;
        displayForTeamA(scoreA);
    }

    /**
     * Adds 1 point
     */
    public void OnePointA(View v) {
        scoreA += 1;
        displayForTeamA(scoreA);
    }




    /**
     *
     *     TEAM A
     *
     * */
    int scoreB = 0;

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Adds 6 points
     */
    public void SixPointsB(View v) {
        scoreB += 6;
        displayForTeamB(scoreB);

    }

    /**
     * Adds 3 points
     */
    public void ThreePointsB(View v) {
        scoreB += 3;
        displayForTeamB(scoreB);
    }

    /**
     * Adds 2 points
     */
    public void TwoPointsB(View v) {
        scoreB += 2;
        displayForTeamB(scoreB);
    }

    /**
     * Adds 1 point
     */
    public void OnePointB(View v) {
        scoreB += 1;
        displayForTeamB(scoreB);
    }







    public void resetButton(View v) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }


}
