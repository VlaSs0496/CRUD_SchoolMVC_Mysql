package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import model.ConsultationsPeople;
import model.Person;
import view.View_Person;

public class ControllerPerson implements ActionListener {
    
    private View_Person view;
    private Person person;
    private ConsultationsPeople model;

    public ControllerPerson(View_Person view, Person person, ConsultationsPeople model) {
        this.view = view;
        this.person = person;
        this.model = model;
        view.btnInsert.addActionListener(this);
    }
    public void star(){
        view.setTitle("CRUD mvc");
        view.setLocation(null);
        view.jID.setVisible(false);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == view.btnInsert){
            person.setKey(view.jKey.getText());
            person.setName(view.jName.getText());
            person.setDirection(view.jDirection.getText());
            person.setPhone(view.jPhone.getText());
            person.setEmail(view.jPhone.getText());
            person.setDateB(Date.valueOf(view.));
            
        }
    }
    
    
}
