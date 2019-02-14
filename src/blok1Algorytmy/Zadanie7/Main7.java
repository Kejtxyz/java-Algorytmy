package blok1Algorytmy.Zadanie7;

import blok1Algorytmy.Zadanie7.controller7.Algorytm7;

public class Main7 {
    public static void main(String[] args) {
        Algorytm7 tc = new Algorytm7();
            int tab[] = {1, 2, 3, 4, 5, 4, 6, 5, 7, 6, 5, 3};


            for(int element :tc.tableFilter(5,tab)){
                System.out.println(element + " ");
            }

        System.out.println();

        for(int element :tab) {
                System.out.println(element + " ");
            }
        }
    }
