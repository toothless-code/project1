package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
      int num;
      Scanner input = new Scanner(System.in);
      System.out.print("sayi giriniz: ");
      num = input.nextInt();
      int fact=1;
      for (int i=1; i<=num; i++) {
        fact=fact*i;
      }
      System.out.println(fact);
    }
}
