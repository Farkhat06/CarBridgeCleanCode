package com.example.car.vehicle;

import com.example.car.engine.Engine;

// Abstraction
public abstract class Car {
    protected Engine engine;

    protected Car(Engine engine) {
        this.engine = engine;
    }

    public abstract void drive();
}
