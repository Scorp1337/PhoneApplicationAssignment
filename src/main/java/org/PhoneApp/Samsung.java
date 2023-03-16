package org.PhoneApp;

public abstract class Samsung extends Phone implements Device {
    public Samsung(int batteryLife, String color, String material, String IMEI) {
        super(batteryLife, color, material, IMEI);
    }
}
