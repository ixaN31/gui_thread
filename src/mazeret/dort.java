package mazeret;

import java.util.ArrayList;
import java.util.List;

public class dort {
    public static String[] aLar(String[][] matris) {
        int sayac = 0;
        for (String[] i : matris) {
            for (String j : i) {
                if (j.charAt(0) == 'A') {
                    sayac++;
                }
            }
        }
        int indis=0;
        String[] array = new String[sayac];
        for (String[] i : matris) {
            for (String j : i) {
                if (j.charAt(0) == 'A') {
                    array[indis]=j;
                    indis++;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[][] test = {{"Ali","selam","eşşek"},{"Aslı","Sülman","Araba"}};
        String[]a=aLar(test) ;

        for (String b:a){
            System.out.println(b);
        }
    }
}
