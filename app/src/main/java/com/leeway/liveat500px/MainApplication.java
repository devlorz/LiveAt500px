package com.leeway.liveat500px;

import android.app.Application;

import com.leeway.liveat500px.manager.Contextor;


/**
 * Created by Lee Lorz on 1/10/2017.
 */

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // initialize here
        Contextor.getInstance().init(getApplicationContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
