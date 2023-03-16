package org.PhoneApp;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone implements Device {
    protected final int batteryLife;
    protected String color;
    protected String material;

    protected String IMEI;

    protected int currentBatteryLife;

    protected int remainingBattery;

    protected String messageLength;


    protected int sentMessage;
    protected List<Contact> contacts = new ArrayList<>();
    protected List<Message> messages = new ArrayList<>();


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
        System.out.println();

        if (phoneNumber.equalsIgnoreCase("0744555666")) {
            System.out.println("Messages stored for first contact are: \n" + messages.get(0) + "\n" + messages.get(1));
        }
    }

    public void addMessage(Message message) {
        if (messages.size() > 2) {
            System.out.println("Message list is full!");
            return;


        }
        messages.add(message);
    }

    /**
     * need some hints here
     */
    @Override
    public void viewHistory() {


    }

    /**
     * need some hints here
     */
    @Override
    public void listAMessageByContactNumber(String phoneNumber) {


    }

    @Override
    public void call(String phoneNumber) {

        System.out.println("Numbered called " + contacts.get(1));
    }

    public void getFirstContact() {
        System.out.println("First contact is: " + contacts.get(0).lastName + " " + contacts.get(0).firstName);
    }
    public void getLastContact() {
        System.out.println("Last contact is: " + contacts.get(contacts.size() - 1).lastName + " " + contacts.get(contacts.size() - 1).firstName);
    }

    public void getFirstMessage(String phoneNumber) {
        if (phoneNumber.equalsIgnoreCase("0744555666")) {
            System.out.println("First message is: " + messages.get(0));
        }

    }

    public void getSecondMessage(String phoneNumber) {
        if (phoneNumber.equalsIgnoreCase("0744555666")) {
            System.out.println("Second message is: " + messages.get(1));
        }
    }
}
