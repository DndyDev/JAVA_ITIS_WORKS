package ru.itis;

/**
 * Created by Sergey on 27.03.2017.
 */
public class Bus extends Transport {
    public Bus(int speed, int size) {
        super(speed, size);
        if(size < 3){
            this.size = 3;
        }
    }

    public void TakeParkingPlace(){
        System.out.println("Bus take" + size + "parkingplace");
    }

}
