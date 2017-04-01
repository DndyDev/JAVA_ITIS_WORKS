package ru.itis;


public class Bike extends Transport {
    public Bike(int speed, int size) {
        super(speed, size);
    }
    public int go(int movement){
        movement = movement + this.speed/2;
        return movement;
    }
    public void TakeParkingPlace(){
        System.out.println("Bake taken" + size + "parkingplace");
    }

}
