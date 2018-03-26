package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA();
        displayForTeamB();
    }

    /**
     * This method is called when the team A 3 point button is clicked.
     */
    public void pointsTeamA3(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA();
    }

    /**
     * This method is called when the team A 2 point button is clicked.
     */
    public void pointsTeamA2(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA();
    }

    /**
     * This method is called when the team A free throw button is clicked.
     */
    public void pointsTeamA1(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA();
    }

    /**
     * This method is called when the team B 3 point button is clicked.
     */
    public void pointsTeamB3(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB();
    }

    /**
     * This method is called when the team B 2 point button is clicked.
     */
    public void pointsTeamB2(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB();
    }

    /**
     * This method is called when the team B free throw button is clicked.
     */
    public void pointsTeamB1(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB();
    }

    /**
     * This method is called when the RFSET button is clicked.
     */
    public void resetScores(View view) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamA();
        displayForTeamB();
    }

    /**
     * Displays the score for Team A.
     */
    public void displayForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    /**
     * Displays the score for Team B.
     */
    public void displayForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }
}
