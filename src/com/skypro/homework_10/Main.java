package com.skypro.homework_10;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

    }
    public static void task2() {
        System.out.println("Задача 2");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        String fullNameUpp = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpp);


    }
    public static void task3() {
        System.out.println("Задача 3");

        String fullName = "Иванов Семён Семёнович";
        String fullNameTrue = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullNameTrue);

    }
}
