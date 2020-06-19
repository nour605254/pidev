/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyNET.Entities;

/**
 *
 * @author nourhene
 */
public class Reponse {
    private int id;
    private int idq;
    private String valeur , reponse  ;

public Reponse(int id, String valeur , String reponse ) {
        this.id = id;
        this.valeur = valeur;
        this.reponse = reponse;
 }

    public Reponse() {
    }



    public int getId() {
        return id;
    }

   

    public String getValeur() {
        return valeur;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public String getReponse() {
        return reponse;
    }

@Override
    public String toString() {
        return "Reponse{" + "id=" + id + ", valeur=" + valeur + ", reponse=" + reponse + '}';
    }

}