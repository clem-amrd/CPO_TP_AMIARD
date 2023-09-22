/*
 * TP0_Netbeans
 * Clémence AMIARD
 * 13/09/23
 */
package tp1_manipnombresint;

import java.util.Scanner;

/**
 *
 * @author Clemence
 */
public class TP1_manipNombresInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var1;
        int var2;
        System.out.println("Entrer un entier :");
        var1=sc.nextInt();
        System.out.println("allez encore");
        var2=sc.nextInt();
        int somme;
        somme = var1 + var2;
        int produit;
        produit = var1 * var2;
        int diff;
        diff = var1 - var2;
        int quotient;
        quotient = var1 / var2;
        int reste;
        reste = var1 % var2;
        System.out.println("somme: " + somme); 
        System.out.println("produit: " + produit);
        System.out.println("difference: " + diff);
        System.out.println("quotient: " + quotient + " et reste:" + reste);
} 
    }
   
