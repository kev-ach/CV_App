package com.example.kevin.cv_app;

public class ItemModel {

    private String name;
    private String memo;
    private String btnName;
    private String nomClasse;

    public ItemModel(String name, String memo, String btnName, String nomClasse){
        this.name = name;
        this.memo = memo;
        this.btnName = btnName;
        this.nomClasse = nomClasse;
    }

    public String getName() {
        return name;
    }

    public String getMemo() {
        return memo;
    }

    public String getBtnName() {
        return btnName;
    }

    public String getNomClasse() {
        return nomClasse;
    }
}
