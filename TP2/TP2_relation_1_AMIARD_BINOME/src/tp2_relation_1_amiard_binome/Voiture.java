/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_amiard_binome;

/**
 *
 * @author Clemence
 */
public class Voiture {
    public String Modele;
    public String Marque;
    public int puissanceCV;
    public Personne Proprietaire ;
    
    public Voiture(String modele, String marque, int puissance){
        Modele = modele;
        Marque = marque;
        puissanceCV = puissance;
        Proprietaire = null;
    }
        @Override
    public String toString() {
        String voiture;
        voiture = Modele + " " + Marque + " " + puissanceCV;
        return voiture;
    }
}
