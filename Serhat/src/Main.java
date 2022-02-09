import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik,kimya,turkce,tarih,muzik;

        Scanner inp = new Scanner (System.in);

        System.out.println("Matematik Notunuz :");
        mat=inp.nextInt();

        System.out.println("Fizik Notunuz:");
        fizik=inp.nextInt();

        System.out.println("Kimya Notunuz:");
        kimya=inp.nextInt();

        System.out.println("Türkçe Notunuz:");
        turkce=inp.nextInt();

        System.out.println("Tarih Notunuz:");
        tarih=inp.nextInt();

        System.out.println("Müzik Notunuz:");
        muzik=inp.nextInt();

        int toplam=(mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc=toplam/6.0;
        boolean kosul1= sonuc>60;
        boolean kosul2= sonuc<60;
        boolean sonuc = kosul1||kosul2;
        String str =sonuc ? "Sınıfı Geçti" : "Sınıfta Kaldı";



        System.out.println(str);



    }
}
