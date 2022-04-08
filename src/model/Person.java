package model;

import java.sql.Date;

public class Person {
    
    private int idPerson;
    private String key;
    private String name;
    private String direction;
    private String phone;
    private String email;
    private Date dateB;
    private String gender;

    public Person(int idPerson, String key, String name, String direction, String phone, String email, Date dateB, String gender) {
        this.idPerson = idPerson;
        this.key = key;
        this.name = name;
        this.direction = direction;
        this.phone = phone;
        this.email = email;
        this.dateB = dateB;
        this.gender = gender;
    }

    public Person() {
        
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateB() {
        return dateB;
    }

    public void setDateB(Date dateB) {
        this.dateB = dateB;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    
    
}
