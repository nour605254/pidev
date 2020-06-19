/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyNET.GUI;

import com.codename1.components.OnOffSwitch;
import com.codename1.ui.Button;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BoxLayout;
import StudyNET.Entities.Questions;
import StudyNET.Entities.Reponse;
import StudyNET.Service.ServiceQuizz;

/**
 *
 * @author nourhene
 */
public class AddQuizzForm extends Form {

    int idq;
    public AddQuizzForm(Form previous) {
        setTitle("Add Quizz");
        setLayout(BoxLayout.y());
        TextField q = new TextField();
        Button btn = new Button("Add Quizz");
        TextField r1 = new TextField();
        TextField r2 = new TextField();
        TextField r3 = new TextField();
        OnOffSwitch p1 = new OnOffSwitch();
        p1.setOn("correct");
        p1.setOff("incorrect");
        
        OnOffSwitch p2 = new OnOffSwitch();
        p1.setOn("correct");
        p1.setOff("incorrect");
        
        OnOffSwitch p3 = new OnOffSwitch();
        p1.setOn("correct");
        p1.setOff("incorrect");
       
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                Questions qs = new Questions(q.getText());
                Reponse rep1;
                Reponse rep2;
                Reponse rep3;
               
                
                idq=ServiceQuizz.getInstance().addQuizz(qs);
                if(p1.isValue()==false)
                {
                     rep1 = new Reponse(idq,"incorrect", r1.getText());
                }else
                {
                     rep1 = new Reponse(idq,"correct", r1.getText());
                }
                
                if(p2.isValue()==false)
                {
                     rep2 = new Reponse(idq,"incorrect", r2.getText());
                }else
                {
                     rep2 = new Reponse(idq,"correct", r2.getText());
                }
                
                if(p3.isValue()==false)
                {
                     rep3 = new Reponse(idq,"incorrect", r3.getText());
                }else
                {
                     rep3 = new Reponse(idq,"correct", r3.getText());
                }
                    
                ServiceQuizz.getInstance().addReponse(rep1);
                ServiceQuizz.getInstance().addReponse(rep2);
                ServiceQuizz.getInstance().addReponse(rep3);
                
                 
            }
        });
        
        add(encloseIn(BoxLayout.x(), new Label("Question: "),q));
        add(encloseIn(BoxLayout.x(), new Label("Reponse 1: "),r1));
        add(encloseIn(BoxLayout.x(), new Label("incorrect "),p1,new Label(" correct")));
        add(encloseIn(BoxLayout.x(), new Label("Reponse 2: "),r2));
         add(encloseIn(BoxLayout.x(), new Label("incorrect "),p2,new Label(" correct")));
        add(encloseIn(BoxLayout.x(), new Label("Reponse 3: "),r3));
         add(encloseIn(BoxLayout.x(), new Label("incorrect "),p3,new Label(" correct")));
        add(btn);
        
        
        getToolbar().addMaterialCommandToLeftBar("", FontImage.MATERIAL_ARROW_BACK, e-> previous.showBack());
        
    }
    
    
}
