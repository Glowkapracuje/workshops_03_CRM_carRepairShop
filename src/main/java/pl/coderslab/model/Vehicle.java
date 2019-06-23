package pl.coderslab.model;

import javax.xml.crypto.Data;
import java.util.Date;

public class Vehicle {

    private int id;
    private String model;
    private String brand;
    private String registrationNum;
    private Date productionDate;
    private Date nextReviewDate;
    private Customer customer;

    public Vehicle(){}

    public Vehicle(String model, String brand, String registrationNum, Date productionDate, Date nextReviewDate, Customer customer){
        this.model = model;
        this.brand = brand;
        this.registrationNum = registrationNum;
        this.productionDate = productionDate;
        this.nextReviewDate = nextReviewDate;
        this.customer = customer;
    }

    //    GETTERS & SETTERS

    public int getId() {
        return id;
    }

    public Vehicle setId(int id) {
        this.id = id;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Vehicle setModel(String model) {
        this.model = model;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public Vehicle setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getRegistrationNum() {
        return registrationNum;
    }

    public Vehicle setRegistrationNum(String registrationNum) {
        this.registrationNum = registrationNum;
        return this;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public Vehicle setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
        return this;
    }

    public Date getNextReviewDate() {
        return nextReviewDate;
    }

    public Vehicle setNextReviewDate(Date nextReviewDate) {
        this.nextReviewDate = nextReviewDate;
        return this;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }
}
