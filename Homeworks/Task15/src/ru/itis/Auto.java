package ru.itis;


public class  Auto extends Transport {
    public Auto(int speed,int size){
        super(speed,size);
    }
    public int go(int movement){
        movement = movement + this.speed *2;
        return movement;

    }
    public void TakeParkingPlace(){
        System.out.println("Auto take"+ size + "parkingplace");
    }

}
