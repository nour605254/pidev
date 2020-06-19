/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyNET.GUI;

import StudyNET.Entities.Categorie;
import StudyNET.Entities.Livre;
import StudyNET.Entities.Reservation;
import StudyNET.Service.LivreService;
import StudyNET.Service.ReservationService;
import StudyNET.Utils.Paths;
import com.codename1.ui.AutoCompleteTextField;
import com.codename1.ui.Button;
import com.codename1.ui.Component;
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
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.list.DefaultListModel;
import com.codename1.ui.list.ListCellRenderer;
import com.codename1.ui.list.ListModel;
import com.codename1.ui.plaf.Border;
import com.codename1.ui.plaf.Style;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import com.codename1.ui.validation.NumericConstraint;
import com.codename1.ui.validation.Validator;
import java.util.ArrayList;


public class showLivresSelonCategorie extends SideMenuBaseForm {
    Form f;
    Resources theme;

    public showLivresSelonCategorie(Categorie c) {
        theme = UIManager.initFirstTheme("/theme");
        f = new Form("Bibliotheque selon Categorie", BoxLayout.y());
        Toolbar tb = f.getToolbar();
        tb.addMaterialCommandToRightBar("Back", FontImage.MATERIAL_ARROW_BACK, g -> {
            CategorieList a = new CategorieList();
            a.getF().show();
        });
        LivreService sp = new LivreService();
        ArrayList<Livre> booksList = sp.getLivres();
        ArrayList<Livre> p = new ArrayList<>();
        for (Livre pr : booksList) {
            if(pr.getCategory().getId() == c.getId()){
                p.add(pr);
            }
        }
        ListModel<String> autoP = new DefaultListModel<>();
        ListModel<URLImage> pictures = new DefaultListModel<>();
        final int size = Display.getInstance().convertToPixels(7);
        final EncodedImage placeholder = EncodedImage.createFromImage(Image.createImage(size, size, 0xffcccccc), true);
        for (Livre pr : p) {
            autoP.addItem(pr.getNom());
            URLImage urli = URLImage.createToStorage(placeholder,
                    Paths.Livrephotos + pr.getPhoto(),
                    Paths.Livrephotos  + pr.getPhoto());
            pictures.addItem(urli);
        }
        Container Filter = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        AutoCompleteTextField ac = new AutoCompleteTextField(autoP);
        ac.setCompletionRenderer(new ListCellRenderer() {
            private final Label focus = new Label();
            private final Label line1 = new Label();
            private final Label icon = new Label();
            private final Container selection = BorderLayout.center(
                    BoxLayout.encloseY(line1)).add(BorderLayout.EAST, icon);
            @Override
            public Component getListCellRendererComponent(com.codename1.ui.List list, Object value, int index, boolean isSelected) {
                for (int iter = 0; iter < autoP.getSize(); iter++) {
                    if (autoP.getItemAt(iter).equals(value)) {
                        line1.setText(autoP.getItemAt(iter));
                        icon.setIcon(pictures.getItemAt(iter));
                        break;
                    }

                }
                return selection;
            }

            @Override
            public Component getListFocusComponent(com.codename1.ui.List list) {
                return focus;
            }
        });
        Filter.add(ac);
        System.out.println(ac.getText());
        Container ctnlistProduct;
        System.err.println(p.size());
        super.setupSideMenu(f);
        ctnlistProduct = fillContainer(p);
        f.add(Filter);
        f.add(ctnlistProduct);
        ac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (!"".equals(ac.getText())) {
                    showLivresSelonCategorie pl = new showLivresSelonCategorie(c,ac.getText());
                    pl.getF().show();
                } else {
                    showLivresSelonCategorie pl = new showLivresSelonCategorie(c);
                    pl.getF().show();
                }
            }
        });
    }

    public showLivresSelonCategorie(Categorie c , String name) {
        theme = UIManager.initFirstTheme("/theme");
        f = new Form("Bibliotheque selon Categorie", BoxLayout.y());
        Toolbar tb = f.getToolbar();
        tb.addMaterialCommandToRightBar("Back", FontImage.MATERIAL_ARROW_BACK, g -> {
            CategorieList a = new CategorieList();
            a.getF().show();
        });
        LivreService sp = new LivreService();        
        ArrayList<Livre> pp = sp.getLivres();
        ArrayList<Livre> p = new ArrayList<>();
        for (Livre pr : pp) {
            if(pr.getNom().equals(name) && pr.getCategory().getId() == c.getId()){
                p.add(pr);
            }
        }
        Container Filter = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        ListModel<String> autoP = new DefaultListModel<>();
        ListModel<URLImage> pictures = new DefaultListModel<>();
        final int size = Display.getInstance().convertToPixels(7);
        final EncodedImage placeholder = EncodedImage.createFromImage(Image.createImage(size, size, 0xffcccccc), true);
        for (Livre pr : p) {
            autoP.addItem(pr.getNom());
            System.err.println(pr.getNom());
            URLImage urli = URLImage.createToStorage(placeholder,
                    Paths.Livrephotos + pr.getPhoto(),
                    Paths.Livrephotos  + pr.getPhoto());
            pictures.addItem(urli);
        }
        AutoCompleteTextField ac = new AutoCompleteTextField(autoP);
        ac.setCompletionRenderer(new ListCellRenderer() {
            private final Label focus = new Label();
            private final Label line1 = new Label();
            private final Label icon = new Label();
            private final Container selection = BorderLayout.center(
                    BoxLayout.encloseY(line1)).add(BorderLayout.EAST, icon);
            @Override
            public Component getListCellRendererComponent(com.codename1.ui.List list, Object value, int index, boolean isSelected) {
                for (int iter = 0; iter < autoP.getSize(); iter++) {
                    if (autoP.getItemAt(iter).equals(value)) {
                        line1.setText(autoP.getItemAt(iter));
                        System.out.println(autoP.getItemAt(iter));
                        icon.setIcon(pictures.getItemAt(iter));
                        break;
                    }
                }
                return selection;
            }
            @Override
            public Component getListFocusComponent(com.codename1.ui.List list) {
                return focus;
            }
        });
        Filter.add(ac);
        Container ctnlistProduct;
        super.setupSideMenu(f);
        System.err.println(p.size());
        ctnlistProduct = fillContainer((ArrayList<Livre>) p);
        f.add(Filter);
        f.add(ctnlistProduct);
        ac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (!"".equals(ac.getText())) {
                    showLivresSelonCategorie pl = new showLivresSelonCategorie(c,ac.getText());
                    pl.getF().show();
                } else {
                    showLivresSelonCategorie pl = new showLivresSelonCategorie(c);
                    pl.getF().show();
                }
            }
        });
    }
    public Container fillContainer(ArrayList<Livre> p) {
        Container ctnlistProduct = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        if (p.size() > 0) {
            for (Livre pr : p) {
                Button btn3 = reservationBtn(pr);
                Container c = new Container(new BoxLayout(BoxLayout.X_AXIS));
                Label label = new Label();
                int deviceWidth = Display.getInstance().getDisplayWidth() / 4;
                Image placeholder = Image.createImage(deviceWidth, deviceWidth); //square image set to 10% of screen width
                EncodedImage encImage = EncodedImage.createFromImage(placeholder, false);
                label.setIcon(URLImage.createToStorage(encImage,
                        "Large_" + Paths.Livrephotos + pr.getPhoto()
                        + "", Paths.Livrephotos + pr.getPhoto()
                        + "", URLImage.RESIZE_SCALE_TO_FILL));
                c.add(label);
                Container cnt = new Container(new BoxLayout(BoxLayout.Y_AXIS));
                cnt.getAllStyles().setPaddingLeft(2);
                cnt.add(pr.getNom());
                cnt.add(pr.getQuantity()+ " Copies Disponible");
                c.add(cnt);
                Button show = new Button("Details");
                show.setIcon(FontImage.createMaterial(FontImage.MATERIAL_INFO_OUTLINE, show.getUnselectedStyle()));
                show.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {

                            showLivresDetails sh = new showLivresDetails(pr);
                            sh.getF().show();

                        System.out.println(pr.getId());
                    }
                });
                Container cnt1 = new Container(new BoxLayout(BoxLayout.Y_AXIS));
                cnt1.add(show);
                if(pr.getQuantity() != 0 ){
                    cnt1.add(btn3);
                }
                Container cc = new Container(new BoxLayout(BoxLayout.Y_AXIS));
                cc.add(c);
                cc.add(cnt1);
                cc.getAllStyles().setBorder(Border.createGrooveBorder(2));
                ctnlistProduct.add(cc);
            }
        }
        else{
            Label vide = new Label("No Books Available");
            ctnlistProduct.add(vide);
        }
        return ctnlistProduct;
    }

    public Button reservationBtn(Livre livre){
        Button btn3 = new Button("Reserver");
        btn3.setIcon(FontImage.createMaterial(FontImage.MATERIAL_ADD_SHOPPING_CART, btn3.getUnselectedStyle()));
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Dialog d = new Dialog("Duree");
                TextField txt = new TextField();
                txt.setHint("please enter Duree(days)");
                txt.setConstraint(TextField.NUMERIC);
               Button ok = new Button("    Ok    ");
                Validator v = new Validator();
                ok.getAllStyles().setMarginUnit(Style.UNIT_TYPE_DIPS);
                v.addConstraint(
                        txt, new NumericConstraint(true, 1, 15, "duree has to be between 1 and 15 days")
                );
                v.addSubmitButtons(ok);
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
