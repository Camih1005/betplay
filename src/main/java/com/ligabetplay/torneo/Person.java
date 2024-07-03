package com.ligabetplay.torneo;

public class Person {
    private int id;
    private String name;
    private String lastname;
    private int age;

    
    public Person() {
    }


    public Person(int id, String name, String lastname, int age) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public int getId() {
        return id;
    }
    public String getLastname() {
        return lastname;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
