package Etudiant;

import Utilisateur.Utilisateur;
import java.util.Vector;

import Formation.Formation;

public class Etudiant extends Utilisateur {
    Vector<Formation> listFormation;

    public Etudiant(String nom, String email, String motDePasse){
        super(nom, email, motDePasse);

    }
   
    public void sinscrireFormation(Formation formation){
        listFormation.add(formation);
    }
}
