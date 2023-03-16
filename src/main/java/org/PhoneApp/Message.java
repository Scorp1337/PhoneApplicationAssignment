package org.PhoneApp;

public class Message {

    public String content;




    public Message(String content) {
        this.content = content;

        if( this.content.length() > 500){
            this.content = "Message is too long!";

        }

    }



    @Override
    public String toString() {
        return "[" +
                content + '\'' +
                ']';
    }
}
