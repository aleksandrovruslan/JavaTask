package ru.aleksandrov;

public class Car {

    protected String brandName;
    protected int weight;
    protected int power;

    public Car(String brandName, int weight, int power) {
        this.brandName = brandName;
        this.weight = weight;
        this.power = power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void upPower() {
        power++;
    }

    public void downPower() {
        if (power > 0) {
            power--;
        }
    }
    
}
