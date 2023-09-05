package com.company;

public class Main {

    public static void main(String[] args) {
        GenericHolder obj = new GenericHolder(123);
        obj.setObj("123 + 123 = 246");
        System.out.println(obj.getObj());

    }
}
