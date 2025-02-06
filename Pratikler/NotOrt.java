package Pratikler;

import java.util.Scanner;

public class NotOrt {
    public static void main(String[] args) {
      int mat, fiz, kim;
      double topDeger_Ort;

      String p="gecti", f="kaldi";

      Scanner topDeger = new Scanner(System.in);
      System.out.println("mat notunu gir:");
      mat=topDeger.nextInt();
      System.out.println("fizik notunu gir:");
      fiz=topDeger.nextInt();
      System.out.println("kimya notunu gir:");
      kim=topDeger.nextInt();

      topDeger_Ort= (mat+fiz+kim)/3;
      System.out.println(topDeger_Ort > 50 ? p : f);
    }
}
