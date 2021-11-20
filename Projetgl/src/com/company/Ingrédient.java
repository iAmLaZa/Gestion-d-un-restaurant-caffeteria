package com.company;

public class Ingrédient {
    private String idIngredient,produit;
    private int qte,prixUnit;
    unité unitéMeusure;

    public Ingrédient(String idIngredient, String produit, int qte, int prixUnit, unité unitéMeusure) {
        this.idIngredient = idIngredient;
        this.produit = produit;
        this.qte = qte;
        this.prixUnit = prixUnit;
        this.unitéMeusure = unitéMeusure;
    }

    public Ingrédient() {
    }

    public String getIdIngredient() {
        return idIngredient;
    }

    public void setIdIngredient(String idIngredient) {
        this.idIngredient = idIngredient;
    }

    public String getProduit() {
        return produit;
    }

    public void setProduit(String produit) {
        this.produit = produit;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public int getPrixUnit() {
        return prixUnit;
    }

    public void setPrixUnit(int prixUnit) {
        this.prixUnit = prixUnit;
    }

    public unité getUnitéMeusure() {
        return unitéMeusure;
    }

    public void setUnitéMeusure(unité unitéMeusure) {
        this.unitéMeusure = unitéMeusure;
    }
}
