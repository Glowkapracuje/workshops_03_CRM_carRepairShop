package pl.coderslab.model;

import java.util.Date;

public class Order {

    private int id;
    private Date getCarDate;
    private Date plannedRepairDate;
    private Date startRepairDate;

    private String whatToRepair;
    private String howToRepair;

    private double costRepair;
    private double costParts;
    private double costSalary;
    private double spentHours;

    private Employee employee;
    private Vehicle vehicle;
    private Status status;

    public Order(){}

    public Order(Date getCarDate, Date plannedRepairDate, Date startRepairDate, String whatToRepair, String howToRepair, double costRepair, double costParts, double costSalary, double spentHours, Employee employee, Vehicle vehicle, Status status){
        this.getCarDate = getCarDate;
        this.plannedRepairDate = plannedRepairDate;
        this.startRepairDate = startRepairDate;
        this.whatToRepair = whatToRepair;
        this.howToRepair = howToRepair;
        this.costRepair = costRepair;
        this.costParts = costParts;
        this.costSalary = costSalary;
        this.spentHours = spentHours;
        this.employee = employee;
        this.vehicle = vehicle;
        this.status = status;
    }

    //    GETTERS & SETTERS

    public int getId() {
        return id;
    }

    public Order setId(int id) {
        this.id = id;
        return this;
    }

    public Date getGetCarDate() {
        return getCarDate;
    }

    public Order setGetCarDate(Date getCarDate) {
        this.getCarDate = getCarDate;
        return this;
    }

    public Date getPlannedRepairDate() {
        return plannedRepairDate;
    }

    public Order setPlannedRepairDate(Date plannedRepairDate) {
        this.plannedRepairDate = plannedRepairDate;
        return this;
    }

    public Date getStartRepairDate() {
        return startRepairDate;
    }

    public Order setStartRepairDate(Date startRepairDate) {
        this.startRepairDate = startRepairDate;
        return this;
    }

    public String getWhatToRepair() {
        return whatToRepair;
    }

    public Order setWhatToRepair(String whatToRepair) {
        this.whatToRepair = whatToRepair;
        return this;
    }

    public String getHowToRepair() {
        return howToRepair;
    }

    public Order setHowToRepair(String howToRepair) {
        this.howToRepair = howToRepair;
        return this;
    }

    public double getCostRepair() {
        return costRepair;
    }

    public Order setCostRepair(double costRepair) {
        this.costRepair = costRepair;
        return this;
    }

    public double getCostParts() {
        return costParts;
    }

    public Order setCostParts(double costParts) {
        this.costParts = costParts;
        return this;
    }

    public double getCostSalary() {
        return costSalary;
    }

    public Order setCostSalary(double costSalary) {
        this.costSalary = costSalary;
        return this;
    }

    public double getSpentHours() {
        return spentHours;
    }

    public Order setSpentHours(double spentHours) {
        this.spentHours = spentHours;
        return this;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Order setEmployee(Employee employee) {
        this.employee = employee;
        return this;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Order setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        return this;
    }

    public Status getStatus() {
        return status;
    }

    public Order setStatus(Status status) {
        this.status = status;
        return this;
    }
}
