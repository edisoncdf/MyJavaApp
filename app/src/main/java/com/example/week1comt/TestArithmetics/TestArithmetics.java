package com.example.week1comt.TestArithmetics;

public class TestArithmetics {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a+b=" + (a + b));
        System.out.println(++d);
        System.out.println(d + 1);
        System.out.println(d += 1);
        int x = 30;
        if ((x > 10) && (x <= 20)) {
            System.out.println("this is if statement");
        } else {
            System.out.println("this is else statement");
        }
        char grade = 'D';
        if (grade == 'A') {
            System.out.println("u did great man");
        } else if (grade == 'B') {
            System.out.println("eh not bad");
        } else if (grade == 'C') {
            System.out.println("eh study lah");
        } else
            System.out.println("quit school bro");

    }
}
