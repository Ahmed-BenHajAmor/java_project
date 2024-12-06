package projet.Etudiant;

import java.util.Vector;

import projet.Exceptions.FormationDejaInscriteException;
import projet.Formation.Formation;
import projet.Utilisateur.Utilisateur;

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
