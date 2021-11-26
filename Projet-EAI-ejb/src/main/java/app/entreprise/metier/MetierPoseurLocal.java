/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.entreprise.metier;

import app.entreprise.entities.Affaire;
import javax.ejb.Local;


/**
 *
 * @author OscarAullo
 */
@Local
public interface MetierPoseurLocal {
    void creerRdvPoseur(Affaire affaire, String dateRdv, String heureRdv, String idEquipe);
}
