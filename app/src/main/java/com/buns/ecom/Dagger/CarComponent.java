package com.buns.ecom.Dagger;

import com.buns.ecom.Car.Car;
import com.buns.ecom.MainActivity;

import dagger.Component;

//Injector
@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);

}
