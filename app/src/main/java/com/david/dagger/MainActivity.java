package com.david.dagger;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.david.dagger.appcontext.App;
import com.david.dagger.objects.Vehicle;

import javax.inject.Inject;


public class MainActivity extends Activity {

    //This tells us that we need dagger to provide an instacne for us, this needs to be public for dagger to use.
    @Inject
    public Vehicle _vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get our graph and ensure this activity uses it.
        //A common pattern is to put this code in a base activity.
        ((App) getApplication()).getObjectGraph().inject(this);

        Toast.makeText(this, _vehicle.getBrand(), Toast.LENGTH_SHORT).show();
        //butterknife is a seperate DI framework designnd arounnd injecting views specifically.
    }
}
