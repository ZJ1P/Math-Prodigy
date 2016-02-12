package com.example.zechariah.mathprodigy;

import java.util.Random;

/**
 * Created by Zechariah on 2/10/2016.
 */
public class Games {
    Random randomGenerator = new Random();
    public void addititon()
    {
        int a = 0, b = 0, c = 0, u = 0, count = 0;
        long t= System.currentTimeMillis();
        long end = t+60000;
        while(System.currentTimeMillis() < end)
        {
            a = randomGenerator.nextInt(13);
            b = randomGenerator.nextInt(13);
            c = a + b;
            //print (a + " + " + b)
            //receive input u = input
            if(u == c)
                count++;
        }
    }
}
