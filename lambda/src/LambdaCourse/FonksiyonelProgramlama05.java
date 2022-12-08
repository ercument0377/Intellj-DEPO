package LambdaCourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FonksiyonelProgramlama05 {
    public static void main(String[] args) {
        Kurs turkceGunduz = new Kurs("Yaz","Turkce_Gunduz",97,128);
        Kurs turkceGece= new Kurs("Kis","Turkce_Gece",98,154);
        Kurs ingilizceGunduz = new Kurs("ilkbahar","Ingilizce_Gunduz",95,132);
        Kurs ingilizceGece = new Kurs("Kis","Ingilizce_Gece",93,144);

        List<Kurs> kursList = new ArrayList<>();
        kursList.add(turkceGunduz);
        kursList.add(turkceGece);
        kursList.add(ingilizceGunduz);
        kursList.add(ingilizceGece);


        System.out.println(kursList);

      System.out.println(ortalama91Buyuk(kursList, 92));

       System.out.println( herhangiBirKelimeVarMi(kursList));

        enYuksekOrtalama(kursList);

    }
    //1. ortalama puanın 91'den buyuk olup olmadıgını check eden bir method yazınız

    public static boolean ortalama91Buyuk(List<Kurs> kursList, int ortalama){
     return  kursList.stream().allMatch(t->t.getNotOrtalamasi()>ortalama);

    }

    //2. en az bir kurs isminde "turkce" isminin olup olmadıgını check eden bir kod yazınız

    public static boolean herhangiBirKelimeVarMi(List<Kurs> kursList){
        return kursList.stream().anyMatch(t->t.getKursIsmi().contains("Turkce"));

    }
    // en yuksek ortalama puanı olan bir method yazınız

    public static void enYuksekOrtalama(List<Kurs> kursList){
     Kurs sonuc =   kursList.stream().sorted(Comparator.comparing(Kurs::getNotOrtalamasi).reversed()).findFirst().get();
         System.out.println(sonuc);
    }


}
