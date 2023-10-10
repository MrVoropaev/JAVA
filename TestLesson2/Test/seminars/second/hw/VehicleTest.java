package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {
    
    @Test
    public void testCarInstanceIsVehicleInstance() {
        Car car = new Car("Toyota", "Camry", 2020);
        Assertions.assertTrue(car instanceof Vehicle);
    }
    
    @Test
    public void testCarHasFourWheels() {
        Car car = new Car("Toyota", "Camry", 2020);
        Assertions.assertEquals(4, car.getNumWheels());
    }
    
    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2019);
        Assertions.assertEquals(2, motorcycle.getNumWheels());
    }
    
    @Test
    public void testCarSpeedDuringTestDrive() {
        Car car = new Car("Toyota", "Camry", 2020);
        car.testDrive();
        Assertions.assertEquals(60, car.getSpeed());
    }
    
    @Test
    public void testMotorcycleSpeedDuringTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2019);
        motorcycle.testDrive();
        Assertions.assertEquals(75, motorcycle.getSpeed());
    }
    
    @Test
    public void testCarSpeedAfterParking() {
        Car car = new Car("Toyota", "Camry", 2020);
        car.testDrive();
        car.park();
        Assertions.assertEquals(0, car.getSpeed());
    }
    
    @Test
    public void testMotorcycleSpeedAfterParking() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2019);
        motorcycle.testDrive();
        motorcycle.park();
        Assertions.assertEquals(0, motorcycle.getSpeed());
    }
}