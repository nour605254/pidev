/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyNET.Entities;

/**
 *
 * @author elbrh
 */
public class Livre {

    private int id, Nb_de_pages, quantity;
    private Categorie category;
    private String nom, resume, auteur, editur, photo;

    public Livre() {
        this.category = new Categorie();
    }
    
    
    
    
    

    @Override
    public String toString() {
        return "Livre{" + "id=" + id + ", nom=" + nom + '}';
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNb_de_pages() {
        return Nb_de_pages;
    }

    public void setNb_de_pages(int Nb_de_pages) {
        this.Nb_de_pages = Nb_de_pages;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Categorie getCategory() {
        return category;
    }

    public void setCategory(Categorie category) {
        this.category = category;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getEditur() {
        return editur;
    }

    public void setEditur(String editur) {
        this.editur = editur;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    
    
    
    
}
