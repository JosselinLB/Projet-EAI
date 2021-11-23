/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.entreprise.entities;

import java.io.Serializable;

/**
 *
 * @author OscarAullo
 */
public class RdvPoseur implements Serializable{
    public int idRdv;
    public String dateRdv;
    public String heureRdv;
    public String idEquipe;

    public int getIdRdv() {
        return idRdv;
    }

    public void setIdRdv(int idRdv) {
        this.idRdv = idRdv;
    }

    public String getDateRdv() {
        return dateRdv;
    }

    public void setDateRdv(String dateRdv) {
        this.dateRdv = dateRdv;
    }

    public String getHeureRdv() {
        return heureRdv;
    }

    public void setHeureRdv(String heureRdv) {
        this.heureRdv = heureRdv;
    }

    public String getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(String idEquipe) {
        this.idEquipe = idEquipe;
    }

    @Override
    public String toString() {
        return "RdvPoseur{" + "idRdv=" + idRdv + ", dateRdv=" + dateRdv + ", heureRdv=" + heureRdv + ", idEquipe=" + idEquipe + '}';
    }
           
    
}
