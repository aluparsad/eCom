package com.buns.ecom.Car;

import android.util.Log;

import com.buns.ecom.Dagger.Engine;


public class DieselEngine implements Engine {
    private static final String TAG = "Car";

    private int horsePower;


    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "Deisel Engine Started. HP :" + horsePower);
    }
}
