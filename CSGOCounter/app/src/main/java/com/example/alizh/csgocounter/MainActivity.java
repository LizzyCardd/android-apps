package com.example.alizh.csgocounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int scoreTerrorist=0;
    int scoreCTerrorist=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void addOneForTerrorist(View v) {
        Button clickedButton = (Button) v;
        switch (clickedButton.getId()) {
            case R.id.button2:
                scoreTerrorist = scoreTerrorist++;
                break;
            case R.id.button3:
                scoreTerrorist = scoreTerrorist++;
                break;
            case R.id.buttonB2:
                scoreCTerrorist = scoreCTerrorist++;
                break;
            case R.id.buttonB3:
                scoreCTerrorist = scoreCTerrorist++;
                break;
        }
    }
    public void addThreeForTerrorist(View v) {
        Button clickedButton = (Button) v;
        switch (clickedButton.getId()) {
            case R.id.button:
                scoreTerrorist = scoreTerrorist + 3;
                break;
            case R.id.buttonB:
                scoreCTerrorist = scoreCTerrorist + 3;
                break;
        }
    }

    public void addOneForCTerrorist (View v){
        scoreCTerrorist = scoreCTerrorist++;
        displayForCTerrorist(scoreCTerrorist);
    }
    public void addThreeForCTerrorist (View v){
        scoreCTerrorist = scoreCTerrorist + 3;
        displayForCTerrorist(scoreCTerrorist);
    }

    public void resetScore (View v){
        scoreTerrorist = 0;
        scoreCTerrorist = 0;
        displayForTerrorist(0);
        displayForCTerrorist(0);
    }

    /**
     * Displays the given score for Terrorist.
     */
    private void displayForTerrorist(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_t_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Counter-Terrorist.
     */
    private void displayForCTerrorist(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_ct_score);
        scoreView.setText(String.valueOf(score));
    }
}

