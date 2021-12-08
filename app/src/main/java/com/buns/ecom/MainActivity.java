package com.buns.ecom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.buns.ecom.Car.Car;
import com.buns.ecom.Dagger.CarComponent;
import com.buns.ecom.Dagger.DaggerCarComponent;
import com.buns.ecom.Dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent
                .builder()
                .dieselEngineModule(new DieselEngineModule((100)))
                .build();
        component.inject(this);
        car.drive();
    }
}