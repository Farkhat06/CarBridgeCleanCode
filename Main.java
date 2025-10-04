package com.example.car;

import com.example.car.engine.*;
import com.example.car.vehicle.*;

public class Main {
    public static void main(String[] args) {
        Car sedan = new Sedan(new PetrolEngine());
        sedan.drive();

        Car suv = new SUV(new DieselEngine());
        suv.drive();

        Car electricSedan = new Sedan(new ElectricEngine());
        electricSedan.drive();
    }
}
