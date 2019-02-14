package blok1Algorytmy.Zadanie3.controller;

import blok1Algorytmy.Zadanie2.controller.Algorytm2;

public class Algorytm3 {
    public int Euklides (int e,int f){
        int greather = e;
        int lower = f;
        if(e < f){
            greather = f;
            lower = e;
        } // i - kolejne skladowe//
        for(int i = greather; i>=1;i--) {
            if (greather % i == 0 && lower % i == 0) {
                return i;
            }
        }
        return 1;
        }
    }

