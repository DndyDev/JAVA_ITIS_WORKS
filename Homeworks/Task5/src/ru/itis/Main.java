package ru.itis;

import java.util.Scanner;

public class Main {
    public static boolean reverse(int array[]){
        int k = 0;
        int d = 0;
        for (int i = 1; i < array.length;i++ ){
             d = array[i+k];
            array[i+k] = array [array.length - k];
            array [array.length - k] = d;
             k += 1;
        }
        return array[] ;
    }

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int a = scanner.nextInt();
     int array [] = new int [a];
     for (int i =1 ;i < array.length; i++){
         array[i] = scanner.nextInt();
     }

    }

    }
}
