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
        view.btnClear.addActionListener(this);
        view.btnSearch.addActionListener(this);
        view.btnModify.addActionListener(this);
    }

    public void star() {
        view.setTitle("CRUD mvc");
        view.setLocationRelativeTo(null);
        view.jID.setVisible(false);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == view.btnInsert) {
            person.setKey(view.jKey.getText());
            person.setName(view.jName.getText());
            person.setaddress(view.jDirection.getText());
            person.setPhone(view.jPhone.getText());
            person.setEmail(view.jEmail.getText());
            person.setDateB(Date.valueOf(view.jDate.getText()));
            person.setGender(view.jGender.getSelectedItem().toString());

            if (model.insert(person)) {
                JOptionPane.showConfirmDialog(null, "Register ok");
                clearBoxes();
            } else {
                JOptionPane.showConfirmDialog(null, "Error");
                clearBoxes();
            }

        }
        if (ae.getSource() == view.btnClear) {
            clearBoxes();
        }
        if (ae.getSource() == view.btnSearch) {
            person.setKey(view.jSearch.getText());
            if (model.search(person)) {
                view.jID.setText(String.valueOf(person.getIdPerson()));
                view.jKey.setText(person.getKey());
                view.jName.setText(person.getName());
                view.jDirection.setText(person.getaddress());
                view.jPhone.setText(person.getPhone());
                view.jEmail.setText(person.getEmail());
                view.jDate.setText(String.valueOf(person.getDateB()));
                view.jGender.setSelectedItem(person.getGender());
            } else {
                JOptionPane.showConfirmDialog(null, "The person does not exist");
                clearBoxes();
            }
        }
        if (ae.getSource() == view.btnModify) {
            
            person.setIdPerson(Integer.parseInt(view.jID.getText()));
            person.setKey(view.jKey.getText());
            person.setName(view.jName.getText());
            person.setaddress(view.jDirection.getText());
            person.setPhone(view.jPhone.getText());
            person.setEmail(view.jEmail.getText());
            person.setDateB(Date.valueOf(view.jDate.getText()));
            person.setGender(view.jGender.getSelectedItem().toString());
            if (model.modify(person)){
                JOptionPane.showConfirmDialog(null, "modified record");
                clearBoxes();
            }else{
                JOptionPane.showConfirmDialog(null, "could not be modified");
                clearBoxes();
            }
        }
    }

    public void clearBoxes() {
        view.jID.setText(null);
        view.jSearch.setText(null);
        view.jKey.setText(null);
        view.jName.setText(null);
        view.jDirection.setText(null);
        view.jEmail.setText(null);
        view.jDate.setText(null);
        view.jPhone.setText(null);
    }

}
