package StudyNET.GUI;

import StudyNET.Entities.Matiere;
import com.codename1.capture.Capture;
import com.codename1.components.SpanLabel;
import com.codename1.io.Log;
import com.codename1.l10n.SimpleDateFormat;
import com.codename1.ui.Button;
import com.codename1.ui.ComboBox;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.spinner.Picker;
import com.codename1.ui.util.Resources;

import StudyNET.Service.ServiceMatiere;

public class ModifierMatiere {
String path = "" ;
    public ModifierMatiere(Resources res,Matiere me) {
         
        SpanLabel lb;
        Form modif = new Form("Remplissez ici");
        Button save = new Button("enregistrer");
        modif.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
        modif.setTitle("Modifier votre Matiere");
        //Ajout a = new Ajout();

        //getToolbar().addCommandToLeftBar("back", null, e -> jou.show());
        TextField width = new TextField();
        width.setHint("width");
        TextField height = new TextField();
        height.setHint("height");
        
        TextField Name = new TextField();
        Name.setText(me.getName());
        Name.setHint("nom de Matiere ");

        
        TextField Coefficient = new TextField();
        Coefficient.setText(String.valueOf(me.Coefficient()));
        Coefficient.setHint("Coefficient");


        TextField Module = new TextField();
        Module.setText(me.getModule());
        Module.setHint("Module");

        

        modif.add(nom);
        modif.add(Coefficient);
        modif.add(Module);
     
        modif.add(save);
        modif.getToolbar().addCommandToLeftBar("back", null, e -> new ProfileForm(res).show());
        save.addActionListener((e) -> {
            CrudMatiere ser = new CrudMatiere();
            Matiere t = new Matiere();
            t.setId(me.getId());
            t.setName(Name.getText());
            t.setCoefficient(Coefficient.getText());
            t.setModule(Module.getText());
            
            System.out.println(t);
            ser.Modifier(t);

        });

        modif.show();

    }

}
