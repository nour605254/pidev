/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyNET.Service;

import StudyNET.Entities.Categorie;
import StudyNET.Entities.Livre;
import StudyNET.Entities.Reservation;
import StudyNET.Utils.ConnectedUser;
import StudyNET.Utils.Paths;
import StudyNET.Utils.SendSMS;
import com.codename1.io.CharArrayReader;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkEvent;
import com.codename1.io.NetworkManager;
import com.codename1.ui.Dialog;
import com.codename1.ui.events.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author elbrh
 */
public class ReservationService {

    public void reserverBook(Reservation p) {
        ConnectionRequest con = new ConnectionRequest();
        con.setUrl(Paths.BaseURL + "reserverLivre?userId=" + ConnectedUser.getUser().getId() + "&livreId=" + p.getLivre().getId()
        + "&duree=" + p.getDuree());
        con.addResponseListener(new ActionListener<NetworkEvent>() {
            @Override
            public void actionPerformed(NetworkEvent evt) {
                try {
                    String json = new String(con.getResponseData());
                    JSONParser j = new JSONParser();
                    Map<String, Object> service = j.parseJSON(new CharArrayReader(json.toCharArray()));
                    if (service.get("id") != null) {
                        Dialog.show("Reservtion succes", "Livre Reserver Avec Succes", "OK", "Annuler");
                        SendSMS.sendSms(p.getLivre().getNom());
                    }

                } catch (IOException ex) {
                }
            }
        });
        NetworkManager.getInstance().addToQueue(con);
    }

    public ArrayList<Reservation> getReservedBooks() {
        ArrayList<Reservation> listCategorie = new ArrayList<>();
        ConnectionRequest con = new ConnectionRequest();
        con.setUrl(Paths.BaseURL + "reservedLivre?userId=" + ConnectedUser.getUser().getId());
        con.addResponseListener(new ActionListener<NetworkEvent>() {
            @Override
            public void actionPerformed(NetworkEvent evt) {
                JSONParser jsonp = new JSONParser();
                try {
                    Map<String, Object> tasks = jsonp.parseJSON(new CharArrayReader(new String(con.getResponseData()).toCharArray()));
                    List<Map<String, Object>> list = (List<Map<String, Object>>) tasks.get("root");
                    for (Map<String, Object> obj : list) {
                        Map<String, Object> objLivre = (Map<String, Object>) obj.get("livre");
                        // Fill Category
                        Categorie category = new Categorie();
                        Map<String, Object> objCategory = (Map<String, Object>) objLivre.get("category");
                        category.setId((int) Float.parseFloat(objCategory.get("id").toString()));
                        category.setNom(objCategory.get("nom").toString());
                        category.setDiscreption(objCategory.get("discreption").toString());
                        // Fill Livre
                        Livre livre = new Livre();
                        float idLIvre = Float.parseFloat(objLivre.get("id").toString());
                        livre.setId((int) idLIvre);
                        livre.setNom(objLivre.get("nom").toString());
                        livre.setAuteur(objLivre.get("auteur").toString());
                        livre.setResume(objLivre.get("resume").toString());
                        livre.setPhoto(objLivre.get("photo").toString());
                        livre.setEditur(objLivre.get("editur").toString());
                        livre.setQuantity((int) Float.parseFloat(objLivre.get("quantity").toString()));
                        livre.setNb_de_pages((int) Float.parseFloat(objLivre.get("nbDePages").toString()));
                        livre.setCategory(category);
                        //Fill Reservation
                        Reservation res = new Reservation();
                        res.setId((int) Float.parseFloat(obj.get("id").toString()));
                        res.setState(obj.get("state").toString());
                        res.setDuree((int) Float.parseFloat(obj.get("duree").toString()));
                        res.setLivre(livre);
                        res.setUser(ConnectedUser.getUser());
                        //Add To list
                        listCategorie.add(res);
                    }
                } catch (IOException ex) {
                }

            }
        });
        NetworkManager.getInstance().addToQueueAndWait(con);
        return listCategorie;
    }
}
