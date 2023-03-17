package org.PhoneApp;

public class Call {

    public String missedCall;

    public Call(String missedCall) {
        this.missedCall = missedCall;
    }

    @Override
    public String toString() {
        return "[" +
                missedCall + '\'' +
                ']';
    }
}
