package com.company;
import sun.misc.Sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int enter = 0;
        do{
            System.out.println("\nВведите вариант:");
            enter = sc.nextInt();
            switch (enter){
                case 1:
                    Lab_1();
                    break;
                case 2:
                    Lab_2(args);
                    break;
                case 3:
                    Lab_3();
                    break;
                case 4:
                    Lab_4();
                    break;
                case 5:
                    Lab_5();
                    break;
            }
        }while (enter != 0);
    }

    public static void Lab_1(){
        //1. Вывести на экран сумму чисел массива с помощью циклов for, while, do while.
        System.out.println("\nВведите длинну массива чисел и его элементы:");
        int len = sc.nextInt();
        int []arr = new int[len];
        for (int i = 0; i < len; i++)
            arr[i] = sc.nextInt();

        int summFor = 0, summWhile = 0, summDoWhile = 0;

        for (int i = 0; i < arr.length; i++)
            summFor += arr[i];

        int i = 0;
        while (i < arr.length){
            summWhile += arr[i];
            i++;
        }

        i = 0;
        if(arr.length != 0)
            do {
                summDoWhile += arr[i];
                i++;
            }while (i < arr.length);

        System.out.println("Сумма для For: " + summFor);
        System.out.println("Сумма для While: " + summWhile);
        System.out.println("Сумма для DoWhile: " + summDoWhile);
    }

    public static void Lab_2(String[] args){
        //2. Вывести на экран аргументы командной строки в цикле for.
        for (int i = 0; i < args.length; i++)
            System.out.println("Аргумент " + i + ": " + args[i]);
    }

    public static void Lab_3(){
        //3. Вывести на экран первые 10 чисел гармонического ряда.
        for (int n = 1; n <= 10; n++)
            System.out.println("1/" + n + " = " + 1f/n);
    }

    public static void Lab_4(){
        //4. Сгенерировать массив целых чисел случайным образом, вывести его на экран, отсортировать его, и снова вывести на экран.
        System.out.println("\nВведите длинну массива чисел: ");
        int len = sc.nextInt();
        System.out.println("Введите максимальное значение чисел: ");
        int max = sc.nextInt();
        System.out.println("Случайный массив");
        int []arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = (int) (max * Math.random());
            System.out.println(i + ") " +arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("Он же после сортировки");
        for (int i = 0; i < len; i++) {
            System.out.println(i + ") " +arr[i]);
        }
    }

    public static void Lab_5(){
        //5. Создать метод, вычисляющую факториал числа с помощью цикла, проверить работу метода.
        System.out.println("\nВведите число, для которого нужен факториал");
        int enter = sc.nextInt();
        int a = 1;
        for(int i = 1; i <= enter; i++)
            a *= i;
        System.out.println(enter + "! = " + a);
    }
}
