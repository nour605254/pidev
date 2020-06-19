package StudyNET.GUI;

import com.codename1.components.SpanLabel;
import com.codename1.ui.Button;
import com.codename1.ui.ButtonGroup;
import com.codename1.ui.Component;
import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.RadioButton;
import com.codename1.ui.Tabs;
import com.codename1.ui.Toolbar;
import com.codename1.ui.animations.CommonTransitions;
import com.codename1.ui.events.SelectionListener;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.layouts.LayeredLayout;
import com.codename1.ui.util.Resources;


public class PForm extends Form {
    public PForm(Resources res) {
        super(new LayeredLayout());
        getTitleArea().removeAll();
        getTitleArea().setUIID("Container");
        
        setTransitionOutAnimator(CommonTransitions.createUncover(CommonTransitions.SLIDE_HORIZONTAL, true, 400));
        
        Tabs PTabs = new Tabs();
        PTabs.setUIID("Container");
        PTabs.getContentPane().setUIID("Container");
        PTabs.getTabsContainer().setUIID("Container");
        PTabs.hideTabs();
        
       // Image notes = res.getImage("notes.png");
        Image duke = res.getImage("duke.png");
        
        Label notesPlaceholder = new Label("","ProfilePic");
       // Label notesLabel = new Label(notes, "ProfilePic");
//        Component.setSameHeight(notesLabel, notesPlaceholder);
//        Component.setSameWidth(notesLabel, notesPlaceholder);
          Label bottomSpace = new Label();
        
        Container tab1 = BorderLayout.centerAbsolute(BoxLayout.encloseY(
                notesPlaceholder,
                new Label("", "Studynet"),
                new SpanLabel("",  "Studynet"),
                bottomSpace
        ));
        tab1.setUIID("Studynet");
        
        PTabs.addTab("", tab1);
        
        Label bottomSpaceTab2 = new Label();
        
        Container tab2 = BorderLayout.centerAbsolute(BoxLayout.encloseY(
                new Label(duke, "ProfilePic"),
                new Label("Codename One", "Studynet"),
                new SpanLabel("Welcome To",  "Studynet"),
                bottomSpaceTab2
        ));
        
        tab2.setUIID("Studynet");

        PTabs.addTab("", tab2);
        
        add(PTabs);
        
        ButtonGroup bg = new ButtonGroup();
        Image unselectedP = res.getImage("unselected-walkthru.png");
        Image selectedP = res.getImage("selected-walkthru.png");
        RadioButton[] rbs = new RadioButton[walkthruTabs.getTabCount()];
        FlowLayout flow = new FlowLayout(CENTER);
        flow.setValign(CENTER);
        Container radioContainer = new Container(flow);
        for(int iter = 0 ; iter < rbs.length ; iter++) {
            rbs[iter] = RadioButton.createToggle(unselectedP, bg);
            rbs[iter].setPressedIcon(selectedP);
            rbs[iter].setUIID("Label");
            radioContainer.add(rbs[iter]);
        }
                
        rbs[0].setSelected(true);
        walkthruTabs.addSelectionListener((i, ii) -> {
            if(!rbs[ii].isSelected()) {
                rbs[ii].setSelected(true);
            }
        });
        
        Button skip = new Button("Passer");
        skip.setUIID("SkipButton");
        skip.addActionListener(e -> {
            new ProfileForm(res).show();
        });
        
        Container southLayout = BoxLayout.encloseY(
                        radioContainer,
                        skip
                );
        add(BorderLayout.south(
                southLayout
        ));
        
        Component.setSameWidth(bottomSpace, bottomSpaceTab2, southLayout);
        Component.setSameHeight(bottomSpace, bottomSpaceTab2, southLayout);
        
        // visual effects in the first show
        addShowListener(e -> {
      //      notesPlaceholder.getParent().replace(notesPlaceholder, notesLabel, CommonTransitions.createFade(1500));
        });
    }    
}