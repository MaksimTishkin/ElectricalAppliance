package com.epam.tishkin.devices;;

public abstract class Device {
    final int power;
    final String name;
    boolean isTurnedOn;

    Device(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public void plugIn() {
        isTurnedOn = true;
    }

    public void unplug() {
        isTurnedOn = false;
    }

    public boolean getIsTurnedOn() {
        return isTurnedOn;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }
}
