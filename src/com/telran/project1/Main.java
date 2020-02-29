package com.telran.project1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //pswm
        System.out.println("Hello!");
        int a = 10;
        System.out.println(a); //sout
        System.out.println(a + " This is number " + a);
        System.out.println(a + "10");
        System.out.println(a + a);

        float f = 3.15f;
        long b = 21283764645467l;

        boolean boo = 2 < 3;
        System.out.println(boo); // 2<3 shows "true" - else 2>3 shows "false"

        int height = 175;

        if (height > 200) {
            System.out.println("Go to Circus");
        } else if (height < 150) {
            System.out.println("Go to school");
        } else {
            System.out.println("Go to work");
        }

        Scanner scanner = new Scanner(System.in); // instead of "ageArmy(27)" for asking the age of the person
        int age;
        System.out.println("Please enter your age");
        age = scanner.nextInt();

        scanner.close();

        ageArmy(age);

        powerXY(3, 3);
        fan(3);
        //ageArmy(27);


    }

    private static void powerXY(int x, int y) { // возвести число в степень
        int res = 1;
        for (int i = 1; i <= y; i++) {
            res = res * x;
        }
        System.out.println("Power is " + res);
    }

    private static void fan(int mode) {
        switch (mode) {
            case 0:
                System.out.println("fan is off");
                break;
            case 1:
                System.out.println("fan is min");
                break;
            case 2:
                System.out.println("fan is high");
                break;
            default:
                System.out.println("Wrong mode");
        }
    }

    private static void ageArmy(int age) {
        if (age >= 18 && age <= 27) {
            System.out.println("You are lucky boy!");
        } else {
            System.out.println("Sorry, you go to army!");

        }


    }


}
