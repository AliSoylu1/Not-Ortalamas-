package Giriş;
import java.util.Scanner;

public class NotOrtalaması {
    public static void main(String[] args) {

        int math, phys, chem, turk, hist, musc;
        int note1 = 100, note2 = 0;
        int sayac = 0;

        System.out.println("Lütfen ders notlarınızı girmeye başlayın.");
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik dersi notunuzu giriniz :");
        math = input.nextInt();
        boolean kosulMath = math > note1 || math <= note2;
        if (kosulMath == true ) {
            math = 0;
            sayac = sayac + 1;
        } else {
            math = math;
        }

        System.out.print("Fizik dersi notunuzu giriniz :");
        phys = input.nextInt();
        boolean kosulPhys = phys > note1 || phys <= note2;
        if (kosulPhys == true ) {
            phys = 0;
            sayac = sayac + 1;
        } else {
            phys = phys;
        }


        System.out.print("Kimya dersi notunuzu giriniz :");
        chem = input.nextInt();
        boolean kosulChem = chem > note1 || chem <= note2;
        if (kosulChem == true ) {
            chem = 0;
            sayac = sayac + 1;
        } else {
            chem = chem;
        }


        System.out.print("Türkçe dersi notunuzu giriniz :");
        turk = input.nextInt();
        boolean kosulTurk = turk > note1 || turk <= note2;
        if (kosulTurk == true ) {
            turk = 0;
            sayac = sayac + 1;
        } else {
            turk = turk;
        }


        System.out.print("Tarih dersi notunuzu giriniz :");
        hist = input.nextInt();
        boolean kosulHist = hist > note1 || hist <= note2;
        if (kosulHist == true ) {
            hist = 0;
            sayac = sayac + 1;
        } else {
            hist = hist;
        }


        System.out.print("Müzik dersi notunuzu giriniz :");
        musc = input.nextInt();
        boolean kosulMusc = musc > note1 || musc <= note2;
        if (kosulMusc == true ) {
            musc = 0;
            sayac = sayac + 1;
        } else {
            musc = musc;
        }


        double result = (math+phys+chem+turk+hist+musc) / (6-sayac);
        System.out.println("Not ortalamanız :" + result);

        int x = 55, y = 100;
        boolean kosul1 = result >= x;
        boolean kosul2 = result <= y;
        boolean kosul3 = result <= y;
        boolean sonuc = kosul1 && kosul2;

        String str = sonuc ? "Sınıfı Geçtiniz, Tebrikler..." : "Sınıfı Geçemediniz...";
        System.out.println(str);

    }
}
