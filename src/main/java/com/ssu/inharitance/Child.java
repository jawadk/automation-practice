package com.ssu.inharitance;

public class Child extends Parent {

    String name;
    String age;

    public Child() {
        System.out.println(Child.class + "Constructor");
    }

    public static void main(String[] args) {

        Child child = new Child();
        System.out.println("");

    }


}
