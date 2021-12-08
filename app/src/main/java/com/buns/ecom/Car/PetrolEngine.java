package com.buns.ecom.Car;

import android.util.Log;

import com.buns.ecom.Dagger.Engine;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    @Inject
    public PetrolEngine() {
    }

    @Override
    public void start() {
        Log.d(TAG, "Petrol Engine Started: ");

    }

}
