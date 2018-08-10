/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

import java.util.Scanner;

/**
 *
 * @author indri
 */
public class Day1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Calculation calc = new Calculation();
        Scanner sc = new Scanner(System.in); 
        
        double sk1, sk2;
        System.out.println("Ievadi skaitli 1: ");
        sk1 = sc.nextDouble();
        System.out.println("Ievadi skaitli 2: ");
        sk2 = sc.nextDouble();
        
        double rezultats = calc.Saskaitisana(sk1, sk2);
        System.out.println("Rezultāts = " + rezultats);
        
        double rezultats2 = calc.Starpiba(sk1, sk2);
        System.out.println("Rezultāts = " + rezultats2);
        
        
        
        //Calculation calc = new Calculation();
        //calc.Izvade("vertiba1"); //iekavās tiek piešķirta string 'a' vertiba
        //calc.Izvade("vertiba2");
        
        /*
        //scanner - klase, sc - nosaukums
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Ievadi savu vārdu: ");
        String vards = sc.nextLine();
        
        //int a = 3;
        //vards = String.valueOf(a); // pārveido no int uz string
        //a = Integer.valueOf(vards); // no string uz int
        
        int DzGads, gads;
        System.out.println("Ievadi dzimšanas gadu: ");
        DzGads = sc.nextInt();
        
        System.out.println("Kāds šobrīd gads: ");
        gads = sc.nextInt();
        
        String vecums = sc.nextLine();
        vecums = String.valueOf(gads - DzGads);
        
        System.out.println("Čau, " + vards + "!");
        System.out.println("Tev ir " + vecums + " gadi!");
        */
    }
    
}
