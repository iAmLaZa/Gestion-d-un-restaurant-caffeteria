package com.company;

import java.util.ArrayList;

public class Employé {

    private  String idEmployé,Email,MDPcompte,nomEmployé,prénomEmployé;
    private  TypeEmpolyé typeEmpolyé;
    private  EtatEmployé etatEmployé;

    ArrayList<Livraison> livraisons=new ArrayList<>();

    public Employé(String idEmployé,String nomEmployé,String prénomEmployé, String email, String MDPcompte, TypeEmpolyé typeEmpolyé, EtatEmployé etatEmployé) {
        this.idEmployé = idEmployé;
        this.nomEmployé=nomEmployé;
        this.prénomEmployé=prénomEmployé;
        Email = email;
        this.MDPcompte = MDPcompte;
        this.typeEmpolyé = typeEmpolyé;
        this.etatEmployé = EtatEmployé.EnService;
    }
    public String getNomEmployé() {
        return nomEmployé;
    }

    public void setNomEmployé(String nomEmployé) {
        this.nomEmployé = nomEmployé;
    }

    public String getPrénomEmployé() {
        return prénomEmployé;
    }

    public void setPrénomEmployé(String prénomEmployé) {
        this.prénomEmployé = prénomEmployé;
    }

    public String getIdEmployé() {
        return idEmployé;
    }

    public void setIdEmployé(String idEmployé) {
        this.idEmployé = idEmployé;
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

    public TypeEmpolyé getTypeEmpolyé() {
        return typeEmpolyé;
    }

    public void setTypeEmpolyé(TypeEmpolyé typeEmpolyé) {
        this.typeEmpolyé = typeEmpolyé;
    }

    public EtatEmployé getEtatEmployé() {
        return etatEmployé;
    }

    public void setEtatEmployé(EtatEmployé etatEmployé) {
        this.etatEmployé = etatEmployé;
    }
    public void ValidéAffectationCom(){

    }

    public ArrayList<Livraison> getLivraisons() {
        return livraisons;
    }

    public void setLivraisons(ArrayList<Livraison> livraisons) {
        this.livraisons = livraisons;
    }

    @Override
    public String toString() {
        return "Employé{" +
                "idEmployé='" + idEmployé + '\'' +
                ", Email='" + Email + '\'' +
                ", MDPcompte='" + MDPcompte + '\'' +
                ", nomEmployé='" + nomEmployé + '\'' +
                ", prénomEmployé='" + prénomEmployé + '\'' +
                ", typeEmpolyé=" + typeEmpolyé +
                ", etatEmployé=" + etatEmployé +
                '}';
    }
    //Methodes Livreur
    public void ajouterLivraison(Livraison livraison){
        if(!this.livraisons.contains(livraison)){
            this.livraisons.add(livraison);
            livraison.setEmployé(this);
        }
    }
    public void anulerLivraison(Livraison livraison){
        if(this.livraisons.remove(livraison)){
            livraison.setEmployé(null);
        }
    }
}
