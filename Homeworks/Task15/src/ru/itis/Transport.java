package ru.itis;


public abstract class Transport {
    protected int speed;
    protected int size;

    public int getSize() {
        return size;
    }

    public int getSpeed() {
        return speed;
    }



    public Transport(int speed,int size) {
        if(speed >= 40){
        this.speed = speed;
        }else{
            this.speed = 40;
        }
        if (size >= 1){
            this.size = size;
        }else {
            this.size = 1;
        }
    }

    public int  go(int movement){
        movement = movement + this.speed;
        return movement;
    }
    public abstract void TakeParkingPlace();
}
