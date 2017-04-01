package ru.itis;


public class Main2 {
      public static void main(String[] args) {
          char array[] = {'H','e','l','l','o'};
          char subarray[] = {'l','o'};
          System.out.println(SearchElementArray(array,subarray));
      }
    private static int SearchElementArray(char[] array, char[] element){
        int coincidenceElement = -1;

        for (int i = 0;i < array.length;i++){
            if (array[i] == element[0]) {
              for ( int j = i;j < element.length;j++){
                if (array[j] == element[j - i]) {
                    coincidenceElement = i;
                }
              }
            }

        }
        return (coincidenceElement);
    }

}
