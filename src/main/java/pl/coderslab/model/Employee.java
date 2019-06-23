package pl.coderslab.model;

public class Employee {

    private int id;
    private String name;
    private String surName;
    private String address;
    private int mobile;
    private String note;
    private double salary;

    public Employee(){}

    public Employee(String name, String surName, String address, int mobile, String note, double salary){
        this.name = name;
        this.surName = surName;
        this.address = address;
        this.mobile = mobile;
        this.note = note;
        this.salary = salary;
    }

    //    GETTERS & SETTERS

    public int getId() {
        return id;
    }

    public Employee setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurName() {
        return surName;
    }

    public Employee setSurName(String surName) {
        this.surName = surName;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Employee setAddress(String address) {
        this.address = address;
        return this;
    }

    public int getMobile() {
        return mobile;
    }

    public Employee setMobile(int mobile) {
        this.mobile = mobile;
        return this;
    }

    public String getNote() {
        return note;
    }

    public Employee setNote(String note) {
        this.note = note;
        return this;
    }

    public double getSalary() {
        return salary;
    }

    public Employee setSalary(double salary) {
        this.salary = salary;
        return this;
    }
}
