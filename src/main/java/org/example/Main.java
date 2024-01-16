package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        int a = s.nextInt();
        if (a > 7) {
            System.out.println("Привет");
        }
        else{
                System.out.println(" ");
            }
        }
    }

//Составить алгоритм: если введенное число больше 7, то вывести “Привет”
//Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3