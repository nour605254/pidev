/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyNET.GUI;

import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BoxLayout;
import StudyNET.Entities.Questions;
import StudyNET.Entities.Reponse;
import StudyNET.Service.ServiceQuizz;
import java.util.ArrayList;


/**
 *
 * @author nourhene
 */
public class ListQuizzForm extends Form {

    ArrayList<Questions> questions;
    ArrayList<Reponse> reponses;
  
    
    public ListQuizzForm(Form previous) {
        setTitle("List Quizz");
        setLayout(BoxLayout.y());
        questions = ServiceQuizz.getInstance().getAllQuestions();
        
        for(Questions q : questions)
        {
            add(new Label("Question : "));
            add(new Label(q.getQuestion()));
            add(new Label("Reponses : "));
            reponses = ServiceQuizz.getInstance().getReponseQuestion(q.getId());
            for(Reponse r : reponses)
            {
                add(new Label(""+r.getReponse()+" "+r.getValeur()));
            }
            
            add(new Label("------------------"));
        }
        
        getToolbar().addMaterialCommandToLeftBar("", FontImage.MATERIAL_ARROW_BACK, e-> previous.showBack());
    }
    
    
    
}
