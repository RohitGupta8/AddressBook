package com.bl.addressbook;

class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String number;
    private String email;

    Contact(String firstName, String lastName, String address, String city, String state, String zipCode, String number, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.number = number;
        this.email = email;

    }

    @Override
    public String toString() {
        return "\n----------------------------------\n" +
                "FirstName  =  " + firstName +
                "\nLastName   =  " + lastName +
                "\nAddress    =  " + address +
                "\nCity       =  " + city +
                "\nState      =  " + state +
                "\nZipCode    =  " + zipCode +
                "\nNumber     =  " + number +
                "\nEmail      =  " + email +
                "\n-----------------------------------\n"
                ;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

