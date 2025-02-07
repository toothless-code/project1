package Pratikler;

import java.util.Scanner;

public class UcakBileti {

    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);

        System.out.print("mesafeyi km cinsinden giriniz: ");
        int mesafe = giris.nextInt();

        System.out.print("yasinizi giriniz: ");
        int yas = giris.nextInt();

        System.out.print("yolculuk tipini seciniz: \n 1)Tek Yön \n 2)Gidis-Donus \n");
        int yolculukTipi = giris.nextInt();

        if (mesafe<=0 || yas<=0 || (yolculukTipi !=1 && yolculukTipi !=2)) {
            System.out.println("hatali veri girdiniz!");
        }

        double normalTutar = mesafe * 0.1 ;

        double indirimOrani = 0 ;

        if (yas<12) {
            indirimOrani = 0.5;
        }
        else if (yas>=12 && yas<24) {
            indirimOrani = 0.1; 
        }
        else if (yas>65) {
            indirimOrani = 0.3;
        }

        double indirimliFiyat = normalTutar - (normalTutar * indirimOrani);

        if (yolculukTipi == 2) {
            indirimliFiyat = indirimliFiyat - (indirimliFiyat * 0.2);
            indirimliFiyat = indirimliFiyat * 2;
        }

        System.out.println("toplam bilet fiyati: " + indirimliFiyat);

    giris.close();

    }
}