package org.example;

public class User {
    private String name;
    private String lastName;

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "My name is " + this.name + "\n" + "My lastname is " + this.lastName;
    }
}
