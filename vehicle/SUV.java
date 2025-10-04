package com.example.car.vehicle;

import com.example.car.engine.Engine;

public class SUV extends Car {
    public SUV(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        System.out.print("SUV is driving with ");
        engine.start();
    }
}
