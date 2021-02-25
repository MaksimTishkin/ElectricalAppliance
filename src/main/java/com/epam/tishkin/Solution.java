package com.epam.tishkin;

public class Solution {
    public static void main(String[] args) {
        Home home = new Home();
        EnergyConsumption energyConsumption = new EnergyConsumption();
        HackerToolkit hackerToolkit = new HackerToolkit();

        home.getMixer().plugIn();
        home.getTelevision().plugIn();

        energyConsumption.calculateTotalEnergy(home);
        System.out.println(energyConsumption.getTotalEnergy());

        try {
            hackerToolkit.setNewDeviceEnergy(100, home.getTelevision());
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
        energyConsumption.calculateTotalEnergy(home);
        System.out.println(energyConsumption.getTotalEnergy());

        try {
            hackerToolkit.setNewTotalEnergyValue(energyConsumption, 5000);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
        System.out.println(energyConsumption.getTotalEnergy());
    }
}
