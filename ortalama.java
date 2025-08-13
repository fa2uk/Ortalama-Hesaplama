import java.util.Scanner;
public class ortalama {
    public static void main(String[] args) {
        int turkce,mat,fizik,kimya;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        System.out.println(mat);

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        System.out.println(turkce);

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.println(kimya);

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.println(fizik);

        int sonuc = turkce + kimya + fizik + mat;
        double sonuc2 = sonuc/4;
        System.out.println(sonuc2);
    }

}
