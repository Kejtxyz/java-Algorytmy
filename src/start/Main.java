package start;

import start.user.USER;  // automatycznie dodany import z katalogu user start

import java.util.Date;

public class Main {


    public static void main(String[] args) {
     //   Main o1 = new Main();         //   konstruktor bez argumentowy, bez parametrowy - Main();

        USER user1 = new USER();
    //  user1 login;                    // metody dostepowe,
        user1.setLogin("michal");      // set pole login
        System.out.println(user1.getLogin());    // wyswietl na ekranie, pobierz wartosc login pola
        System.out.println(user1);


        USER user2 = new USER("Kasia", "hasloxyz", 100.25, true, new Date(1990,12,01));
        System.out.println(user2);



    }


}
