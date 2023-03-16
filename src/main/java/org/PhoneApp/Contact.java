package org.PhoneApp;

public  class Contact {
    public String phoneNumber;
    public String firstName;
    public String lastName;

    public Contact(String phoneNumber, String firstName, String lastName) {
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Contact[" +
                "pNumber=' " + phoneNumber + '\'' +
                ", fName='" + firstName + '\'' +
                ", lName='" + lastName + '\'' +
                ']';
    }

}
