/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lite.pidev.entities;

/**
 *
 * @author acer
 */
public class Note {
      private int idNote;
    private int cc;
    private int test;
 private int examen;
 private int MoyenneGeneral;

 private String NameMatiere;
   private String nomEleve;
   private  String prenomEleve;

    public int getIdNote() {
        return idNote;
    }

    public void setIdNote(int idNote) {
        this.idNote = idNote;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }

    public int getExamen() {
        return examen;
    }

    public void setExamen(int examen) {
        this.examen = examen;
    }

    public int getMoyenneGeneral() {
        return MoyenneGeneral;
    }

    public void setMoyenneGeneral(int MoyenneGeneral) {
        this.MoyenneGeneral = MoyenneGeneral;
    }

    public String getPrenomEleve() {
        return prenomEleve;
    }

    public void setPrenomEleve(String prenomEleve) {
        this.prenomEleve = prenomEleve;
    }

    public String getNameMatiere() {
        return NameMatiere;
    }

    public void setNameMatiere(String NameMatiere) {
        this.NameMatiere = NameMatiere;
    }
    
    

    public String getNomEleve() {
        return nomEleve;
    }

    public void setNomEleve(String nomEleve) {
        this.nomEleve = nomEleve;
    }
   
   
   
    public Note() {
    }


    public Note(int idNote, int cc , int test, int examen,int MoyenneGeneral  ,String NomElve,String PrenomEleve ,String NameMatiere) {
     this.idNote=idNote;
     this.cc=cc;
     this.test=test;
     this.MoyenneGeneral=MoyenneGeneral;
     this.nomEleve=NomElve;
     this.prenomEleve=PrenomEleve;
     this.NameMatiere=NameMatiere;
        
    }


     public Note(int idNote,int cc, int test) {
        this.idNote=idNote;
        this.cc=cc;
        this.test=test;
       

        
    }

   
    
    
}

