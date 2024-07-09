package com.ligabetplay.torneo;

public class Doctor extends Person{
    private int celnumber;

    public Doctor() {
        super();
    }

    public Doctor(int id, String name, String lastname, int age, int celnumber) {
        super(id, name, lastname, age);
        this.celnumber = celnumber;
    }

    public int getCelnumber() {
        return celnumber;
    }

    public void setCelnumber(int celnumber) {
        this.celnumber = celnumber;
    }
    

    
}
