package org.PhoneApp;

public interface Device {


    void addContact(Contact contact);

    void listExistingContacts();

    void sendMessage(String phoneNumber);

    void listAMessageByContactNumber(String phoneNumber);

    void call(String phoneNumber);

    void viewHistory(String phoneNumber);

    void addCall(Call call);

    void addMessage(Message message);


}
