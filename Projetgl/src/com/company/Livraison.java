package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Livraison {
    private String idLaivraison;
    private Date DateDepart;
    private Commande commande;
    private Employé employé;

    SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy   hh:mm");

    public Livraison(String idLaivraison, Date dateDepart, Commande commande, Employé employé) {
        this.idLaivraison = idLaivraison;
        DateDepart = dateDepart;
        this.commande = commande;
        this.employé = employé;
    }

    public Livraison() {
    }
    public Livraison(String idLaivraison) {
        this.idLaivraison = idLaivraison;
        DateDepart = new Date();
    }

    public String getIdLaivraison() {
        return idLaivraison;
    }

    public void setIdLaivraison(String idLaivraison) {
        this.idLaivraison = idLaivraison;
    }

    public Date getDateDepart() {
        return DateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        DateDepart = dateDepart;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Employé getEmployé() {
        return employé;
    }
// Employé:
    public void setEmployé(Employé employé) {
        this.employé = employé;
    }
    public void ajouterLivreur(Employé employé){
        this.setEmployé(employé);
        if (!employé.getLivraisons().contains(this))employé.getLivraisons().add(this);
    }
    public void anulerLivraison(){
        this.employé.getLivraisons().remove(this);
        this.employé=null;
    }
    // Commande:
    public void ajouterCommande(Commande commande){
        this.setCommande(commande);
    }
    public void suprimmerCommande(){
        this.setCommande(null);
        this.setEmployé(null);
    }
}