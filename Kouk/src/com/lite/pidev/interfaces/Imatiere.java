/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lite.pidev.interfaces;

import com.lite.pidev.entities.Matiere;
import javafx.collections.ObservableList;

/**
 *
 * @author acer
 */
public interface Imatiere {
    public void addMatiere(Matiere m);
    public void update(Matiere m, int id);
    public void deleteMatiere(Matiere m);
    public ObservableList getAllMatieres();
    public Matiere getMatiereParId(int id);
   
}
