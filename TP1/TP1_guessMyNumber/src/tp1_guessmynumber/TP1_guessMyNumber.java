/*
 * TP0_Netbeans
 * Clémence AMIARD
 * 13/09/23
 */
package tp1_guessmynumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Clemence
 */
public class TP1_guessMyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        Scanner sc = new Scanner(System.in);
        int n = generateurAleat.nextInt(100);
        int user;
        user = 0;
        while (user != n) {
            System.out.println("Devine le nombre");
            user = sc.nextInt();
            if (user < n) {
                System.out.println("trop petit");
                if (user > n) {
                    System.out.println("trop grand");
                }
            }
        }
        System.out.println("gagné");
    }
}
