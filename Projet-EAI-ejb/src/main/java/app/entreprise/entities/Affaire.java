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
public class Affaire implements Serializable{
    private int idAffaire;
    private String nomClient;
    private String prenomClient;
    private String adressePostale;
    private String mail;
    private String telephone;
    private String adresseLivraison;
    private String reference;
    private String cotes;
    private int montant;
    private RdvCommercial rdvCommercial;
    private RdvPoseur rdvPoseur;

    public int getIdAffaire() {
        return idAffaire;
    }

    public void setIdAffaire(int idAffaire) {
        this.idAffaire = idAffaire;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    public String getAdressePostale() {
        return adressePostale;
    }

    public void setAdressePostale(String adressePostale) {
        this.adressePostale = adressePostale;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresseLivraison() {
        return adresseLivraison;
    }

    public void setAdresseLivraison(String adresseLivraison) {
        this.adresseLivraison = adresseLivraison;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getCotes() {
        return cotes;
    }

    public void setCotes(String cotes) {
        this.cotes = cotes;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public RdvCommercial getRdvCommercial() {
        return rdvCommercial;
    }

    public void setRdvCommercial(RdvCommercial rdvCommercial) {
        this.rdvCommercial = rdvCommercial;
    }

    public RdvPoseur getRdvPoseur() {
        return rdvPoseur;
    }

    public void setRdvPoseur(RdvPoseur rdvPoseur) {
        this.rdvPoseur = rdvPoseur;
    }

    @Override
    public String toString() {
        return "Affaire{" + "idAffaire=" + idAffaire + ", nomClient=" + nomClient + ", prenomClient=" + prenomClient + ", adressePostale=" + adressePostale + ", mail=" + mail + ", telephone=" + telephone + ", adresseLivraison=" + adresseLivraison + ", reference=" + reference + ", cotes=" + cotes + ", montant=" + montant + ", rdvCommercial=" + rdvCommercial + ", rdvPoseur=" + rdvPoseur + '}';
    }
    
        
    
}
