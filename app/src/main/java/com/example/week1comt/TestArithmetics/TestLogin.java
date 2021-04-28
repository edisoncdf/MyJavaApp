package com.example.week1comt.TestArithmetics;

import java.util.Scanner;

public class TestLogin {
    public static void main(String[] args) {
        boolean login = false;
        String password="mypass";
        System.out.println("enter password:");
        Scanner scanner= new Scanner(System.in);
        String input= scanner.nextLine();

        if(input.equals(password)) {
            login = true;
            System.out.println("login success=" + login);
        }
        else{
            System.out.println("login success="+ login);
        }

    }
}
