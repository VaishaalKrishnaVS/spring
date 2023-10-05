package com.springl.bean;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private final VehicleService vehicleService;

    public Vehicle(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public VehicleService getVehicleService() {
        return vehicleService;
    }
}
