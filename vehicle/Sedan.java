package com.example.car.vehicle;

import com.example.car.engine.Engine;

public class Sedan extends Car {
    public Sedan(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        System.out.print("Sedan is driving with ");
        engine.start();
    }
}
