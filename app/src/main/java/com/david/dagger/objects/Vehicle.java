package com.david.dagger.objects;

import javax.inject.Inject;

/**
 * Created by David Crotty on 29/03/2015.
 */
public class Vehicle {
    private String _brand;
    private Motor _motor;

    //The inject annorationn should provide us with a motor as declared in the VeichleModule
    @Inject
    public Vehicle(String brand, Motor motor) {
        _brand = brand;
        _motor = motor;
    }

    public String getBrand() {
        return _brand;
    }
}
