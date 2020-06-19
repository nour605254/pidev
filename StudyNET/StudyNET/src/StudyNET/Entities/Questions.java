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
public class Questions {
    private int id;
    private String question ;

public Questions(int id, String question) {
        this.id = id;
        this.question = question;
    }

    public Questions() {
    }


    public Questions(String text) {
        this.question = text;
       }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Questions{" + "id=" + id + ", question=" + question + '}';
    }









}
