
import java.util.Scanner;
public class kdv {
    public static void main(String[] args) {
        double tutar,kdvOran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını Giriniz : ");
        tutar = input.nextDouble();

        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz tutar :" + tutar);
        System.out.println("KDV oranı :" + kdvOran);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV'li Tutarı :" + kdvliTutar);
    }
}
