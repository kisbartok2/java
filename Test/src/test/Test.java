package test;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("\tElső szám: ");
        int elsoInt = scan.nextInt();        
        
        System.out.print("\tMasodik szám: ");
        int masodikInt = scan.nextInt();
        
        Osszeadas e1 = new Osszeadas(elsoInt, masodikInt);
        
        System.out.println(e1);
        
        System.out.println("");
        
        e1.megGoldontam(1, 10);
        System.out.println(e1);
        
        System.out.println("");
        e1.megGoldontam(3, 10);
        System.out.println(e1);
    }
}