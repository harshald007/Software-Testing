package com.actitime_automation.dec_29_2024;

import jdk.dynalink.beans.StaticClass;

class Parent{   //Creste Singletone class
    public int a=10;        //just to check same memory or not
    private Parent(){}  //constructor
    private static Parent obj;
    public static Parent getParentInstance(){
        if (obj == null){
            obj = new Parent();
        }
        return obj;
    }
}

public class SingletonEx1 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");

        //Parent obj1 = new Parent();                     //new
        Parent obj1 = Parent.getParentInstance();        //new
        System.out.println("obj1.a = " + obj1.a);       //10
        obj1.a = 50;
        System.out.println("obj1.a = " + obj1.a);       //50
        System.out.println("********************");


        //Parent obj2 = new Parent();                     //new
        Parent obj2 = Parent.getParentInstance();        //new
        System.out.println("obj1.a = " + obj2.a);       //10
        obj2.a = 70;
        System.out.println("obj1.a = " + obj2.a);       //50
        System.out.println("********************");


        //Parent obj3 = new Parent();                     //new
        Parent obj3 = Parent.getParentInstance();        //new
        System.out.println("obj1.a = " + obj3.a);       //10
        obj1.a = 90;
        System.out.println("obj1.a = " + obj3.a);       //50
        System.out.println("********************");
    }

}
