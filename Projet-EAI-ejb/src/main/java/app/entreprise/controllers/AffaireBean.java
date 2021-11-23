/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.entreprise.controllers;

import app.entreprise.entities.Affaire;
import app.entreprise.entities.AffaireBD;
import app.entreprise.exceptions.AffaireExistanteException;
import app.entreprise.exceptions.AffaireInconnueException;
import java.util.Collection;
import javax.ejb.Singleton;
import javax.ejb.Stateless;

/**
 *
 * @author Josselin
 */
@Singleton
public class AffaireBean implements AffaireBeanLocal {

    /**
     * Attribut représentant la BD des affaires
     *
     * @see AffaireBD
     */
    private AffaireBD bdAffaire;
    
     /**
     * Constructeur initialisant une BD vide des affaires
     */
    public AffaireBean() {
        this.bdAffaire = new AffaireBD();

    }

    @Override
    public Affaire ajouterAffaire(Affaire a) throws AffaireExistanteException{
        if (this.bdAffaire.lesaffaires.containsKey(a.getIdAffaire())) {
            throw new AffaireExistanteException();
        } else {
            this.bdAffaire.lesaffaires.put(a.getIdAffaire(), a);
            return a;
        }
    }

    public Affaire getAffaire(int idAffaire) throws AffaireInconnueException{
        if (!this.bdAffaire.lesaffaires.containsKey(idAffaire)) {
            throw new AffaireInconnueException();
        } else {
            return this.bdAffaire.lesaffaires.get(idAffaire);
        }    }

    @Override
    public Collection<Integer> getListe() {
        return (Collection) this.bdAffaire.lesaffaires.keySet();
    }

    @Override
    public void supprimerAffaire(int idAffaire) throws AffaireInconnueException {
        if (!this.bdAffaire.lesaffaires.containsKey(idAffaire)) {
            throw new AffaireInconnueException();
        } else {
            this.bdAffaire.lesaffaires.remove(idAffaire);
        }
    }

    @Override
    public void updateAffaire(int idAffaire, Affaire a) throws AffaireInconnueException {
        if (!this.bdAffaire.lesaffaires.containsKey(idAffaire)) {
            throw new AffaireInconnueException();
        } else {
            //TODO
            //this.bdbanque.lestitres.get(mnemo).setCours(cours);
        }
    }
}
