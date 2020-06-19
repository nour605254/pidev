/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyNET.Service;

import StudyNET.Entities.Categorie;
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

public class CategorieService {

    public ArrayList<Categorie> getCategories() {
        ArrayList<Categorie> listCategorie = new ArrayList<>();
        ConnectionRequest con = new ConnectionRequest();
        con.setUrl(Paths.BaseURL + "categorie");
        con.addResponseListener(new ActionListener<NetworkEvent>() {
            @Override
            public void actionPerformed(NetworkEvent evt) {
                JSONParser jsonp = new JSONParser();

                try {
                    Map<String, Object> tasks = jsonp.parseJSON(new CharArrayReader(new String(con.getResponseData()).toCharArray()));
                    System.out.println(tasks);
                    //System.out.println(tasks);
                    List<Map<String, Object>> list = (List<Map<String, Object>>) tasks.get("root");
                    for (Map<String, Object> obj : list) {
                        Categorie categorie = new Categorie();
                        float id = Float.parseFloat(obj.get("id").toString());
                        categorie.setId((int) id);
                        categorie.setNom(obj.get("nom").toString());
                        categorie.setDiscreption(obj.get("discreption").toString());
                        listCategorie.add(categorie);
                    }
                } catch (IOException ex) {
                }

            }
        });
        NetworkManager.getInstance().addToQueueAndWait(con);
        return listCategorie;
    }
}
