package com.david.dagger.appcontext;

import android.app.Application;

import com.david.dagger.modules.VehicleModule;

import dagger.ObjectGraph;

/**
 * Created by David Crotty on 29/03/2015.
 */
public class App extends Application{

    private ObjectGraph _objectGraph;

    @Override
    public void onCreate() {
        super.onCreate();
        //on app start, tell daggger which modules we will be usinng, the modules then provide
        //the building blocks for the dependency.
        _objectGraph = ObjectGraph.create(new VehicleModule());
    }

    //Provide a method for getting our object graph.
    public ObjectGraph getObjectGraph(){
        return _objectGraph;
    }
}
