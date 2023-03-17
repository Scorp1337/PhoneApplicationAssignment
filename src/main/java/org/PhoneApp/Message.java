package org.PhoneApp;

public class Message {

    public String content;




    public Message(String content) {
        this.content = content;

        if( this.content.length() > 500){
            this.content = "Message is too long!";
        }else if (this.content.length() < 500){
            this.content = this.content.substring(0,content.length());
        }

    }



    @Override
    public String toString() {
        return "[" +
                content + '\'' +
                ']';
    }
}
