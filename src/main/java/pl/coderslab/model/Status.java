package pl.coderslab.model;

public class Status {

    private int id;
    private int statusCode;

    public Status(){}

    public Status(int statusCode){
        this.statusCode = statusCode;
    }

    //    GETTERS & SETTERS

    public int getId() {
        return id;
    }

    public Status setId(int id) {
        this.id = id;
        return this;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public Status setStatusCode(int statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
