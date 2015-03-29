package com.david.dagger.modules;

import com.david.dagger.MainActivity;
import com.david.dagger.objects.Motor;
import com.david.dagger.objects.Vehicle;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by David Crotty on 29/03/2015.
 */
//We need to declare what classes will be using this dependancy tree
@Module(injects = MainActivity.class,
        library = true)
public class VehicleModule {

    /*
    * This is a dagger 'Module' we are saying this module provides certainn classes with
    * the provides annotation. The singletonn annotation ensures the same Motor and Veichle
    * are used throughout the lifecycle of the application.
     */
    @Provides @Singleton
    public Motor provideMotor(){
        return new Motor(10);
    }

    @Provides @Singleton
    public Vehicle provideVehicle(){
        return new Vehicle("Audi" , new Motor(10));
    }
}
