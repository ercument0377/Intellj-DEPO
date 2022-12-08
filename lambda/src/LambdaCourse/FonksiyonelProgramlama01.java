package LambdaCourse;

import java.util.ArrayList;
import java.util.List;

public class FonksiyonelProgramlama01 {
    /*
    1- Lambda fonksiyonel bir programlamadır
    2- Fonsiyonel programlama, Java 8 den once yoktu. Sonraki versiyonlarda kullanılabilir.
        Onceki versiyonlarda structored programing kullanılıyordu,
        Java 8 den sonra hem structor (yapılandırılmış) hemde ile beraber kullanılıyor
    3- structored programing bize "bir seyin nasıl yapılması gerektiğini"
       fakat fonksiyonel programlamada bize ne yapmamız gerektiğiniz söyler
    4- Fonksiyonel programlama SADECE collections ve ve Arrays'le çalısır

     */
    //1- List elemanlarini bir bosluk birakrtak ayni satirda yazdiran bir method olusturun ( structured )

    public static void elemaniYazdir(List<Integer> liste){
        for (Integer w: liste){
            System.out.print(w + " ");
        }

    }

// //1- List elemanlarini bir bosluk birakrtak ayni satirda yazdiran bir method olusturun ( functional  )

    public static void elemaniYazdir01 (List<Integer> liste){
        liste.stream().forEach(t -> System.out.print(t + " "));

    }

    //2-1-  List elemanalarindan cift olanalri arada bir bosluk birakarak yazdiran bir method olusturun (structured)
    public static void ciftRakamalariYazdir (List<Integer> liste){
        for (Integer w: liste){
            if (w%2==0){
                System.out.print(w + " ");
            }
        }
    }
    //2-2-  List elemanalarindan cift olanalri arada bir bosluk birakarak yazdiran bir method olusturun (functional)
    public static void ciftRakamalariYazdir01 (List<Integer> liste){
        liste.stream().filter(t-> t%2==0).forEach(t -> System.out.print(t + " "));
    }

    //3. List elemanlarindan cift olanlarin karelerini alanbir method olusturun

    public static void ciftlerinKaresiniAl (List<Integer> liste){
        liste.stream().filter(t-> t%2==0).map(t-> t*t).forEach(t -> System.out.print(t + " "));

    }
    //4. List elemanlarindan birbirinden farkli olan tek sayilarin kupunu alan ve ayni satirda yazdiran bir method olusturun
    public static void farkliTekSayilarinKupu (List<Integer> liste){

//        liste.stream().filter(t->t%2!=0).distinct().map(t->t*t*t).forEach(t -> System.out.print(t + " "));
        liste.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t -> System.out.print(t + " "));
    }

    //5. List elemanlarindan birbirinden farkli olan tek sayilarin kupunu alan ve bunlarin toplamini yazdiran bir method olusturun
    public static void tekSayilarinKupleriToplami (List<Integer> liste){
        Integer toplam = liste.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).reduce(1, (t, u)->t*u);
        System.out.println(toplam);

    }
    //6. List elamanladindan en buyuk degeri bulan bir method yaziniz
    public static void enBuyukDeger(List<Integer> liste){
        System.out.println(liste.stream().reduce(Integer.MIN_VALUE, (t,u)-> t>u ? t : u ));

    }
    //7. list elemanlarindan 50 buyuk cift sayilari yazdirin
    public static void ellidenBuyukCiftSayi(List<Integer> liste){
        liste.stream().filter(t-> (t>50)).filter(t->t%2==0).forEach(t -> System.out.print(t + " "));

    }
    //8. 50'den buyuk en kucuk cift sayiyi yazdiran bir method olusturun
    public static void ellidenBuyukEnKucukCiftSayi(List<Integer> liste){
//        System.out.println(liste.stream().filter(t->(t>50 && t%2==0)).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t, u)-> u));

        Integer elaman = liste.stream().filter(t->(t>50 && t%2==0)).sorted().skip(2).findFirst().get();
        System.out.println(elaman);

    }


    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(7);
        liste.add(11);
        liste.add(120);
        liste.add(55);
        liste.add(84);
        liste.add(6);
        liste.add(54);
        liste.add(160);

        System.out.println(liste);// [14, 11, 16, 17]

        elemaniYazdir(liste);
        System.out.println();
        elemaniYazdir01(liste);
        System.out.println();
        ciftRakamalariYazdir(liste);

        ciftRakamalariYazdir01(liste);
        System.out.println();
        ciftlerinKaresiniAl(liste);

        System.out.println();
        farkliTekSayilarinKupu(liste);
        System.out.println();
        tekSayilarinKupleriToplami(liste);
        System.out.println();
        enBuyukDeger(liste);
        System.out.println();
        ellidenBuyukCiftSayi(liste);
        System.out.println();
        ellidenBuyukEnKucukCiftSayi(liste);

    }

}

