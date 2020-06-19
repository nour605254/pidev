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
import import StudyNET.Service.ServiceMatiere;

public class AjoutMatiere {
String path = "" ;
    public AjoutMatiere(Resources res) {
         
        SpanLabel lb;
        Form ajou = new Form("Remplissez ici");
        Button save = new Button("enregistrer");
        ajou.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
        ajou.setTitle("Ajout de matiere");
        //Ajout a = new Ajout();

        //getToolbar().addCommandToLeftBar("back", null, e -> jou.show());
        TextField width = new TextField();
        width.setHint("width");
        TextField height = new TextField();
        height.setHint("height");
        
        

        TextField Name = new TextField();
        Name.setHint("nom ");

       
        
        TextField Coefficient = new TextField();
        Coefficient .setHint("Coefficient");

       

        TextField Module = new TextField();
        Module.setHint("Module");



        ajou.add(Name);
       
        ajou.add(Coefficient);
        ajou.add(Module);
        
      
        ajou.add(save);
        ajou.getToolbar().addCommandToLeftBar("back", null, e -> new ProfileForm(res).show());
        save.addActionListener((e) -> {
            ServiceMatiere ser = new ServiceMatiere();
            Matiere t = new Matiere();
            t.setName(Name.getText());
           
            t.setCoefficient(Integer.parseInt(Coefficient.getText())) ;
          
            t.setModule(Module.getText());
          
            System.out.println(t);
            ser.ajoutMatiere(t);

        });

        ajou.show();

    }

}
