/*
 * TP0_Netbeans
 * Clémence AMIARD
 * 13/09/23
 */
package tp0_.helloworld;

import java.util.Scanner;

/**
 *
 * @author Clemence
 */
public class TP0_HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String prenom;
        Scanner sc ;
        sc = new Scanner (System.in) ;
        System.out.println("Quel est votre prenom ?");
        prenom = sc.nextLine(); 
        System.out.println( "Bonjour " + prenom) ; 
    }
    
}
