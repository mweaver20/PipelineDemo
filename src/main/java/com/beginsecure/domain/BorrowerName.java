package com.beginsecure.domain;

public class BorrowerName {
    private String firstName;
    private String lastName;

    public BorrowerName() {
    }

    public String getFullName(){
        return firstName.toUpperCase() + " " + lastName.toUpperCase();
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}
