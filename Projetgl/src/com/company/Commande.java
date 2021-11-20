package com.company;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Commande {

    Scanner cs=new Scanner(System.in);
    static int cpt=1;
    private String idCommande;
    private TypeCom typeCom;
    private EtatCom etatCom;
    private Date DateCom;
    private Avis avis;

    private ArrayList<DetailCom> detailComs=new ArrayList<DetailCom>();

    protected static class Avis{
        private int notation;
        private String commentaire;

        public Avis(int notation, String commentaire) {
            this.notation = notation;
            this.commentaire = commentaire;
        }

        public int getNotation() {
            return notation;
        }

        public void setNotation(int notation) {
            this.notation = notation;
        }

        public String getCommentaire() {
            return commentaire;
        }

        public void setCommentaire(String commentaire) {
            this.commentaire = commentaire;
        }
    }
    protected static class DetailCom {
        private String idcommande;
        private int Nbportion,montant;
        private Consomable consomable;

        public DetailCom(String idcommande, int nbportion, int montant, Consomable consomable) {
            this.idcommande = idcommande;
            Nbportion = nbportion;
            this.montant = montant;
            this.consomable = consomable;
        }

        public DetailCom() {
        }


        public Consomable getConsomable() {
            return consomable;
        }

        public void setConsomable(Consomable consomable) {
            this.consomable = consomable;
        }

        public String getIdcommande() {
            return idcommande;
        }

        public void setIdcommande(String idcommande) {
            this.idcommande = idcommande;
        }

        public int getNbportion() {
            return Nbportion;
        }

        public void setNbportion(int nbportion) {
            Nbportion = nbportion;
        }

        public int getMontant() {
            return montant;
        }

        public void setMontant(int montant) {
            this.montant = montant;
        }


        public void AjouterCon(Consomable consomable,int i){
            this.consomable=consomable;
            this.setNbportion(i);
            this.montant=this.Nbportion*consomable.getPrixCon();
        }
        public  void suprimerCon(){
            this.consomable=null;
            this.setNbportion(0);
            this.setMontant(0);
        }
    }



    private ClientRégulier clientRégulier;

    SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy   hh:mm");
    public Commande( TypeCom typeCom,ClientRégulier clientRégulier,EtatCom etatCom) {
        this.idCommande = String.valueOf(cpt);cpt++;
        this.typeCom = typeCom;
        DateCom=new Date();
        this.clientRégulier=clientRégulier;
        this.etatCom=etatCom;
    }

    public Commande() {
        this.idCommande = String.valueOf(cpt);cpt++;
    }

    public Avis getAvis() {
        return avis;
    }

    public void setAvis(Avis avis) {
        this.avis = avis;
    }

    public ArrayList<DetailCom> getDetailComs() {
        return detailComs;
    }

    public void setDetailComs(ArrayList<DetailCom> detailComs) {
        this.detailComs = detailComs;
    }

    public ClientRégulier getClientRégulier() {
        return clientRégulier;
    }

    public void setClientRégulier(ClientRégulier clientRégulier) {
        this.clientRégulier = clientRégulier;
    }

    public String getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(String idCommande) {
        this.idCommande = idCommande;
    }

    public TypeCom getTypeCom() {
        return typeCom;
    }

    public void setTypeCom(TypeCom typeCom) {
        this.typeCom = typeCom;
    }

    public Date getDateCom() {
        return DateCom;
    }

    public EtatCom getEtatCom() {
        return etatCom;
    }

    public void setEtatCom(EtatCom etatCom) {
        this.etatCom = etatCom;
    }

    public void setDateCom(Date dateCom) {
        DateCom = dateCom;
    }

    public static int getCpt() {
        return cpt;
    }

    public static void setCpt(int cpt) {
        Commande.cpt = cpt;
    }

    //ClientRégulier:
    public void ajouterClient(ClientRégulier clientRégulier){
        this.clientRégulier=clientRégulier;
        if(!clientRégulier.getCommandes().contains(this)){
            clientRégulier.getCommandes().add(this);
        }
    }
    public void suprimerClient(){
        if(this.clientRégulier.getCommandes().remove(this)){
            this.clientRégulier=null;
        }
    }
    public void validercommande(){
        this.setEtatCom(EtatCom.Validé);
    }
    public int prix(){
        int p=0;
        for(int i=0;i<this.getDetailComs().size();i++){
            p=p+this.getDetailComs().get(i).montant;
        }
        return p;
    }
    public String Tostring(){
        return "la commande" +idCommande+
                "a ete commandé :"+sdf.format(this.DateCom)+"\n"+
                "par le client"+
                clientRégulier.toString();

    }


}
