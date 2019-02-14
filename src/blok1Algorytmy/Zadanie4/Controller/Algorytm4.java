package blok1Algorytmy.Zadanie4.Controller;

import static java.lang.Math.pow;

public class Algorytm4 {
    //
        public String DecimaltoBinaryAlgo10na2(int decimal) {
            String binary = "";

        while(decimal > 0) {
            binary = binary + String.valueOf(decimal % 2);
                decimal = decimal / 2;
            }
            StringBuffer sb = new StringBuffer(binary);
        // stringbuffer tworzy kopie ciagu znakow i poznwala nam z utworzony obiekt jego kopie zmieniac, np, odwrocic kolejnosc.

            return sb.reverse().toString();

            }
            public int binaryToDecimal(String binary){
            int result = 0;
            for(int i = binary.length()-1; i>=0; i--) {
                if ((char) binary.charAt(i) == '1') {
                    result += pow(2, (binary.length()-1)-i);  // pow -  potega  2 do ^potegi  wykladnika,
                }
            }
            // result = "100"
                // Iteracja I i=2, result =0
                // Iteracja II i=1, result=0
                // Iteracja II i=0, result = 0 + 2^(2-0) = 4

            return result;
            }
}



