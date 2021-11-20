package com.company;

public class user {
    private String Email,Mdp,nom,prenom;
    private TypeEmpolyé TypeUser;
    private int index;

    public user(String email, String mdp, TypeEmpolyé typeUser,int index) {
        Email = email;
        Mdp = mdp;
        TypeUser = typeUser;
        this.index=index;
    }


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public user() {
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMdp() {
        return Mdp;
    }

    public void setMdp(String mdp) {
        Mdp = mdp;
    }

    public TypeEmpolyé getTypeUser() {
        return TypeUser;
    }

    public void setTypeUser(TypeEmpolyé typeUser) {
        TypeUser = typeUser;
    }
}
