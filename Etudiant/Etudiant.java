package Etudiant;

import Utilisateur.Utilisateur;
import java.util.Vector;

import Exceptions.FormationDejaInscriteException;
import Formation.Formation;

public class Etudiant extends Utilisateur {
    Vector<Formation> listFormation;

    public Etudiant(String nom, String email, String motDePasse){
        super(nom, email, motDePasse);

    }
   
    public void sinscrireFormation(Formation formation){
        try {
            if (listFormation.contains(formation)){
                throw new FormationDejaInscriteException();
            }
            listFormation.add(formation);
        } catch (FormationDejaInscriteException e){
            System.out.println(e);
        }
    }
}
