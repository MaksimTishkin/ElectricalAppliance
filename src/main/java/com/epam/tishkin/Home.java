package com.epam.tishkin;

import com.epam.tishkin.devices.Device;
import com.epam.tishkin.devices.Hairdryer;
import com.epam.tishkin.devices.Mixer;
import com.epam.tishkin.devices.Television;

import java.util.Arrays;
import java.util.List;


public class Home {
    private final Hairdryer hairdryer;
    private final Mixer mixer;
    private final Television television;

    public Home(int hairdryerPower, int mixerPower, int televisionPower) {
        hairdryer = new Hairdryer(hairdryerPower);
        mixer = new Mixer(mixerPower);
        television = new Television(televisionPower);
    }

    public List<Device> getDevices() {
        return Arrays.asList(hairdryer, mixer, television);
    }

    public Device getHairdryer() {
        return hairdryer;
    }

    public Device getMixer() {
        return mixer;
    }

    public Device getTelevision() {
        return television;
    }
}
