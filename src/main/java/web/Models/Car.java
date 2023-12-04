package web.Models;

public class Car {
    private int number;
    private String model;
    private int maxSpeed;
    public Car(int number,String model,int maxSpeed){
        this.number = number;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
