package blok1Algorytmy.Zadanie1;

import blok1Algorytmy.Zadanie1.controller.Algorytm1;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in); // pozwala wejscie na console, i wyswietlenie
     //   System.out.println("Podaj podstaee potegi");
//        int x = scanner.nextInt();
      //  System.out.println("Podaj wykladnik potegi");
//        int y = scanner.nextInt();
        //p1
        Algorytm1 a = new Algorytm1();
         //    System.out.println(x+"^"+y+" Wynik Xdo potegiY : "+ a.power(x,y));
        // p2
        System.out.println(a.factorial(5));
        System.out.println(a.factorial(-5));
        // p3 ciag geometryczny
        System.out.println(a.geoSequence(2,3,3));
        // p4
      //  System.out.println(a.arSequenceCiagAryt(1,2,3));
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Wprowadz kolejno a,r,c");
            try { // catch - wyjatek--obsluga bledu
                System.out.println(
                        a.arSequenceCiagAryt(
                                sc.nextInt(),
                                sc.nextInt(),
                                sc.nextInt()
                        )
                );
                break;
            } catch (InputMismatchException e) {  // wyjatek obsluga bledu
                System.out.println("Blad danych");
            }
            finally {
                sc.nextLine();
            }
        }
    }
}



