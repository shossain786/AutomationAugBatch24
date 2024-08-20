package org.saddy;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        System.out.println("Starting of the control flow statement");
        gradingSystem();
        System.out.println("End of the control flow statement");
    }

    static void gradingSystem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your marks: ");
        int number = scanner.nextInt();

        if (number > 80 && number <= 100)
            System.out.println("Your Grade is : A+");
        else if (number <80 && number >= 60)
            System.out.println("Your Grade is : A");
        else if (number >=50 && number < 60)
            System.out.println("Your Grade is : B");
        else if (number >= 40 && number < 50)
            System.out.println("Your Grade is : C");
        else if (number >= 30 && number < 40)
            System.out.println("Your Grade is : D");
        else if (number >=0 && number < 30)
            System.out.println("Your Grade is : F");
        else
            System.out.println("Something went wrong, please enter a valid number!");

    }
}
