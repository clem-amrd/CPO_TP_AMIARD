/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_amiard;

/**
 *
 * @author Clemence
 */
public class BouteilleBiere {

    public String nom;
    public double degreAlcool;
    public String brasserie;
    public boolean ouverte;

    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool
                + " degres) \nBrasserie : " + brasserie);

    }

    public boolean Decapsuler() {
        if (ouverte == false) {
            ouverte = true;
            return ouverte;
        } else {
            System.out.println("erreur: la biere est deja ouverte");
            return ouverte;
        }

    }

    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }

    @Override
    public String toString() {
        String chaine;
        chaine = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
        if (ouverte == true) {
            chaine += "oui";
        } else {
            chaine += "non";
        }
        return chaine;
    }
}
