package com.example.javalib;

import java.util.ArrayList;
import java.util.Random;

public class JokesClass {

    public String getJoke (){
        ArrayList<String> jokesArray = new ArrayList<>();
        for (int i = 0 ; i < 9 ; i++){
          jokesArray.add("very funny joke # " + i  );
        }
        Random rn = new Random();
        int randomJoke = rn.nextInt(9);
        return jokesArray.get(randomJoke);
    }
}
