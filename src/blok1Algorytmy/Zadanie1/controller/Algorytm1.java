package blok1Algorytmy.Zadanie1.controller;

public class Algorytm1 {

    // metoda zwraca wartosc w postaci wyniku potegowania
// potega
    public int power(int x, int y) {
        int result = 1;
        for (int i = 1; i <= y; i++) {
            result *= x;
        }
        return result;
    }

    // silnia - factorial
    public int factorial(int n) {
        if (n < 1) {
            return -1;   // przerwanie metody
        }
        int result = 1;
        for (int i = n; n > 1; n--) {
            result = result * n;
        }
        return result;
    }

    // p3 ciag geometryczny
    public int geoSequence(int a0, int q, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + a0 * power(q, i);
        }
        return sum;

    }

    // p4 ciag arytmetyczny i walidacja
    public int arSequenceCiagAryt(int a, int r, int c) {
        int sum1 = 0;
        for (int i = 1; i <= c; i++) {
            sum1 += a + (i - 1) * r;
        }
                return sum1;
            }
        }










