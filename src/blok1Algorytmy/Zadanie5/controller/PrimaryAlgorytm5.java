package blok1Algorytmy.Zadanie5.controller;

public class PrimaryAlgorytm5 {
    public boolean isPrimary(int num) {
        int counter = 0;

        for (int i = num - 1; i > 1; i--) {
            if (num % i == 0) {
                counter++;
            }
        }
        return counter > 0 || num == 1  ? false : true;  // ?  - if
    }

    ///// wypisac wszystkie liczby pierwsze, n liczb pierwszych tyle ile zazda uzytkownik

    public void primaryGenerator(int n){
        int counter = 0;
        int i = 2;
        while(counter <= n){
            if(isPrimary(i)) {
                counter++;
                System.out.println(i + " ");
                System.out.println(i + " ");
            }
            i++;
        }
    }
}

