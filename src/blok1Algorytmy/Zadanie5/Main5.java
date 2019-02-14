package blok1Algorytmy.Zadanie5;

import blok1Algorytmy.Zadanie5.controller.PrimaryAlgorytm5;

public class Main5 {
    public static void main(String[] args) {
        PrimaryAlgorytm5 pc = new PrimaryAlgorytm5();
        System.out.println(pc.isPrimary(1));
        System.out.println(pc.isPrimary(2));
        System.out.println(pc.isPrimary(7));
        System.out.println(pc.isPrimary(4));

        //// 10 pierwszych liczb wypisze,tyle ile chce uzytkownik  ///
        pc.primaryGenerator(10);
    }
}
