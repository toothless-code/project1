package Pratikler;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) { 
        double armut = 2.14;
        double elma = 3.67; 
        double domates = 1.11 ;
        double muz = 0.95 ;
        double patlican = 5.00;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("armuttan kac kg satin aldiniz: ");
        double kiloArmut = scanner.nextDouble();
  
        System.out.printf("elmadan kac kg satin aldiniz: ");
        double kiloElma = scanner.nextDouble();

        System.out.printf("domatesten kac kg satin aldiniz: ");
        double kiloDomates = scanner.nextDouble();

        System.out.printf("muzdan kac kg satin aldiniz: ");
        double kiloMuz = scanner.nextDouble();

        System.out.printf("patlicandan kac kg satin aldiniz: ");
        double kiloPatlican = scanner.nextDouble();

        double ToplamTutar = armut * kiloArmut + elma * kiloElma + domates * kiloDomates + muz * kiloMuz + patlican * kiloPatlican ;

        System.out.println("toplam tutar: " + ToplamTutar);
    }
}
