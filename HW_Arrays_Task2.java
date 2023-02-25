package Consultation240223;

import java.util.Arrays;

public class HW_Arrays_Task2 {

    public static void main(String[] args) {
        getNumberPlusOne(123);
    }

    public static void getNumberPlusOne(int number){
        // Дано целое число, представленное его разрядами, которые записаны в массив.
        // Например, число 123 представляется массивом [1, 2, 3].
        // Получите массив, который преставляет сумму исходного числа и 1.
        String s = String.valueOf(number);
        char [] numberChar = s.toCharArray();

        for (int i = 0; i < numberChar.length; i++) {
            if (i == numberChar.length - 1) {
                number = number + 1;
                s = String.valueOf(number);
                numberChar = s.toCharArray();
                break;
            }
        }
        System.out.println(Arrays.toString(numberChar));
    }

}
