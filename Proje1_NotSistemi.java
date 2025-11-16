/**
 * Ad Soyad: [Hayrunnisa Ekinci]
 * Öğrenci No: [240541043]
 * Proje: [Not Sistemi]
 * Tarih: [16/11/2025]
 */
import java.util.Scanner;

public class NotSistemi {
    //Ortalama Hesaplama
    public static double calculateAverage(double vize,double ffinal,double odev) {
        return (vize * 0.3) + (ffinal * 0.4) + (odev * 0.3);
    }
    //Geçme ya da Gecmeme kontrolu
    public static boolean isPassingGrade( double ortalama){
        return ortalama >=50;
    }
   //Notu harflendirme
    public static char getLetterGrade(double ortalama){
        if(ortalama>=90) return 'A';
        else if(ortalama>=80) return 'B';
        else if(ortalama>=70) return 'C';
        else if(ortalama>=60) return 'D';
        else if(ortalama>=50) return 'E';
        else return 'F';
    }
    //Onur listesi
    public static boolean isHonorList(double ortalama,double vize,double ffinal,double odev){
        return (ortalama>=85) && (vize>=70) && (ffinal>=70) && (odev>=70);

    }
    //Büte girip girmeme durumu
    public static boolean hasRetakeRight(double ortalama){
        return (40<=ortalama) && (ortalama<50);
    }

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        double vize ,ffinal,odev;

    //Kullanıcıdan verileri alma
        System.out.print("Vize notunuzu giriniz: ");
        vize=input.nextDouble();
        System.out.print("Final notunuzu giriniz: ");
        ffinal=input.nextDouble();
        System.out.print("Odev sonucunuzu giriniz: ");
        odev=input.nextDouble();



        double ortalama=calculateAverage(vize,ffinal,odev);
        char harf=getLetterGrade(ortalama);
        boolean durum=isPassingGrade(ortalama);
        boolean liste=isHonorList(ortalama,vize,ffinal,odev);
        boolean but=hasRetakeRight(ortalama);

        //CIKTILAR

       System.out.println(" ====OGRENCİ NOT RAPORU==== ");
       System.out.printf("Vize Notu    :  %.1f\n" , vize);
       System.out.printf("Final Notu   :  %.1f\n" , ffinal);
       System.out.printf("Odev Notu    :  %.1f\n" , odev);
       System.out.println("----------------------------");
       System.out.printf("Ortalama     :  %.1f\n",ortalama);
       System.out.println("Harf Notu    : " + harf);
       System.out.println("Durum        : " + (durum ? "GECTİ":"KALDI"));
       System.out.println("Onur Listesi : " + (liste ? "EVET":"HAYIR" ));
       System.out.println("Bütünleme    : " + (but ? "VAR":"YOK"));


    }







}
