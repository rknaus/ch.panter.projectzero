package ch.netgeek.jmock.example;

public class Car {

    private Tire[] tires;
    
    public Car() {
        tires = new Tire[4];
    }
    
    public void drive(int kilometers) {
        for (Tire t : tires) {
            t.wearDown(kilometers * 0.1);
        }
    }
    
}

