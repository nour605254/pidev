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
public class Matiere {
      private int id;
    private String Name;
    private String Module;
    private int Coefficient;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getModule() {
        return Module;
    }

    public void setModule(String Module) {
        this.Module = Module;
    }

    public int getCoefficient() {
        return Coefficient;
    }

    public void setCoefficient(int Coefficient) {
        this.Coefficient = Coefficient;
    }

    
   
  

  

    public Matiere() {
    }


    public Matiere(int id, String Name, int coefficient ,String Module) {
        this.id = id;
        this.Name = Name;
             this.Coefficient = Coefficient;

        this.Module = Module;
        
    }

  

     public Matiere(int id, String Name) {
        this.id = id;
        this.Name = Name;
      
        
    }

   
    
    
}

