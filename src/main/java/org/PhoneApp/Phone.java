package org.PhoneApp;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone implements Device {
    protected final int batteryLife;
    protected String color;
    protected String material;

    protected String IMEI;

    protected int currentBatteryLife;

    protected int batteryLifeRemaining;

    protected int batteryLifePerMessage = 1;

    protected int batteryLifePerCall = 2;

    protected int myBatteryLifeRemaining;


    protected List<Contact> contacts = new ArrayList<>();
    protected List<Message> messages = new ArrayList<>();

    protected List<Call> calls = new ArrayList<>();

    public Phone(int batteryLife, String color, String material, String IMEI) {
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;
        this.IMEI = IMEI;
    }

    @Override
    public void addContact(Contact contact) {
        if (contacts.size() > 2) {
            System.out.println("Contact list is full!");
            return;
        }
        contacts.add(contact);

    }

    @Override
    public void listExistingContacts() {

        for (Contact contact : contacts) {
            System.out.println(contact);
        }

    }

    @Override
    public void sendMessage(String phoneNumber) {

        if (batteryLife < 0) {
            System.out.println("Phone is shutting down.");
        }

        System.out.println("This message was sent to " + phoneNumber + messages.get(0));
        System.out.println("This message was sent to " + phoneNumber + messages.get(1));



        if (phoneNumber.equalsIgnoreCase(phoneNumber)) {
            System.out.println("Messages stored for number :" + phoneNumber + " \n" + messages.get(0) +
                    "\n" + messages.get(1));
        }
        batteryLifePerMessage();
        System.out.println("Battery remaining: " + myBatteryLifeRemaining);

}

    @Override
    public void call(String phoneNumber) {
        int batteryDecrease = 0;
        System.out.println("Numbered called " + contacts.get(1));
        batteryLifePerCall();
        batteryDecrease = myBatteryLifeRemaining-batteryLifePerCall;
        System.out.println("Battery remaining: " +  batteryDecrease + " hours.");
    }


    public void batteryLifePerMessage() {

        if (this.currentBatteryLife < batteryLife) {
            batteryLifeRemaining = batteryLife - batteryLifePerMessage;

        }
        myBatteryLifeRemaining = batteryLifeRemaining;
    }

    public void batteryLifePerCall() {

        if (this.currentBatteryLife < batteryLife) {
            batteryLifeRemaining -= batteryLifePerCall;
        }

    }

    @Override
    public void addCall(Call call) {
        if (calls.size() > 5) {
            System.out.println("Call list is full!");
            return;
        }
        calls.add(call);
    }

    @Override
    public void addMessage(Message message) {
        if (messages.size() > 2) {
            System.out.println("Message list is full!");
            return;
        }
        messages.add(message);
    }


    @Override
    public void viewHistory(String phoneNumber) {

        if (phoneNumber.equalsIgnoreCase(phoneNumber)) {
            System.out.println("Call for: " + phoneNumber + "\n " + "Call 1" + calls.get(0) + "\n Call 2" + calls.get(1));
        }
    }

    @Override
    public void listAMessageByContactNumber(String phoneNumber) {
        if (phoneNumber.equalsIgnoreCase(phoneNumber)) {
            System.out.println("Listing a message by contact number: " + phoneNumber + " Message: " + messages.get(0));
        }

    }



    public void getFirstContact() {
        System.out.println("First contact is: " + contacts.get(0).lastName + " " + contacts.get(0).firstName);
    }

    public void getLastContact() {
        System.out.println("Last contact is: " + contacts.get(contacts.size() - 1).lastName + " "
                + contacts.get(contacts.size() - 1).firstName);
    }

    public void getFirstMessage(String phoneNumber) {
        if (phoneNumber.equalsIgnoreCase(phoneNumber)) {
            System.out.println("First message is: " + messages.get(0));
        }

    }

    public void getSecondMessage(String phoneNumber) {
        if (phoneNumber.equalsIgnoreCase(phoneNumber)) {
            System.out.println("Second message is: " + messages.get(1));
        }
    }
}
