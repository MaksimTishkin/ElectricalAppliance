package com.epam.tishkin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HomeDevicesTest {
    private Home home;
    private static EnergyConsumption energyConsumption;
    private static HackerToolkit hackerToolkit;
    static int hairdryerPower;
    static int mixerPower;
    static int televisionPower;

    @BeforeAll
    static void initAll() {
        energyConsumption = new EnergyConsumption();
        hackerToolkit = new HackerToolkit();
    }

    @BeforeEach
    public void setUp() {
        hairdryerPower = 800;
        mixerPower = 600;
        televisionPower = 2600;
        home = new Home(hairdryerPower, mixerPower, televisionPower);
    }

    @Test
    public void testCalculateTotalEnergy() {
        int expectedTotalEnergy = 0;
        energyConsumption.calculateTotalEnergy(home);
        int actualTotalEnergy = energyConsumption.getTotalEnergy();
        Assertions.assertEquals(expectedTotalEnergy, actualTotalEnergy);
        home.getTelevision().plugIn();
        home.getMixer().plugIn();
        expectedTotalEnergy = 3200;
        energyConsumption.calculateTotalEnergy(home);
        actualTotalEnergy = energyConsumption.getTotalEnergy();
        Assertions.assertEquals(expectedTotalEnergy, actualTotalEnergy);
    }

    @Test
    public void testSetNewTotalEnergyValue() throws NoSuchFieldException, IllegalAccessException {
        int newTotalEnergy = 5000;
        hackerToolkit.setNewTotalEnergyValue(energyConsumption, newTotalEnergy);
        int actualTotalEnergy = energyConsumption.getTotalEnergy();
        Assertions.assertEquals(newTotalEnergy, actualTotalEnergy);
    }

    @Test
    public void testSetNewDeviceEnergy() throws NoSuchFieldException, IllegalAccessException {
        int newEnergyValue = 3500;
        hackerToolkit.setNewDeviceEnergy(home.getTelevision(), newEnergyValue);
        int actualEnergyValue = home.getTelevision().getPower();
        Assertions.assertEquals(newEnergyValue, actualEnergyValue);
    }
}
