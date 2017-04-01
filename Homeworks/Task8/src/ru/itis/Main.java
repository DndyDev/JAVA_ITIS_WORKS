package ru.itis;

public class Main {

    public static void main(String[] args) {
	char array[] = {'H','e','l','l','o'};
	char subarray[] = {'l','l','o'};


        System.out.println(SearchElementArray(array,subarray));

    }
    public static  int SearchElementArray(char[] array, char[]element) {
        int coincidenceElement = -1;
        char temp;
        while (coincidenceElement == -1) {

            for (int j = 0; j < element.length; j++) {
                if (array[j] == element[j]) {
                    coincidenceElement = j;

                }
            }
            temp = array[0];
            for (int k = 0; k < array.length - 1; k++) {
                array[k] = array[k + 1];
            }
            array[array.length - 1] = temp;

        }
        return (coincidenceElement);
    }
}
