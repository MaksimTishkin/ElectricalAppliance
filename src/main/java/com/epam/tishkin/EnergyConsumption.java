package com.epam.tishkin;

import com.epam.tishkin.devices.Device;

public class EnergyConsumption {
    private int totalEnergy;

    public void calculateTotalEnergy(Home home) {
        totalEnergy = home.getDevices()
                .stream()
                .filter(Device::getIsTurnedOn)
                .mapToInt(Device::getPower)
                .sum();
    }

    public int getTotalEnergy() {
        return totalEnergy;
    }
}
