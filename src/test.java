import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //Değişkenleri oluştur
        int mat, fzk, kimya, edeb, mzik, tarih;

        //Scanner tanımla
        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.println("Fizik Notunuz : ");
        fzk = inp.nextInt();

        System.out.println("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.println("Edebiyat Notunuz : ");
        edeb = inp.nextInt();

        System.out.println("tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.println("Müzik Notunuz : ");
        mzik = inp.nextInt();

        int toplam = (mat + mzik + tarih + edeb + kimya + fzk);
        double sonuc = toplam / 6.0;

        System.out.println(sonuc);

        boolean gecmeNotu = sonuc >= 60;
        String sonuc2 = gecmeNotu ? "Geçti" : "Kaldı";

        System.out.println(sonuc2);
    }
}