package com.company;

import java.util.ArrayList;

public class ClientRégulier extends ClientNonOpiné {
    private String idClient;
    static int cpt=4;
    private String Nom;
    private String Prénom;
    private String Adress;
    private String NumTel;
    private String Email;
    private String MDPcompte;
    private int nbCommande;

    ArrayList<Commande> commandes=new ArrayList<>();
    ArrayList<Consomable> panier=new ArrayList<>();


    public ClientRégulier(String nom, String prénom, String adress, String numTel, String email, String MDPcompte) {
        this.idClient=String.valueOf(cpt);cpt++;
        Nom = nom;
        Prénom = prénom;
        Adress = adress;
        NumTel = numTel;
        Email = email;
        this.MDPcompte = MDPcompte;
        this.nbCommande=0;
    }
    public ClientRégulier() {
        this.idClient=String.valueOf(cpt);cpt++;
    }
    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrénom() {
        return Prénom;
    }

    public void setPrénom(String prénom) {
        Prénom = prénom;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public String getNumTel() {
        return NumTel;
    }

    public void setNumTel(String numTel) {
        NumTel = numTel;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMDPcompte() {
        return MDPcompte;
    }

    public void setMDPcompte(String MDPcompte) {
        this.MDPcompte = MDPcompte;
    }
    //methode:
    public Commande PasserCommande(){
        Commande c=new Commande();
        return c;

    }
    public void GererPanier(){

    }
    public void AfficherProgrestLivraison(){

    }
    public void NoterService(String idCommande){

    }
    public  void ConfirmerRéception(){

    }

    public int getNbCommande() {
        return nbCommande;
    }

    public void setNbCommande(int nbCommande) {
        this.nbCommande = nbCommande;
    }

    public ArrayList<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(ArrayList<Commande> commandes) {
        this.commandes = commandes;
    }

    public ArrayList<Consomable> getPanier() {
        return panier;
    }

    public void setPanier(ArrayList<Consomable> panier) {
        this.panier = panier;
    }

    @Override
    public String toString() {
        return "ClientRégulier" +
                "idClient='" + idClient + '\'' +
                ", Nom='" + Nom + '\'' +
                ", Prénom='" + Prénom + '\'' +
                ", Adress='" + Adress + "\n" +
                ", NumTel='" + NumTel + '\'' +
                ", Email='" + Email + "\n" +
                ", MDPcompte='" + MDPcompte + '\'' ;
    }
    public void ajouterCommande(Commande commande){
        if(!this.getCommandes().contains(commande)){
            commandes.add(commande);
            commande.setClientRégulier(this);
            nbCommande++;
        }
    }
    public void AnullerCommande(Commande commande){
        this.commandes.remove(commande);
        commande.setClientRégulier(null);
        nbCommande--;
    }
}
