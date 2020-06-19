/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyNET.GUI;

import StudyNET.Entities.Livre;
import StudyNET.Entities.Reservation;
import StudyNET.Service.ReservationService;
import StudyNET.Utils.Paths;
import com.codename1.ui.util.Resources;
import com.codename1.components.ImageViewer;
import com.codename1.ui.Button;
import com.codename1.ui.Container;
import com.codename1.ui.Dialog;
import com.codename1.ui.Display;
import com.codename1.ui.EncodedImage;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.Toolbar;
import com.codename1.ui.URLImage;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.plaf.Border;
import com.codename1.ui.plaf.Style;
import com.codename1.ui.validation.NumericConstraint;
import com.codename1.ui.validation.Validator;

public class showLivresDetails {

    Form f;
    Resources theme;

    public showLivresDetails(Livre pr) {
        Container c = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        c.setWidth(Display.getInstance().getDisplayWidth());
        int deviceWidth = Display.getInstance().getDisplayWidth() / 2;
        Image placeholder = Image.createImage(deviceWidth, deviceWidth); //square image set to 10% of screen width
        EncodedImage encImage = EncodedImage.createFromImage(placeholder, false);
        URLImage imgsv = URLImage.createToStorage(encImage,
                Paths.Livrephotos + pr.getPhoto(),
                Paths.Livrephotos + pr.getPhoto(),
                URLImage.RESIZE_SCALE_TO_FILL);
        ImageViewer imgvb = new ImageViewer(imgsv);
        Label nom = new Label("Nom : " + pr.getNom());
        Label desc = new Label("Resume : " + pr.getResume());
        Label quantite = new Label("Quantite : " + pr.getQuantity());
        Label auteur = new Label("Auteur : " + pr.getAuteur());
        Label editur = new Label("Editur : " + pr.getEditur());
        Label nb_de_pages = new Label("NB de Page : " + pr.getNb_de_pages());
        Label Categorie = new Label("Categorie : " + pr.getCategory().getNom());
        c.add(imgvb);
        c.add(nom);
        c.add(desc);
        c.add(quantite);
        c.add(auteur);
        c.add(editur);
        c.add(nb_de_pages);
        c.add(Categorie);
        f = new Form(pr.getNom(), new BoxLayout(BoxLayout.Y_AXIS));
        Toolbar tb = f.getToolbar();
        tb.addMaterialCommandToRightBar("Back", FontImage.MATERIAL_ARROW_BACK, g
                -> {
            LivreList a = new LivreList();
            a.getF().show();
        });
        c.getAllStyles().setBorder(Border.createUnderlineBorder(3));      
        Button reservationBtn = reservationBtn(pr);
        f.add(c);
        f.add(reservationBtn);
    }

    
    public Button reservationBtn(Livre livre){
        Button btn3 = new Button("Reserver");
        btn3.setIcon(FontImage.createMaterial(FontImage.MATERIAL_ADD_SHOPPING_CART, btn3.getUnselectedStyle()));
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                // Cart.setProduct(p);
                Dialog d = new Dialog("Duree");
                TextField txt = new TextField();
                txt.setHint("please enter Duree(days)");
                txt.setConstraint(TextField.NUMERIC);
                Button ok = new Button("    Ok    ");
                Validator v = new Validator();
                v.addConstraint(
                        txt, new NumericConstraint(true, 1, 15, "duree has to be between 1 and 15 days")
                );
                v.addSubmitButtons(ok);
                ok.getAllStyles().setMarginUnit(Style.UNIT_TYPE_DIPS);
                d.add(txt);
                d.dispose();

                Button close = new Button("Close");
                ok.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        ReservationService rs = new ReservationService();
                        Reservation res = new Reservation();
                        res.setDuree(Integer.parseInt(txt.getText()));
                        res.setLivre(livre);
                        rs.reserverBook(res);
                        d.dispose();
                    }
                });
                close.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        d.dispose();
                    }
                });
                d.add(ok);
                d.add(close);
                d.showDialog();
            }
        });
        return btn3;
    }
    
    
    public Form getF() {
        return f;
    }

    public void setF(Form f) {
        this.f = f;
    }
}
