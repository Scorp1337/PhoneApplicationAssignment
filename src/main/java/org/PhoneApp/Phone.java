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

    protected List<Call> callHistory = new ArrayList<>();



    public Phone(int batteryLife, String color, String material, String IMEI) {
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;
        this.IMEI = IMEI;
    }

    @Override
    public void addContact(Contact contact) {
        if (contacts.size() > 5) {
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
            return;
        }
        messages.add(new Message("This is a message from the future so please don't lose your mind"));
        messages.add(new Message("I would like to extend our congratulations for winning our grand " +
                "prize of 1.000.000 dollars. Enjoy it!"));

        System.out.println("Message sent to : " +contacts.get(0).firstName + " "+ messages.get(0) );


        messageList(messages.get(0));
        messageList(messages.get(1));
        batteryLifePerMessage();
        System.out.println("Battery remaining: " + myBatteryLifeRemaining);


    }

    @Override
    public void call(String phoneNumber) {

        callHistory.add(new Call("Call missed."));
        callHistory.add(new Call("You've received a new call. If you want to hear it press 1!"));

        int batteryDecrease = 0;
        System.out.println("Numbered called " + contacts.get(1));
        batteryLifePerCall();
        batteryDecrease = myBatteryLifeRemaining - batteryLifePerCall;
        System.out.println("Battery remaining: " + batteryDecrease + " hours.");


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
    public void saveCallHistory(Call call) {
        if (callHistory.size() > 5) {
            System.out.println("Call list is full!");
            return;
        }
        callHistory.add(call);

    }

    @Override
    public void messageList(Message message) {
        if (messages.size() > 5) {
            System.out.println("Message list is full!");
            return;
        }
        messages.add(message);
    }

    @Override
    public void viewHistory(String phoneNumber) {
        System.out.println("Call history: ");
        for (Call call : callHistory) {

            System.out.println(call);
        }

    }

    @Override
    public void listAMessageByContactNumber(String phoneNumber) {

        System.out.println("Listing a message by contact number: " + phoneNumber + " Message: " + messages.get(0));

    }

    public void getFirstContact() {
        System.out.println("First contact is: " + contacts.get(0).lastName + " " + contacts.get(0).firstName);
    }

    public void getLastContact() {
        System.out.println("Last contact is: " + contacts.get(contacts.size() - 1).lastName + " "
                + contacts.get(contacts.size() - 1).firstName);
    }

    public void getFirstMessage(String phoneNumber) {
        System.out.println("First message is: " + messages.get(0));

    }

    public void getSecondMessage(String phoneNumber) {

        System.out.println("Second message is: " + messages.get(1));

    }

}
