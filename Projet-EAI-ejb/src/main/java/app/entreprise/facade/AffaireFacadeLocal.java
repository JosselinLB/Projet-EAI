/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.entreprise.facade;

import app.entreprise.entities.Affaire;

/**
 *
 * @author OscarAullo
 */
public interface AffaireFacadeLocal {
    void create(Affaire affaire);
    void update(Affaire affaire);
    Affaire find(Object id);
    void delete(Affaire affaire);
    
}
