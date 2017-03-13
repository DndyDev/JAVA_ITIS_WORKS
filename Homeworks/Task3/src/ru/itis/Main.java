package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int array[] = new int[a];
	  for (int i = 0; i < array.length;i++){
	     array[i] = scanner.nextInt();
      }
        int min =array[1];
        for (int i=0;i < array.length;i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
