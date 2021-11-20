package com.company;

public class Plat extends Consomable {
     private  SpCuliniére spCuliniére;
     private int Commandé;

    public Plat(String idCon, String designationCon, natureC natureCon, ConditionementC conditionementCon, int prixCon, FicheTechConsomable ficheTechConsomable, SpCuliniére spCuliniére) {
        super(idCon, designationCon, natureCon, conditionementCon, prixCon, ficheTechConsomable);
        this.spCuliniére = spCuliniére;
        Commandé=0;
    }

    public Plat() {

    }

    public SpCuliniére getSpCuliniére() {
        return spCuliniére;
    }

    public void setSpCuliniére(SpCuliniére spCuliniére) {
        this.spCuliniére = spCuliniére;
    }

    public int getCommandé() {
        return Commandé;
    }

    public void setCommandé(int commandé) {
        Commandé = commandé;
    }
    public void ToString() {
        System.out.println(this.getDesignationCon()+" Methode de préparation : "+this.ficheTechConsomable.getMethodePréparation().getDescription());
        System.out.println("Ingrédients : ");
        for(int i=0;i<this.ficheTechConsomable.getIngrédients().size();i++){
            System.out.println(" - "+this.ficheTechConsomable.getIngrédients().get(i).getProduit());
        }
    }
}
