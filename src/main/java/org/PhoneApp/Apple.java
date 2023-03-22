package org.PhoneApp;

public abstract class Apple extends Phone implements Device {
    public Apple(int batteryLife, String color, String material, String IMEI) {
        super(batteryLife, color, material, IMEI);
    }
}
