/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Clemence
 */
public class TP1_stats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        int[] tab = {0, 0, 0, 0, 0};
        int nb;
        System.out.println("choisis un nombre:");
        nb = sc.nextInt();
        for (int i = 0; i < nb; ++i) {
            int n = generateurAleat.nextInt(5);
            tab[n]++;
        }
        
        for (int i = 0; i < 5; ++i) {
            System.out.println(tab[i]);
            double pourcent;
            pourcent = (double) tab[i]*100/nb;
            System.out.println(pourcent + "%");
        }
    }

}
