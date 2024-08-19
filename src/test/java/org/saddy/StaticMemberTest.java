package org.saddy;

public class StaticMemberTest {
    public static void main(String[] args) {
        System.out.println(StaticMembers2.name);
        StaticMembers2 obj = new StaticMembers2();
        obj.displayAddress();

        System.out.println(obj.name);
        StaticMembers2.run();
    }

    public void printName(){
        System.out.println(StaticMembers2.name);

    }
}
 