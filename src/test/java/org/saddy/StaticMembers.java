package org.saddy;

public class StaticMembers {
    int z = 10; //non- static variable
    static int y= 20; //static variable
    public static void main(String[] args) { //static method
        System.out.println(y);
        StaticMembers obj = new StaticMembers();
        System.out.println(obj.z);

        printNum1();
        obj.displayNum();
    }

    public static void printNum1(){

    }
    public void displayNum(){  //non-static method
        System.out.println(y);
        System.out.println(z);
    }

    public void printNum(){
        displayNum();
    }
}
