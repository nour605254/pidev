/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyNET.GUI;
import com.codename1.components.SpanLabel;
import com.codename1.io.FileSystemStorage;
import com.codename1.io.Log;
import com.codename1.ui.Component;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.util.ImageIO;
import StudyNET.Entities.cours;
import StudyNET.Service.Servicecours;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

/**
 *
 * @author nourhene
 */
public class Listecours extends Form {
    public ArrayList<cours> cours;
    
  public Listecours(Form previous) {
        setTitle("List cours");
        setLayout(BoxLayout.y());
        
        cours = Servicecours.getInstance().getAllcours();
       
        for (cours c : cours) {
            add(new SpanLabel("Libelle: "+c.getLibelle()));
             add(new SpanLabel("Nom Cours: "+c.getNom()));
      }

        getToolbar().addMaterialCommandToLeftBar("", FontImage.MATERIAL_ARROW_BACK, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                previous.refreshTheme();
                previous.showBack();
            }
        });
        getToolbar().addCommandToOverflowMenu("Screenshot", null, new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Screenshot");
                Image screenshot;
                screenshot = Image.createImage(getWidth(),getHeight());
                revalidate();
                setVisible(true);
               paintComponent(screenshot.getGraphics(), true);
                
                String imageFile = "file://C:/Users/nourhene/Documents/NetBeansProjects/CodenameOnepii/screenshot.png";
                System.out.println(imageFile);
                try (OutputStream os = FileSystemStorage.getInstance().openOutputStream(imageFile)) {
                    ImageIO.getImageIO().save(screenshot, os, ImageIO.FORMAT_PNG, 1);
                } catch (IOException err) {
                    Log.e(err);
                }
            }
        });
    }  
    
    
    
 }
