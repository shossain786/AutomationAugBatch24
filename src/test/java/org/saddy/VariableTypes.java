package org.saddy;

public class VariableTypes {
    static int num1 = 100; //Global/Class level variable
    static public void display(){
        int age2 = 20;           //local variable
        System.out.println("Age from display method: " + age2);
    }
    public static void main(String[] args) {

        int age1 = 30;       //local variable
        System.out.println("Value of Number1 is: "+ num1);
        display();
        System.out.println("Age: " + age1);

        byte num = 12;
        byte num1 =  -100;
        byte num2 = 127;
//        byte num3 = -129;
//        short num4 = -32769;
        long mobileNo = 9999999999L;
    }


}
