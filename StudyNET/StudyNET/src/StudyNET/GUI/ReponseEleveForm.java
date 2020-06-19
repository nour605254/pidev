/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyNET.GUI;

import com.codename1.ui.Button;
import com.codename1.ui.ButtonGroup;
import com.codename1.ui.Dialog;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.RadioButton;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BoxLayout;
import StudyNET.Entities.Questions;
import StudyNET.Entities.Reponse;
import StudyNET.Service.ServiceQuizz;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author nourhene
 */
public class ReponseEleveForm extends Form {

    ArrayList<Questions> questions;
    ArrayList<Reponse> reponses;
    int question =0;
    int score=0;
    public ReponseEleveForm(Form previous) {
        setTitle("Quizz");
        setLayout(BoxLayout.y());
        Label QuestionTxt = new Label();
        Label rep1 = new Label();
        rep1.getStyle().setPaddingRight(10);
        rep1.setSameWidth(QuestionTxt);
         Label rep2 = new Label();
        
         rep2.getStyle().setPaddingRight(10);
          Label rep3 = new Label();
          
          rep3.getStyle().setPaddingRight(10);
          
        
        RadioButton rb1 = new RadioButton();
        RadioButton rb2 = new RadioButton();
        RadioButton rb3 = new RadioButton();
        ButtonGroup buttonGroup = new ButtonGroup(rb1,rb2,rb3);
        Button rep = new Button("Repondre");
        questions = ServiceQuizz.getInstance().getAllQuestions();
        reponses = ServiceQuizz.getInstance().getReponseQuestion(questions.get(question).getId());
        
        
        
       
        
            add(new Label("Question : "));
            QuestionTxt.setText(questions.get(question).getQuestion());
            add(QuestionTxt);
            add(new Label("Reponses : "));
            rep1.setText(reponses.get(0).getReponse());
            rep2.setText(reponses.get(1).getReponse());
            rep3.setText(reponses.get(2).getReponse());
            add(encloseIn(BoxLayout.x(), rep1 ,rb1));
            add(encloseIn(BoxLayout.x(), rep2 ,rb2));
            add(encloseIn(BoxLayout.x(), rep3 ,rb3));
            add(rep);
            
            rep.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
               
                
                if(rb1.isSelected() && reponses.get(0).getValeur().equals("correct"))
                {
                    score+=10;
                }
                if(rb2.isSelected() && reponses.get(1).getValeur().equals("correct"))
                {
                    score+=10;
                }
                if(rb3.isSelected() && reponses.get(2).getValeur().equals("correct"))
                {
                    score+=10;
                }
                
                
                if(question!=questions.size()-1)
                {
                    question++;
                    QuestionTxt.setText(questions.get(question).getQuestion());
                    reponses = ServiceQuizz.getInstance().getReponseQuestion(questions.get(question).getId());
                    rb1.setSelected(false);
                    rb2.setSelected(false);
                    rb3.setSelected(false);
                    
                    rep1.setText(reponses.get(0).getReponse());
                    rep2.setText(reponses.get(1).getReponse());
                    rep3.setText(reponses.get(2).getReponse());
                    
                    
                     
                }else
                {
                   
                    
                    
                    if(Dialog.show("Vous avez répondu a tous les quizz", null, "ok", null))
                    {
                        Dialog.show("Votre Score est: "+score,null,"ok",null);
                        
                    }
                }
            }
        });
        
        
        
        
        
        
        
        
    }
    
    
    
}
