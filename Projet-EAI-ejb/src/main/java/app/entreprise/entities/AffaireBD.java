/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.entreprise.entities;

import java.util.HashMap;

/**
 *
 * @author Josselin
 */
public class AffaireBD {
    public HashMap<Integer, Affaire> lesaffaires;

    /**
     * constructeur initialisant une nouvelle base vide.
     */
    public AffaireBD() {
        this.lesaffaires = new HashMap<>();
    }
}
