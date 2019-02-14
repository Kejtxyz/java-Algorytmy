package blok1Algorytmy.Zadanie7.controller7;

public class Algorytm7 {
    public static int [] tableFilter(int minSupp, int tab[]){
        for(int i=0 ; i < tab.length ; i++) {
            if (tab[i] <= minSupp) {
                tab[i] = 0;
            }
        }
            return tab;
        }
    }

