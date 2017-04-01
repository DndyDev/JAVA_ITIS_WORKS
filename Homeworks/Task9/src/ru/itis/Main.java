package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int matrix[][] = new int[3][3];


        Scanner scanner = new Scanner(System.in);

        for (int i = 0;i < matrix.length;i++){
            for (int j = 0;j < matrix.length;j++){
            matrix[i][j] = scanner.nextInt();
            }


        }
        for (int i = 0;i < matrix.length;i++){
            for (int j = 0;j < matrix.length;j++){
                System.out.print(matrix[i][j] + " ");
            }
                System.out.println();
        }
        System.out.println("-----");
        reversMatrix(matrix);

    }
    public static void reversMatrix(int matrix [][]){
        int k = 0;
        int d;
        for(int i = 0;i < matrix.length;i++){
            k = 0;
            for(int j = 0;j < matrix.length - 2;j++){
                d = matrix[i][j];
                matrix[i][j] = matrix[i][(matrix.length - 1)-k];
                matrix[i][(matrix.length - 1)-k] = d;
                k++;


            }
        }
        for (int i = 0;i < matrix.length;i++){
            for (int j = 0;j < matrix.length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
