package com.bateedjalla.test;

import javax.sound.sampled.DataLine;
import java.util.Scanner;

public class Test {

 public static void main(String[] args) {
     String naam;
     String groet = "Hallo";
     String zin = "wat is uw naam?";

     System.out.println(zin);

  Scanner scanner = new Scanner(System.in);
  naam = scanner.nextLine();

  System.out.println(groet + " " + naam);

    String vraag = "wilt u iets eten?";

    System.out.println(vraag);


     String wel = "ja";
    String niet = "nee";



     String menu = "het menu is:";
    String product1 = "Fanta: 0,90 euro";
    String product2 = "Cola: 0,90 euro";
    String product3 = "sprite: 0,90 euro";
    String product4 = "chips naturel: 1,00 euro";
    String product5 = "chips paprika: 1,00 euro";
    String product6 = "gevulde koek: 1,00 euro";
    String product7 = "roze koek: 1,50 euro";
    String product8 = "musliereep: 0,80 euro";

     System.out.println(menu);
    System.out.println(product1);
     System.out.println(product2);
     System.out.println(product3);
     System.out.println(product4);
     System.out.println(product5);
     System.out.println(product6);
     System.out.println(product7);
     System.out.println(product8);










 }
}
