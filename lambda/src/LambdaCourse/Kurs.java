package LambdaCourse;
/*
POJO: Planin old Java Pbject
1- parametresi olmayan consructor a ihtiyac var
2- butun parametreere sahip constructor a ihtiyac var
3- getter () ve setter() e ihtiyac var
 */
public class Kurs {
    private  String mevsim;
    private String kursIsmi;
    private int notOrtalamasi;
    private int ogrenciSayisi;

    public Kurs(String mevsim, String kursIsmi, int notOrtalamasi, int ogrenciSayisi) {
        this.mevsim = mevsim;
        this.kursIsmi = kursIsmi;
        this.notOrtalamasi = notOrtalamasi;
        this.ogrenciSayisi = ogrenciSayisi;
    }

    public Kurs() {
    }

    public String getMevsim() {
        return mevsim;
    }

    public void setMevsim(String mevsim) {
        this.mevsim = mevsim;
    }

    public String getKursIsmi() {
        return kursIsmi;
    }

    public void setKursIsmi(String kursIsmi) {
        this.kursIsmi = kursIsmi;
    }

    public int getNotOrtalamasi() {
        return notOrtalamasi;
    }

    public void setNotOrtalamasi(int notOrtalamasi) {
        this.notOrtalamasi = notOrtalamasi;
    }

    public int getOgrenciSayisi() {
        return ogrenciSayisi;
    }

    public void setOgrenciSayisi(int ogrenciSayisi) {
        this.ogrenciSayisi = ogrenciSayisi;
    }

    @Override
    public String toString() {
        return "Kurs{" +
                "mevsim='" + mevsim + '\'' +
                ", kursIsmi='" + kursIsmi + '\'' +
                ", notOrtalamasi=" + notOrtalamasi +
                ", ogrenciSayisi=" + ogrenciSayisi +
                '}';
    }
}
