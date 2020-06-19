/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyNET.GUI;
import com.codename1.ext.filechooser.FileChooser;
import com.codename1.ui.Button;
import com.codename1.ui.Dialog;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BoxLayout;
import StudyNET.Entities.cours;
import StudyNET.Entities.prof;
import StudyNET.Service.Servicecours;





public class AddcoursFrom extends Form{

    prof p = new prof();
    public AddcoursFrom(Form previous) {
        /*
        Le paramètre previous définit l'interface(Form) précédente.
        Quelque soit l'interface faisant appel à AddTask, on peut y revenir
        en utilisant le bouton back
        */
        super("Add a new cours",BoxLayout.y());
        
        TextField tflibelle = new TextField("","libelle");
        TextField tfnom= new TextField("", "nom");
        TextField tfimage= new TextField("", "Fichier");
        Button browseF = new Button("Browser File");
        TextField tfprof= new TextField("", "prof");
        Button btnValider = new Button("Add cours");
        
        
        browseF.addActionListener(e->{
            if(FileChooser.isAvailable())
            {
                FileChooser.setOpenFilesInPlace(true);
                FileChooser.showOpenDialog(false,"",e1->{
                     if (e1 == null || e1.getSource() == null) {  
                        return;
                    }
                      String file = (String)e1.getSource();
                    if (file == null) {
                       revalidate();
                    } else {
                       System.out.println("File path: " + file);
                        String nom = file.substring(file.lastIndexOf("/")+1,file.indexOf("."));
                        String ext = file.substring(file.lastIndexOf(".")+1);
                       tfimage.setText(nom+"."+ext);
                    }
                });
            }
        });
        
        
        btnValider.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                if ((((tflibelle.getText().length() == 0) || (tfnom.getText().length() == 0)) || (tfimage.getText().length() == 0))||(tfprof.getText().length()==0))
                    Dialog.show("Alert", "Please fill all the fields", null,"OK"); 
                else {
                    try {
                         p = Servicecours.getInstance().rechercherProf(tfprof.getText());
                        cours c = new cours(tflibelle.getText(), tfnom.getText(), tfimage.getText(), p);
                        if( Servicecours.getInstance().addcours(c))
                            Dialog.show("Success","Connection accepted",null,"OK");
                        else
                            Dialog.show("ERROR", "Server error", null,"OK");
                    } catch (NumberFormatException e) {
                        Dialog.show("ERROR", "Status must be a number", null,"OK");
                    }
                }
            }
        });
        
        this.add(tflibelle);
        this.add(tfnom);
        this.add(tfimage);
        this.add(browseF);
        this.add(btnValider);
   
       
        
        this.getToolbar().addMaterialCommandToLeftBar("", FontImage.MATERIAL_ARROW_BACK
                , e-> previous.showBack()); // Revenir vers l'interface précédente
                
    }

    
    
    
}

