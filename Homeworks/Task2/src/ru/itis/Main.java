package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int a;
	int k = 0;
	a = scanner.nextInt();
	int array[] = new int [a];
	for (int i = 0; i < array.length; i++){
        array[i] =scanner.nextInt();
	    if(i%10==6|| i==6  ){
	        k += 1;

        }

    }
        System.out.println(k);

    }
}
