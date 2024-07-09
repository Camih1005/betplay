package com.ligabetplay.torneo;

public class Coach extends Person {
    private int expyears;
    private String speciality;
    public Coach() {
        super();
    }
    public Coach(int id, String name, String lastname, int age, int expyears, String speciality) {
        super(id, name, lastname, age);
        this.expyears = expyears;
        this.speciality = speciality;
    }
    public int getExpyears() {
        return expyears;
    }
    public void setExpyears(int expyears) {
        this.expyears = expyears;
    }
    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    
    
}
