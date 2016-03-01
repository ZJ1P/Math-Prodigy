package com.example.zechariah.mathprodigy;

import java.util.Random;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.app.Activity;


/**
 * Created by Zechariah on 2/10/2016.
 */
public class Games extends Activity {
    Random randomGenerator = new Random();
    public void addititon()
    {
        int a = 0, b = 0, c = 0, u = null, count = 0, nu = 0,;
        String su = null;
        long t= System.currentTimeMillis();
        long end = t+60000;
        EditText in = (EditText)findViewById(R.id.editText);
        TextView problem = (TextView)findViewById(R.id.problem);
        while(System.currentTimeMillis() < end)
        {
            a = randomGenerator.nextInt(13);
            b = randomGenerator.nextInt(13);
            c = a + b;
            problem.setText(a + " + " + b);
            //when submit clicked
            su = in.getText().toString();
            nu = Integer.parseInt(su);
            if(u == c)
                count++;
        }
    }
}
