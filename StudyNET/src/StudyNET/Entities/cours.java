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
public class cours {

    private int id;
    private String libelle, nom, image;
    private prof prof;

    public cours(int id, String libelle, String nom, String image, prof prof) {
        this.id = id;
        this.libelle = libelle;
        this.nom = nom;
        this.image = image;
        this.prof = prof;

    }
    
    public cours()
    {
        
    }

    public cours(String libelle, String nom, String image, prof prof) {
        this.libelle = libelle;
        this.nom = nom;
        this.image = image;
        this.prof = prof;
    }
    
    

    
    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setProf(prof prof) {
        this.prof = prof;
    }

    public String getNom() {
        return nom;
    }

    public String getImage() {
        return image;
    }

    public prof getProf() {
        return prof;
    }

    @Override
    public String toString() {
        return "cours{" + "id=" + id + ", libelle=" + libelle + ", nom=" + nom + ", image=" + image + ", prof=" + prof + '}';
    }

}
