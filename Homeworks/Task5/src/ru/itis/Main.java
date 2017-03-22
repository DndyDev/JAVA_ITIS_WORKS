package ru.itis;



public class Main {


    public static void main(String[] args) {

        int array [] = new int [5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = -4;
        array[4] = 5;
        /*array[5] = -6;
        array[6] = -7;*/

        reverse(array);

    }

    private static void reverse(int[] array) {
        int k = 0;
        int d;

        for (int i = 0; i < array.length - 2; i++) {
            d = array[i];
          array[i] = array[(array.length-1)-k];
          array[(array.length-1)-k] = d;
            k++;

        }
        for (int c = 0;c < array.length;c++  ){
            System.out.println(array[c]);
        }


    }
}
