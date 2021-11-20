package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodePréparation {
    private String idMethode,description,tempNaicéssaire;

    public MethodePréparation(String idMethode, String description, String tempNaicéssaire) {
        this.idMethode = idMethode;
        this.description = description;
        this.tempNaicéssaire = tempNaicéssaire;
    }

    public MethodePréparation() {
    }

    public String getIdMethode() {
        return idMethode;
    }

    public void setIdMethode(String idMethode) {
        this.idMethode = idMethode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTempNaicéssaire() {
        return tempNaicéssaire;
    }

    public void setTempNaicéssaire(String tempNaicéssaire) {
        this.tempNaicéssaire = tempNaicéssaire;
    }
}
