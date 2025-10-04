package com.example.car.engine;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Starting Electric Engine silently...");
    }
}
