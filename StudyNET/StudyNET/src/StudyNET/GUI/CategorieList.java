/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyNET.GUI;

import StudyNET.Entities.Categorie;
import StudyNET.Service.CategorieService;
import com.codename1.ui.AutoCompleteTextField;
import com.codename1.ui.Button;
import com.codename1.ui.Component;
import com.codename1.ui.Container;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.list.DefaultListModel;
import com.codename1.ui.list.ListCellRenderer;
import com.codename1.ui.list.ListModel;
import com.codename1.ui.plaf.Border;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import java.util.ArrayList;

public class CategorieList extends SideMenuBaseForm {

    public CategorieList() {
        theme = UIManager.initFirstTheme("/theme");
        f = new Form("List de Categorie", BoxLayout.y());
        CategorieService sp = new CategorieService();
        ArrayList<Categorie> p = sp.getCategories();
        ListModel<String> autoP = new DefaultListModel<>();
        for (Categorie pr : p) {
            autoP.addItem(pr.getNom());
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
                    CategorieList pl = new CategorieList(ac.getText());
                    pl.getF().show();
                } else {
                    CategorieList pl = new CategorieList();
                    pl.getF().show();
                }

            }
        });
    }

    public CategorieList(String text) {
        theme = UIManager.initFirstTheme("/theme");
        f = new Form("Liste de Categorie", BoxLayout.y());
        CategorieService sp = new CategorieService();
        ArrayList<Categorie> p = sp.getCategories();
        ArrayList<Categorie> res = new ArrayList<>();
        ListModel<String> autoP = new DefaultListModel<>();
        for (Categorie pr : p) {
            autoP.addItem(pr.getNom());
            if (pr.getNom().toLowerCase().contains(text.toLowerCase())) {
                res.add(pr);
            }
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
        ctnlistProduct = fillContainer(res);
        f.add(Filter);
        f.add(ctnlistProduct);
        ac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (!"".equals(ac.getText())) {
                    CategorieList pl = new CategorieList(ac.getText());
                    //CategorieList pl = new CategorieList();
                    pl.getF().show();
                } else {
                    CategorieList pl = new CategorieList();
                    pl.getF().show();
                }

            }
        });
    }

    public Container fillContainer(ArrayList<Categorie> p) {
        Container ctnlistProduct = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        if (p.size() > 0) {
            for (Categorie pr : p) {
                Container c = new Container(new BoxLayout(BoxLayout.X_AXIS));
                Label label = new Label();
                c.add(label);
                Container cnt = new Container(new BoxLayout(BoxLayout.Y_AXIS));
                cnt.getAllStyles().setPaddingLeft(2);
                cnt.add(pr.getNom());
                c.add(cnt);
                Button show = new Button("montrer des livres avec cette catégorie");
                show.setIcon(FontImage.createMaterial(FontImage.MATERIAL_INFO_OUTLINE, show.getUnselectedStyle()));
                show.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        showLivresSelonCategorie sh = new showLivresSelonCategorie(pr);
                        sh.getF().show();
                        System.out.println(pr.getId());
                    }
                });
                Container cnt1 = new Container(new BoxLayout(BoxLayout.Y_AXIS));
                cnt1.add(show);
                Container cc = new Container(new BoxLayout(BoxLayout.Y_AXIS));
                cc.add(c);
                cc.add(cnt1);
                cc.getAllStyles().setBorder(Border.createGrooveBorder(2));
                ctnlistProduct.add(cc);
            }
        } else {
            Label vide = new Label("aucune categorie disponible");
            ctnlistProduct.add(vide);
        }
        return ctnlistProduct;

    }
    Form f;
    Resources theme;

    public Form getF() {
        return f;
    }

    public void setF(Form f) {
        this.f = f;
    }

}
