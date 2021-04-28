package com.example.week1comt.TestArithmetics;

public class TestMarks {
    public static void main(String[] args) {
     int marks=78;
     if (marks<50)
        {
            System.out.println("You have failed.");
        }
        else if (marks>50&&marks<59)
        {
            System.out.println("You score a 'D'.");
        }
        else if (marks>60&&marks<69)
        {
            System.out.println("You score a 'C'.");
        }
        else if (marks>70&&marks<79)
        {
            System.out.println("You score a 'B'.");
        }
        else
            System.out.println("You score an 'A'.");
    }

}
