package LambdaCourse;

public class Utils {
    public static void elemanlariAyniSatirdaBirBoslukBirakarakYazdir(Object w){
        System.out.println(w + " ");
    }
    public static boolean ciftSayiYazdir(int a){
        return a%2==0;
    }
    public static boolean tekSayiYazdir(int a){
        return a%2!=0;
    }
    public static Integer sayininKaresiniAl(int a){
        return a*a;
    }
    public static Integer sayininKupunuAl(int a){
        return a*a*a;
    }
    public static double sayininYarisiniAl(int a){
        return a/2.0;
    }
    public static Integer rakamlarToplami(int a){
        int toplam = 0;
        while(a!=0){
            toplam = toplam + a%10;
            a = a/10;
        }
        return toplam;

    }

}
