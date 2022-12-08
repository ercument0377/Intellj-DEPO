package LambdaCourse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FonksiyonelProgramlama04 {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(12);
        liste.add(9);
        liste.add(13);
        liste.add(4);
        liste.add(9);
        liste.add(2);
        liste.add(4);
        liste.add(15);
        System.out.println(liste);  // [12, 9, 13, 4, 9, 2, 4, 15]
        toplam(liste);

        yedidenYuzeKadarTopla();

        belliBirSayidanBaskaBirSayiyaKadar(4,9);

        faktoriyelBulma(6);

        ikiSayiArasindakiCiftSayilarinToplami(5,8);

        rakamlarToplami(125,129);

    }

    //1.listedeki butun elemanların toplamını gösteren bir method yazınız
    public static void toplam(List<Integer> liste){
      Integer toplam =   liste.stream().reduce(0,Math::addExact);
        System.out.println(toplam); //68

    }

    //2. 7'den 100'e kadar olan sayıların toplamını bulan bir method yazınız
    public static void yedidenYuzeKadarTopla(){
        //1.yol
   //   Integer toplam =  IntStream.range(7,101).reduce(0,Math::addExact);
       //2.yol
     Integer toplam =   IntStream.rangeClosed(7,100).reduce(0, Math::addExact);

        System.out.println(toplam); //5029
    }
    public static void belliBirSayidanBaskaBirSayiyaKadar(int a, int b){
     Integer carpma =   IntStream.rangeClosed(a,b).reduce(1,Math::multiplyExact);
        System.out.println(carpma); //60480

    }
    // verilen bir sayını faktoriyelini hesaplayan bir method olusturun
    // 5! === 5*4*3*2*1 == 120    demek
    public static void faktoriyelBulma(int a) {
        Integer faktoriyel = IntStream.rangeClosed(1, a).reduce(1, Math::multiplyExact);
        System.out.println(faktoriyel);

    }

    // verilen iki sayi arasındaki cift sayıların toplamını hesaplayan bir method olusturun
    public static void ikiSayiArasindakiCiftSayilarinToplami(int a, int b){
     Integer  toplam =  IntStream.rangeClosed(a,b).filter(Utils::ciftSayiYazdir).sum();
        System.out.println(toplam); //14

    }
    // verilen iki sayı arasındaki herbir cift sayının rakamları toplamını hesaplayan bir method olusturun
    public static void rakamlarToplami(int a, int b){
       Integer toplam = IntStream.rangeClosed(a,b).map(Utils::rakamlarToplami).sum();
        System.out.println(toplam);// 14

    }




}
