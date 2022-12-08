package LambdaCourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FonksiyonelProgramlama03 {

    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mert");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        System.out.println(liste);  // [Ali, Ali, Mert, Christopher, Jackson, Mariano, Alberto]

        buyukHarfeCevir(liste);
        System.out.println();
        uzunlugaGoreSirala(liste);
        System.out.println();
        sonKaraktereGoreSirala(liste);
        System.out.println();
        onceUzunlukSonraIlkKaraktereGoreSirala(liste);
        System.out.println("--------------");
     //   uzunlukBstenUzunsaSil(liste);
        System.out.println();
     //   aIleBaslayanNileBitenler(liste);
        System.out.println("--------------");
        uzunlugunKaresiFarkliOlanElemanlariTerstenYazma(liste);
        System.out.println("--------------");
        elemanUzunlugu12KucukMu(liste);
        System.out.println("--------------");
        ilkHarfiniCheckEt(liste);
        System.out.println("--------------");
        sonKaraktereBak(liste);

    }
        
        //1.Butun elemanları buyuk harfe ceviren bir method yaz

        public static void buyukHarfeCevir(List<String> liste ) {
            liste.
                    stream().
                    map(String::toUpperCase).
                    forEach(Utils::elemanlariAyniSatirdaBirBoslukBirakarakYazdir);

        }
        //2.Stringleri uzunluga göre sırala
    public static  void uzunlugaGoreSirala(List<String> liste){
        liste.
                stream().
                sorted(Comparator.comparing(String::length)).
                forEach(System.out::println);

    }
    //3. Elemanları en son karaktere göre sıralayan bir method olusturun

    public static void sonKaraktereGoreSirala(List<String> liste) {
        liste.
                stream().
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                forEach(System.out::println);
    }
    //4.elemanları önce uzunluklarına göre sonra ilk karakterlerine göre sıralayan bır method yazınız
    public static  void onceUzunlukSonraIlkKaraktereGoreSirala(List<String> liste) {
        liste.
                stream().
                sorted(Comparator.comparing(String::length).thenComparing(t -> t.charAt(0))).
                forEach(System.out::println);

    }
/*     //5.elemanlardan uzunlugu 5 karakterden fazla olanı silen bir method olusturun
    public static void uzunlukBstenUzunsaSil(List<String> liste){
        liste.removeIf(t->t.length()>5);
        System.out.println(liste);
*/
    //6.Elemanlardan "A","a" ile başlayan ve "N","n" harfi ile biten elemaları silen bir method olusturun
/*
    public static void aIleBaslayanNileBitenler(List<String> liste) {
        liste.removeIf(t -> t.charAt(0) == 'A' || t.charAt(0) == 'a' || t.charAt(t.length() - 1) == 'N' || t.charAt(t.length() - 1) == 'n');
        System.out.println(liste);

    }
*/
    //7. Her bir elemanın uzunlugunun karesini alan ve farklı olanları tersten yazdıran bir method yazdır

    public static void uzunlugunKaresiFarkliOlanElemanlariTerstenYazma(List<String> liste) {
        liste.
                stream().
                map(String::length).map(Utils::sayininKaresiniAl).distinct().
                sorted(Comparator.reverseOrder()).
                forEach(Utils::elemanlariAyniSatirdaBirBoslukBirakarakYazdir);
    }
    //8.list in butun elemanlarının uzunlugunun 12'den kucuk olup olmadıgının bulan bır method yazınız

    public static void elemanUzunlugu12KucukMu(List<String> liste) {
        boolean sonuc = liste.stream().allMatch(t -> t.length() < 12);
        System.out.println(sonuc);

    }

    //9.elemanlarını herhangi birinin ilk harfının "X" ile baslayıp başlamadıgını bulan bır method yazınız
    public static void ilkHarfiniCheckEt(List<String> liste) {
        boolean sonuc = liste.stream().noneMatch(t -> t.startsWith("X"));
        System.out.println(sonuc);
    }

    //10.elemanların en az birinin "o" harfi oldugunu bulan bir method olusturun

    public static void sonKaraktereBak(List<String> liste) {
      boolean sonuc =  liste.stream().anyMatch(t->t.endsWith("O") || t.endsWith("o"));
        System.out.println(sonuc);



    }

}
