package com.company;

public class Main {

    public static void main(String[] args) {
        GenericHolder genericHolder = new GenericHolder(123);
        genericHolder.setObj("123 + 123 = 246");
        System.out.println(genericHolder.getObj());
        System.out.println(genericHolder.getObj().getClass().getSimpleName());
        genericHolder.setObj(333);
        System.out.println(genericHolder.getObj());


    }
}
