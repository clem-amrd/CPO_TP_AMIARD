/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_amiard_binome;

/**
 *
 * @author Clemence
 */
public class Personne {
    public String Nom;
    public String Prenom;
    int nbVoitures ;
    Voiture [] liste_voitures ;
    
    public Personne(String nom, String prenom){
        Nom = nom;
        Prenom = prenom;
        liste_voitures = new Voiture [3] ;
    }
    
    public String toString() {
        String personne;
        personne = Prenom + " " + Nom;
        return personne;
    }
    
    public boolean ajouter_voiture( Voiture ref) {
        if(ref.Proprietaire == null && nbVoitures != 3){
              nbVoitures ++;
              liste_voitures[nbVoitures] = ref;
              ref.Proprietaire = this ; 
              return true;
        }else{
              return false;
        }
    }
}
