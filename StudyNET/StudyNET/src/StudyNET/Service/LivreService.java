/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyNET.Service;

import StudyNET.Entities.Categorie;
import StudyNET.Entities.Livre;
import StudyNET.Utils.Paths;
import com.codename1.io.CharArrayReader;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkEvent;
import com.codename1.io.NetworkManager;
import com.codename1.ui.events.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class LivreService {

    public ArrayList<Livre> getLivres() {
        ArrayList<Livre> listLivre = new ArrayList<>();
        ConnectionRequest con = new ConnectionRequest();
        con.setUrl(Paths.BaseURL+ "livre");
        con.addResponseListener(new ActionListener<NetworkEvent>() {
            @Override
            public void actionPerformed(NetworkEvent evt) {
                JSONParser jsonp = new JSONParser();
                try {
                    Map<String, Object> tasks = jsonp.parseJSON(new CharArrayReader(new String(con.getResponseData()).toCharArray()));
                    System.out.println(tasks);
                    List<Map<String, Object>> list = (List<Map<String, Object>>) tasks.get("root");
                    for (Map<String, Object> obj : list) {
                        Livre livre = new Livre();
                        Categorie category = new Categorie();
                        // Fill Category
                        Map<String, Object> objCategory = (Map<String, Object>) obj.get("category");
                        category.setId((int)Float.parseFloat(objCategory.get("id").toString()));
                        category.setNom(objCategory.get("nom").toString());
                        category.setDiscreption(objCategory.get("discreption").toString());
                        // Fill Livre
                        float id = Float.parseFloat(obj.get("id").toString());
                        livre.setId((int) id);
                        livre.setNom(obj.get("nom").toString());
                        livre.setAuteur(obj.get("auteur").toString());
                        livre.setResume(obj.get("resume").toString());
                        livre.setPhoto(obj.get("photo").toString());
                        livre.setEditur(obj.get("editur").toString());
                        livre.setQuantity((int)Float.parseFloat(obj.get("quantity").toString()));
                        livre.setNb_de_pages((int)Float.parseFloat(obj.get("nbDePages").toString()));
                        livre.setCategory(category);
                        listLivre.add(livre);
                    }
                } catch (IOException ex) {
                }
            }
        });
        NetworkManager.getInstance().addToQueueAndWait(con);
        return listLivre;
    }
}
