package pl.coderslab.model;

import javax.xml.crypto.Data;
import java.util.Date;

public class Customer {

    private int id;
    private String name;
    private String surName;
    private Date birthDate;

    public Customer(){

    }

    public Customer(String name, String surName, Date birthDate){
        this.name = name;
        this.surName = surName;
        this.birthDate = birthDate;
    }

    //    GETTERS & SETTERS

    public int getId() {
        return id;
    }

    public Customer setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurName() {
        return surName;
    }

    public Customer setSurName(String surName) {
        this.surName = surName;
        return this;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Customer setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }
}
