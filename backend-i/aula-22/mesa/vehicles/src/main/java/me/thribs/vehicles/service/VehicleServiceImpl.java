package me.thribs.vehicles.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import me.thribs.vehicles.model.Vehicle;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Override
    public List<Vehicle> getVehicles() {
        return Arrays.asList(new Vehicle("Impala", "black"), new Vehicle("Jetta", "white"), new Vehicle("Polo", "black"));
    }
    
}
