package Pratikler;

import java.util.Scanner;

public class VücutKitleİndeksi {
    public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);

      //Kullanicidan kilo ve boy degerlerini al
      System.out.printf("kilonuzu kg cinsinden girin: ");
      double kilo = scanner.nextDouble();

      System.out.printf("boyunuzu m cinsinden girin: ");
      double boy = scanner.nextDouble();

      //Vücut Kitle İndeksi hesaplama
      double vki = kilo / (boy*boy);

      //Sonucu ekrana yazdirma
      System.out.println("vücut kitle indeksiniz: " + vki);

    }
}
