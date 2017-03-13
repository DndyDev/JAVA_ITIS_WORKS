package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int a ;
         int s = 0;
         int p = 1;
               a = scanner.nextInt();
        int mas[]= new int[a];

         for (int i = 0; i < mas.length;i++ ){
             mas[i] = scanner.nextInt();

         }
         for (int i =0; i<mas.length;i++){
             if(mas[i]%2==0){
                 s += mas[i];
             }
             if(mas[i]%2==1){
                 p *= mas[i];
             }
         }
        System.out.println(p);
        System.out.println(s);

    }
}
