package com.company;

public class Boisson extends Consomable {
    private typeBoisson typeB;

    public Boisson(String idCon, String designationCon, natureC natureCon, ConditionementC conditionementCon, int prixCon, Consomable.FicheTechConsomable ficheTechConsomable, typeBoisson typeB) {
        super(idCon, designationCon, natureCon, conditionementCon, prixCon, ficheTechConsomable);
        this.typeB = typeB;
    }
    public Boisson() {
    }
    public typeBoisson getTypeB() {
        return typeB;
    }

    public void setTypeB(typeBoisson typeB) {
        this.typeB = typeB;
    }
    public void ToString(){
        System.out.println(this.getDesignationCon()+" Prix : "+this.getPrixCon());
    }
}
