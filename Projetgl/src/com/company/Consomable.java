package com.company;

import java.util.ArrayList;

public class Consomable {
    private String idCon,designationCon;
    private natureC natureCon;
    ConditionementC conditionementCon;
    private int prixCon;
    protected FicheTechConsomable ficheTechConsomable;






            protected static class FicheTechConsomable {
                private String idCon;



                private ArrayList<Ingrédient> ingrédients=new ArrayList<>();
                private MethodePréparation methodePréparation;

                public MethodePréparation getMethodePréparation() {
                    return methodePréparation;
                }

                public void setMethodePréparation(MethodePréparation methodePréparation) {
                    this.methodePréparation = methodePréparation;
                }

                public FicheTechConsomable(String idCon ,MethodePréparation methodePréparation ) {
                    this.idCon = idCon;
                    this.methodePréparation=methodePréparation;
                }

                public FicheTechConsomable() {
                }

                public String getIdCon() {
                    return idCon;
                }

                public void setIdCon(String idCon) {
                    this.idCon = idCon;
                }

                public ArrayList<Ingrédient> getIngrédients() {
                    return ingrédients;
                }

                public void setIngrédients(ArrayList<Ingrédient> ingrédients) {
                    this.ingrédients = ingrédients;
                }

                public void modifierMethode(MethodePréparation methodePréparation){
                    this.methodePréparation=methodePréparation;
                }
                public void ajouterIngredient(Ingrédient ingrédient){
                    if(!this.getIngrédients().contains(ingrédient)){
                        this.getIngrédients().add(ingrédient);
                    }
                }
                public void suprimerIngredient(Ingrédient ingrédient){
                    this.getIngrédients().remove(ingrédient);
                }

            }







    public Consomable(String idCon, String designationCon, natureC natureCon, ConditionementC conditionementCon, int prixCon, FicheTechConsomable ficheTechConsomable) {
        this.idCon = idCon;
        this.designationCon = designationCon;
        this.natureCon = natureCon;
        this.conditionementCon = conditionementCon;
        this.prixCon = prixCon;
        this.ficheTechConsomable = ficheTechConsomable;
    }

    public Consomable() {
    }

    public String getIdCon() {
        return idCon;
    }

    public void setIdCon(String idCon) {
        this.idCon = idCon;
    }

    public String getDesignationCon() {
        return designationCon;
    }

    public void setDesignationCon(String designationCon) {
        this.designationCon = designationCon;
    }

    public natureC getNatureCon() {
        return natureCon;
    }

    public void setNatureCon(natureC natureCon) {
        this.natureCon = natureCon;
    }

    public ConditionementC getConditionementCon() {
        return conditionementCon;
    }

    public void setConditionementCon(ConditionementC conditionementCon) {
        this.conditionementCon = conditionementCon;
    }

    public int getPrixCon() {
        return prixCon;
    }

    public FicheTechConsomable getFicheTechConsomable() {
        return ficheTechConsomable;
    }

    public void setFicheTechConsomable(FicheTechConsomable ficheTechConsomable) {
        this.ficheTechConsomable = ficheTechConsomable;
    }

    public void setPrixCon(int prixCon) {
        this.prixCon = prixCon;
    }
    public int calculerPrix(){
        return 500;
    }

    @Override
    public String toString() {
        return "Consomable{" +
                "idCon='" + idCon + '\'' +
                ", designationCon='" + designationCon + '\'' +
                ", natureCon=" + natureCon +
                ", conditionementCon=" + conditionementCon +
                ", prixCon=" + prixCon +
                '}';
    }
}
