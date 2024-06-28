package com.crud_jdbc.entites;

public class Emp {
    private int id;
    private String name;
    private int salary;
    private String city;
    private boolean status;

//    Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }

    public boolean isStatus() {
        return status;
    }

//    Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


//    Constructor
    public Emp() {
    }

    public Emp(int id, String name, int salary, String city, boolean status) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.city = city;
        this.status = status;
    }


//    toString
    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                ", status=" + status +
                '}';
    }
}
