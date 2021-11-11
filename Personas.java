package edu.co.icesi.consultastest;

public class Persona {

    private String id;
    private String natID;
    private String name;
    private String lastname;
    private int age;
    private double salary;
    private String gender;
    private boolean unemployed;

    public Persona(String id, String natID, String name, String lastname, int age, double salary, String gender, boolean unemployed) {
        this.id = id;
        this.natID = natID;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.unemployed = unemployed;
    }

    public Persona() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isUnemployed() {
        return unemployed;
    }

    public void setUnemployed(boolean unemployed) {
        this.unemployed = unemployed;
    }

    public String getNatID() {
        return natID;
    }

    public void setNatID(String natID) {
        this.natID = natID;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
