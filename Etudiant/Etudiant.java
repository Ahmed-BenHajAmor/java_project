package Etudiant;

import Utilisateur.Utilisateur;
import java.util.Vector;

public class Etudiant extends Utilisateur {
    Vector<Object> listFormation;

    public Etudiant(String nom, String email, String motDePasse){
        super(nom, email, motDePasse);

    }
   
    public void sinscrireFormation(Object formation){
        listFormation.add(formation);
    }
}
