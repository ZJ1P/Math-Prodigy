package com.example.zechariah.mathprodigy;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.os.CountDownTimer;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class Main extends Activity
{
    Random randomGenerator = new Random();

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    int a = 0, b = 0, c = 0, count = 0, nu = 0,;
    String su = null;
    EditText in = (EditText)findViewById(R.id.editText);
    TextView problem = (TextView)findViewById(R.id.problem);
    Button submit = (Button) findViewById(R.id.submitAnswer);
    OnClickListener submitBtn = new OnClickListener() {
        @Override
        public void onClick(View v) {
            su = in.getText().toString();   //Recieves user input
            nu = Integer.parseInt(su);      //Converts user input to an integer value
            if (nu == c)
                count++;
        }
    };
    public void addititon()
    {
        long t= System.currentTimeMillis();
        long end = t+60000;
        while(System.currentTimeMillis() < end)
        {
            a = randomGenerator.nextInt(13);
            b = randomGenerator.nextInt(13);
            c = a + b;
            problem.setText(a + " + " + b); //Outputs created problem
            submit.setOnClickListener(submitBtn);
        }
    }

}
