package comq.example.tobie.footballscoreapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreNigeria = 0;
    int scoreRedNig = 0;
    int scoreYellowNig = 0;
    int scoreCornerNig = 0;
    int scoreFoulNig = 0;
    int scoreIceland = 0;
    int scoreRedIce = 0;
    int scoreYellowIce = 0;
    int scoreCornerIce = 0;
    int scoreFoulIce = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void oneGoalForNigeria(View v) {
        scoreNigeria = scoreNigeria + 1;
        displayForNigeria(scoreNigeria);
    }

    public void oneRedForNigeria(View v) {
        scoreRedNig = scoreRedNig + 1;
        displayRedForNigeria(scoreRedNig);
    }
    public void oneYellowForNigeria(View v) {
        scoreYellowNig = scoreYellowNig + 1;
        displayYellowForNigeria(scoreYellowNig);
    }

    public void oneCornerForNigeria(View v) {
        scoreCornerNig = scoreCornerNig + 1;
        displayCornerForNigeria(scoreCornerNig);
    }
    public void oneFoulForNigeria(View v) {
        scoreFoulNig = scoreFoulNig + 1;
        displayFoulForNigeria(scoreFoulNig);
    }


    public void oneGoalForIceland(View v) {
        scoreIceland = scoreIceland + 1;
        displayForIceland(scoreIceland);
    }
    public void oneRedForIceland(View v) {
        scoreRedIce = scoreRedIce + 1;
        displayRedForIceland(scoreRedIce);
    }
    public void oneYellowForIceland(View v) {
        scoreYellowIce = scoreYellowIce + 1;
        displayYellowForIceland(scoreYellowIce);
    }
    public void oneCornerForIceland(View v) {
        scoreCornerIce = scoreCornerIce + 1;
        displayCornerForIceland(scoreCornerIce);
    }
    public void oneFoulForIceland(View v) {
        scoreFoulIce = scoreFoulIce + 1;
        displayFoulForIceland(scoreFoulIce);
    }
    public void resetScore(View v) {
        scoreNigeria = 0;
        scoreRedNig = 0;
        scoreYellowNig = 0;
        scoreCornerNig = 0;
        scoreFoulNig = 0;
        scoreIceland = 0;
        scoreRedIce = 0;
        scoreYellowIce = 0;
        scoreCornerIce = 0;
        scoreFoulIce = 0;
        displayForNigeria(scoreNigeria);
        displayRedForNigeria(scoreRedNig);
        displayYellowForNigeria(scoreYellowNig);
        displayCornerForNigeria(scoreCornerNig);
        displayFoulForNigeria(scoreFoulNig);
        displayForIceland(scoreIceland);
        displayRedForIceland(scoreRedIce);
        displayYellowForIceland(scoreYellowIce);
        displayCornerForIceland(scoreCornerIce);
        displayFoulForIceland(scoreFoulIce);
    }

    public void displayForNigeria(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedForNigeria(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_nig);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowForNigeria(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_nig);
        scoreView.setText(String.valueOf(score));
    }
    public void displayCornerForNigeria(int score) {
        TextView scoreView = (TextView) findViewById(R.id.corner_nig);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFoulForNigeria(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul_nig);
        scoreView.setText(String.valueOf(score));
    }


    public void displayForIceland(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team2);
        scoreView.setText(String.valueOf(score));
    }
    public void displayRedForIceland(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_ice);
        scoreView.setText(String.valueOf(score));
    }
    public void displayYellowForIceland(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_ice);
        scoreView.setText(String.valueOf(score));
    }
    public void displayCornerForIceland(int score) {
        TextView scoreView = (TextView) findViewById(R.id.corner_ice);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFoulForIceland(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul_ice);
        scoreView.setText(String.valueOf(score));
    }
}