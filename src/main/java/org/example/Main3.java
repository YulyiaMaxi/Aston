package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        int[] numbers = new int[31];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
            List<Integer> divisibleBy3 = new ArrayList<Integer>();
            int j = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 3 == 0) {
                    divisibleBy3.add(numbers[i]);
                }
            }
            System.out.println(numbers[i]);
        }
    }
}

//Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3


