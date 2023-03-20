package org.PhoneApp;

/**
 * Phones is a Device. So our interface will be Device
 * Interface behaviour : createContact, listContacts, sendMessage, addMessage, listMessageForSpecificContact, call,
 * addCall, listCallHistory
 * Properties that can't be changed : batteryLife in hours.
 * Properties that can be changed : color, material
 * Instance specific properties : IMEI (serial number for phone)
 * Phone behavior:  message can have maximum 500 chars, sending message drains 1hour of batteryLife,
 * every call drains 2hours of batteryLife;
 *Tasks
 * implement the classes, abstract classes and interfaces according to the given information
 * create at least 2 phone brands with 2 models for each
 * create 2 new contacts
 * send a message to the first contact
 * make a call to the second contact
 */
public class App {
    public static void main(String[] args) {


        Phone phone = new SamsungGalaxy6();
        Phone phone1 = new SamsungS20();
        Phone phone2 = new Apple20();



        Contact contact1 = new Contact("0744555666", "James", "LeBron");
        Contact contact2 = new Contact("0745999111", "Curry", "Steph");
        phone.addContact(contact1);
        phone.addContact(contact2);


        phone.addContact(contact1);
        phone.addContact(contact2);

        phone.listExistingContacts();

        System.out.println("======================================================================================");
        phone.getFirstContact();
        phone.getLastContact();

        System.out.println("======================================================================================");
        phone.sendMessage("0744555666");

        System.out.println("======================================================================================");
        phone.getFirstMessage("0744555666");
        phone.getSecondMessage("0744555666");

        System.out.println("======================================================================================");
        phone.listAMessageByContactNumber("0745999111");
        System.out.println("======================================================================================");
        phone.call("0745999111");

        System.out.println("======================================================================================");
        phone.viewHistory("0745999111");







    }

}
