package mazeret;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bes {
    public static void main(String[] args) throws FileNotFoundException {
        List listEB = new ArrayList();
        List listEK = new ArrayList();
        File f = new File("src\\Ali.txt");
        Scanner reader = new Scanner(f);
        while (reader.hasNext()) {
            String line = reader.nextLine();
            String[] sayilar = line.split(",");
            int[] say = new int[sayilar.length];

            int eb = Integer.parseInt(sayilar[0]);
            int ek = eb;
            for (int i = 0 ; i<sayilar.length;i++){
                int sayi = Integer.parseInt(sayilar[i]);
                if (sayi>eb)eb=sayi;
                if (sayi<ek)ek=sayi;
            }
            listEB.add(eb);
            listEK.add(ek);

        }
        System.out.println("En büyükler : "+listEB);
        System.out.println("En küçükler : "+listEK);
    }

}


