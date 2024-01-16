package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите имя:");
        String string = s.nextLine();
            if (string !="Вячеслав") {
                System.out.println("Нет такого имени");
            } else {
                System.out.println("Привет, Вячеслав");
            }
        }
    }

// Составить алгоритм: если введенное имя совпадает с Вячеслав,
// то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"