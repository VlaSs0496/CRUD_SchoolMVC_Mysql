
package crud_mvc;

import controler.ControllerPerson;
import model.ConsultationsPeople;
import model.Person;
import view.View_Person;

public class crud_schoolMVC {


    public static void main(String[] args) {
        
        View_Person view = new View_Person();
        Person person = new Person();
        ConsultationsPeople model = new ConsultationsPeople();
        ControllerPerson controler = new ControllerPerson(view,person,model);
        
        controler.star();
        view.setVisible(true);
        
    }
    
}
