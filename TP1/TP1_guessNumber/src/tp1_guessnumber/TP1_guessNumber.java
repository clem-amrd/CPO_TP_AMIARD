/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessnumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Clemence
 */
public class TP1_guessNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        Scanner sc = new Scanner(System.in);
        int n = generateurAleat.nextInt(50);
        int user;
        int tentative;
        tentative = 0;
        user = 51;
        int mode;
        System.out.println("""
                           Choisis le mode :
                           1) facile (tentatives illimités, grandes indications)
                           2) moyen (que 10 tentatives, indications correctes)
                           3) difficile (que 5 tentatives, indications parfois douteuses)
                           """);
        mode = sc.nextInt();

        switch (mode) {
            case 1 -> {
                System.out.println("Devine le nombre");
                while (user != n) {
                    user = sc.nextInt();
                    if (user < n) {
                        if (n - user > 20) {
                            System.out.println("beaucoup trop petit");
                        } else if (n - user < 5) {
                            System.out.println("legerement trop petit");
                        } else {
                            System.out.println("trop petit");
                        }
                    } else if (user > n) {
                        if (user - n > 20) {
                            System.out.println("beaucoup trop grand");
                        } else if (user - n < 5) {
                            System.out.println("legerement trop grand");
                        } else {
                            System.out.println("trop grand");
                        }
                    }
                    tentative++;
                }
                System.out.println("bravo");
                break;
            }

            case 2 -> {
                System.out.println("Devine le nombre");
                while (user != n) {
                    user = sc.nextInt();
                    if (user < n) {
                        System.out.println("trop petit");
                    } else if (user > n) {
                        System.out.println("trop grand");
                    }
                    tentative++;
                    if (tentative == 10) {
                        System.out.println("tu n'as plus de tentative :/");
                    }
                }
                if (user == n) {
                    System.out.println("bravo");
                }
            }

            case 3 -> {
                System.out.println("Devine le nombre");
                while (user != n) {
                    int proba = generateurAleat.nextInt(100);
                    user = sc.nextInt();
                    if (user < n) {
                        if (proba < 30) {
                            System.out.println("trop grand");
                        } else {
                            System.out.println("trop petit");
                        }

                    } else if (user > n) {
                        if (proba < 30) {
                            System.out.println("trop petit");
                        } else {
                            System.out.println("trop grand");
                        }
                    }
                    tentative++;
                    if (tentative == 10) {
                        System.out.println("tu n'as plus de tentative :/");
                        break;
                    }
                }
                if (user == n) {
                    System.out.println("bravo");
                }
            }
        }
        System.out.println("tentatives: " + tentative);
    }

}
