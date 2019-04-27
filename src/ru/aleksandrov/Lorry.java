package ru.aleksandrov;

public class Lorry extends Car {

    protected int loadCapacity;

    public Lorry(String brandName, int weight, int power, int loadCapacity) {
        super(brandName, weight, power);
        this.loadCapacity = loadCapacity;
    }

    public void setBrandName(String brandName) {
        super.brandName = brandName;
    }

    public void upLoadCapacity() {
        loadCapacity++;
    }

    public void downLoadCapacity() {
        if (loadCapacity > 0) {
            loadCapacity--;
        }
    }
    
}
