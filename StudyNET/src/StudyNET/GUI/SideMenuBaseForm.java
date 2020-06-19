/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyNET.GUI;

import StudyNET.Utils.ConnectedUser;
import com.codename1.ui.Component;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Label;


public class SideMenuBaseForm {

    public void setupSideMenu(Form f) {
        f.getToolbar().addMaterialCommandToSideMenu("  Livre Selon Categorie", FontImage.MATERIAL_LOCAL_GROCERY_STORE, e -> new CategorieList().getF().show());
        f.getToolbar().addMaterialCommandToSideMenu("  Livre Selon Nom", FontImage.MATERIAL_LOCAL_GROCERY_STORE, e -> new LivreList().getF().show());
        f.getToolbar().addMaterialCommandToSideMenu("  Mes reservations ", FontImage.MATERIAL_LOCAL_GROCERY_STORE, e -> new mybooks().getF().show());
        f.getToolbar().addMaterialCommandToSideMenu("  Ajouter Quizz ", FontImage.MATERIAL_LOCAL_GROCERY_STORE, e -> new AddQuizzForm(f).show());
        f.getToolbar().addMaterialCommandToSideMenu("  Liste Quizz ", FontImage.MATERIAL_LOCAL_GROCERY_STORE, e -> new ListQuizzForm(f).show());
        f.getToolbar().addMaterialCommandToSideMenu("  List cours ", FontImage.MATERIAL_LOCAL_GROCERY_STORE, e -> new Listecours(f).show());
        f.getToolbar().addMaterialCommandToSideMenu("  Ajouter cours ", FontImage.MATERIAL_LOCAL_GROCERY_STORE, e -> new AddcoursFrom(f).show());
        f.getToolbar().addMaterialCommandToSideMenu("  Reponse eleve ", FontImage.MATERIAL_LOCAL_GROCERY_STORE, e -> new ReponseEleveForm(f).show());
    }

    

    public Component createLineSeparator() {
        Label separator = new Label("", "WhiteSeparator");
        separator.setShowEvenIfBlank(true);
        return separator;
    }

}
