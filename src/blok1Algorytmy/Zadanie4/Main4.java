package blok1Algorytmy.Zadanie4;

import blok1Algorytmy.Zadanie4.Controller.Algorytm4;

public class Main4 {
    public static void main(String[] args) {
        Algorytm4 c = new Algorytm4();
        System.out.println(c.DecimaltoBinaryAlgo10na2(4));
        System.out.println(c.DecimaltoBinaryAlgo10na2(15));


        System.out.println(c.binaryToDecimal("100"));
        System.out.println(c.binaryToDecimal("001"));
    }
}
