package LambdaCourse;

import java.util.ArrayList;
import java.util.List;

public class FonksiyonelProgramlama02 {
    /*
    Method Referans: Class ismi :: Method ismi (method parantezleri kullanılmaz ())

    ornk:
          String :: Length
          ArrayList :: size


     */


    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(14);
        liste.add(11);
        liste.add(16);
        liste.add(8);
        liste.add(95);
        liste.add(9);
        liste.add(16);
        liste.add(2);

        System.out.println(liste);
        elemanlariAyniSatirdaYazdir(liste);
        System.out.println(liste);
        ciftSayilariAyniSatirdaYazdir(liste);
        System.out.println(liste);
        tekSayilarinKupunuAl(liste);
        System.out.println(liste);
        kupleriToplami(liste);
        System.out.println(liste);
        minSayiDegeri(liste);


    }

    //  // 1- list elemanlarını arada bir boşluk bırakarak yazdıran mothod olusturun(functional)

    public static void elemanlariAyniSatirdaYazdir(List<Integer>liste) {

      //  liste.stream().forEach(Utils ::elemanlariAyniSatirdaBirBoslukBirakarakYazdir);
        liste.stream().forEach(System.out::println);

    }

    public static void ciftSayilariAyniSatirdaYazdir(List<Integer>liste) {
        liste.stream().filter(Utils::ciftSayiYazdir).forEach(Utils::elemanlariAyniSatirdaBirBoslukBirakarakYazdir);
    }
    //tek sayilarin küpünü alan ve aynı satırda yazdıran bir method yazdırın
    public static void tekSayilarinKupunuAl(List<Integer>liste){
        liste.stream().filter(Utils::tekSayiYazdir).map(Utils::sayininKupunuAl).forEach(Utils::elemanlariAyniSatirdaBirBoslukBirakarakYazdir);

    }
    //cift sayilarin kupleri toplamı yazdıran method yazdır
    public static void kupleriToplami(List<Integer>liste){
     //  Integer toplam = liste.stream().filter(Utils::ciftSayiYazdir).map(Utils::sayininKupunuAl).reduce(0,Math::addExact);
     //   System.out.println(toplam);
        Integer toplam = liste.stream().filter(Utils::ciftSayiYazdir).reduce(1,Math::multiplyExact);
        System.out.println(toplam);


    }

    //list in elemanlarından en kucuk degeri olan bir method olusturun

    public static void minSayiDegeri(List<Integer>liste){
    //    liste.stream().reduce(Integer.MAX_VALUE, Math::min);
        System.out.println(liste.stream().reduce(Integer.MAX_VALUE, Math::min));


    }


}
