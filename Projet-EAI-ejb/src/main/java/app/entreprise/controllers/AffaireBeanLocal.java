/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.entreprise.controllers;

import app.entreprise.entities.Affaire;
import app.entreprise.exceptions.AffaireExistanteException;
import app.entreprise.exceptions.AffaireInconnueException;
import java.util.Collection;
import javax.ejb.Local;

/**
 *
 * @author Josselin
 */
@Local
public interface AffaireBeanLocal {
    
    public Affaire ajouterAffaire(Affaire a) throws AffaireExistanteException;
    
    public Affaire getAffaire(int idAffaire) throws AffaireInconnueException;
    
    public Collection<Integer> getListe();
    
    public void supprimerAffaire(int idAffaire) throws AffaireInconnueException;
    
    public void updateAffaire(int idAffaire, Affaire a) throws AffaireInconnueException;
    
}
