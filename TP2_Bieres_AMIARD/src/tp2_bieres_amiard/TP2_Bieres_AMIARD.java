/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_amiard;

/**
 *
 * @author Clemence
 */
public class TP2_Bieres_AMIARD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson");
        uneBiere.lireEtiquette();

        BouteilleBiere deuxBiere = new BouteilleBiere("Cuvée des jsp", 16.4, "clochette");
        deuxBiere.lireEtiquette();

        BouteilleBiere troisBiere = new BouteilleBiere("Cuvée des oui", 1.0, "NON");
        troisBiere.lireEtiquette();

        System.out.println(uneBiere);
        System.out.println(deuxBiere);
        System.out.println(troisBiere);
    }

}
