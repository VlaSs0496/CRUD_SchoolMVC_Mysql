package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.sql.Date;
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
        view.setLocationRelativeTo(null);
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
            person.setDateB(Date.valueOf(view.jDate.getText()));
            person.setGender(view.jGender.getSelectedItem().toString());
            
            if(model.insert(person)){
                JOptionPane.showConfirmDialog(null, "Register ok");
            }else{
                JOptionPane.showConfirmDialog(null, "Error");
            }
                
        }
    }
    
    
}
