package StudyNET.GUI;

import StudyNET.Entities.Matiere;
import com.codename1.components.SpanLabel;
import com.codename1.ui.Button;
import com.codename1.ui.Container;
import com.codename1.ui.Dialog;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.plaf.Style;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.spinner.Picker;
import com.codename1.ui.util.Resources;
import java.util.ArrayList;
import StudyNET.Service.ServiceMatiere;

public class AffMatiere {

    ArrayList<Matiere> listMatieres = new ArrayList<>();
    Form f;
    SpanLabel lb;

    public AffMatiere(Resources res) {

        ServiceMatiere se = new ServiceMatiere();
        listMatieres = se.getList2();

        f = new Form();
        lb = new SpanLabel("");
        f.add(lb);
        CrudMatiere serviceTask = new CrudMatiere();
        lb.setText(serviceTask.getList2().toString());
        for (Matiere ma : listMatieres) {
            Container c = new Container();
            System.out.println("first.Affichage.<init>()" + ma.getName() + ",,,,,,,,,,");
            Label Name = new Label(ma.getName());
           
            Label Coefficient = new Label(ma.getCoefficient());
            Label Module = new Label(ma.getModule ());
     
           
            Style s = UIManager.getInstance().getComponentStyle("Button");
            Image icon = FontImage.createMaterial(FontImage.MATERIAL_CANCEL, s, 3);
            Button supprimer = new Button(icon);

            Image icon1 = FontImage.createMaterial(FontImage.MATERIAL_EDIT, s, 3);
            Button modifier = new Button(icon1);

            c.addAll(BoxLayout.encloseX(
                    BoxLayout.encloseY(Name, Coefficient,Module),
                    supprimer, modifier
            ));

            supprimer.addActionListener(ev -> {
                if (Dialog.show("Innformation", "Voulez vous vraiment  le supprimer ", "oui", "non")) {
                    se.SupprimerEvent(ma.getId());
                    f.revalidate();
                    Affichage aff = new Affichage(res);
                }
                ;
            });
            modifier.addActionListener(ev -> {
                Matiere t = new Matiere();
                t.setId(en.getIdevent());
                System.out.println("Id ;"+ma.getId());
                t.setName(ma.getName());
           
                t.setCoefficient(ma.getCoefficient());
                t.setModule(ma.getModule(());
       
                System.out.println(t);
                Modifier m = new Modifier(res, t);
                //se.Modifier(t);

            });

            f.add(c);
        }
        f.getToolbar().addCommandToLeftBar("back", null, en -> new ProfileForm(res).show());

        f.show();

    }

    public Form getF() {
        return f;
    }

    public void setF(Form f) {
        this.f = f;
    }

}
