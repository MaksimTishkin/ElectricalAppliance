package com.epam.tishkin;

import com.epam.tishkin.devices.Device;

import java.lang.reflect.Field;

public class HackerToolkit {

    public void setNewTotalEnergyValue(EnergyConsumption energyConsumption, int newValue) throws NoSuchFieldException, IllegalAccessException {
        Field totalEnergy = EnergyConsumption.class.getDeclaredField("totalEnergy");
        totalEnergy.setAccessible(true);
        totalEnergy.set(energyConsumption, newValue);
    }

    public void setNewDeviceEnergy(int value, Device device) throws NoSuchFieldException, IllegalAccessException {
        Field deviceField = Device.class.getDeclaredField("power");
        deviceField.setAccessible(true);
        deviceField.set(device, value);
    }
}
