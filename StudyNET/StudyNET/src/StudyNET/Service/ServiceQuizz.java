/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyNET.Service;

import com.codename1.components.ToastBar;
import com.codename1.io.CharArrayReader;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkEvent;
import com.codename1.io.NetworkManager;
import com.codename1.ui.events.ActionListener;
import StudyNET.Entities.Questions;
import StudyNET.Entities.Reponse;
import StudyNET.Utils.Statics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author nourhene
 */
public class ServiceQuizz {
    public static ServiceQuizz instance=null;
    public boolean resultOK;
    int idq ;
      public ArrayList<Questions> questions;
    public ArrayList<Reponse> reponses;
    private ConnectionRequest req;
    
    
    private ServiceQuizz() {
         req = new ConnectionRequest();
    }
    
    public static ServiceQuizz getInstance() {
        if (instance == null) {
            instance = new ServiceQuizz();
        }
        return instance;
    }
    
    public int addQuizz(Questions q)
    {
        
                String url = Statics.BASE_URL + "/addquizz/";
                
                req.addArgument("question", q.getQuestion());
                req.setUrl(url);// Insertion de l'URL de notre demande de connexion
                req.addResponseListener(new ActionListener<NetworkEvent>() {

                    @Override
                    public void actionPerformed(NetworkEvent evt) {
                        String ch;
                        if(req.getResponseCode() == 200) //Code HTTP 200 OK
                        {
                            ch = new String(req.getResponseData());
                          idq = Integer.parseInt(ch);
                            
                        }
                        req.removeResponseListener(this); //Supprimer cet actionListener
                    }
                });
                NetworkManager.getInstance().addToQueueAndWait(req);
            return idq;
    }
    
    public boolean addReponse(Reponse r)
    {
        String url = Statics.BASE_URL + "/addReponse/";
        req.removeAllArguments();
        req.addArgument("idq", String.valueOf(r.getId()));
        req.addArgument("valeur", r.getValeur());
        req.addArgument("reponse", r.getReponse());
         req.setUrl(url);
         req.addResponseListener(new ActionListener<NetworkEvent>() {

            @Override
            public void actionPerformed(NetworkEvent evt) {
                resultOK = req.getResponseCode() == 200;
                req.removeResponseListener(this);
            }
        });
         NetworkManager.getInstance().addToQueueAndWait(req);
         return resultOK;
    }
    
    public ArrayList<Questions> getAllQuestions()
    {
       String url = Statics.BASE_URL + "/getAllQuestion/";
       req.setUrl(url);
       req.setPost(false);
       req.addResponseListener(new ActionListener<NetworkEvent>() {

           @Override
           public void actionPerformed(NetworkEvent evt) {
               try {
                   questions = parseQuestions(new String(req.getResponseData()));
               } catch (IOException ex) {
                   System.out.println(ex.getMessage());
               }
               req.removeResponseListener(this);
           }
       });
       NetworkManager.getInstance().addToQueueAndWait(req);
       return  questions;
    }
    
    
   public ArrayList<Questions> parseQuestions(String jsonText) throws IOException
   {
       questions = new ArrayList<>();
       JSONParser j = new JSONParser();
       Map<String,Object> QuestionsListJson = j.parseJSON(new CharArrayReader(jsonText.toCharArray()));
       List<Map<String,Object>> list = (List<Map<String,Object>>)QuestionsListJson.get("root");
       for(Map<String,Object> obj : list){
           Questions q = new Questions();
           float id = Float.parseFloat(obj.get("id").toString());
           q.setId((int)id);
           q.setQuestion(obj.get("question").toString());
           questions.add(q);
       }       
       return questions;
   }
   
   public ArrayList<Reponse> getReponseQuestion(int id)
   {
       String url = Statics.BASE_URL + "/getReponses/";
       req.removeAllArguments();
       req.addArgument("idq", String.valueOf(id));
       req.setUrl(url);
       req.addResponseListener(new ActionListener<NetworkEvent>() {

           @Override
           public void actionPerformed(NetworkEvent evt) {
               try {
                   reponses = parseReponses(new String(req.getResponseData()));
               } catch (IOException ex) {
                   System.out.println(ex.getMessage());
               }
               req.removeResponseListener(this);
           }
       });
       NetworkManager.getInstance().addToQueueAndWait(req);
       return reponses;
       
   }
   
   public ArrayList<Reponse> parseReponses(String jsonText) throws IOException
   {
       reponses = new ArrayList<>();
       JSONParser j = new JSONParser();
       Map<String,Object> ReponsesListJson = j.parseJSON(new CharArrayReader(jsonText.toCharArray()));
       List<Map<String,Object>> list = (List<Map<String,Object>>)ReponsesListJson.get("root");
       for(Map<String,Object> obj : list){
           Reponse r = new Reponse();
           float id = Float.parseFloat(obj.get("id").toString());
           r.setId((int)id);
           r.setValeur(obj.get("valeur").toString());
           r.setReponse(obj.get("reponse").toString());
           reponses.add(r);
       }      
       return reponses;
   }
    
}
