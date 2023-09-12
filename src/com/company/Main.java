package com.company;

import java.nio.charset.CodingErrorAction;

public class Main {

    public static void main(String[] args) {
        GenericHolder genericHolder = new GenericHolder(123);
        System.out.println("================generic=holder================");
        genericHolder.setObj("123 + 123 = 246");
        System.out.println(genericHolder.getObj());
        System.out.println(genericHolder.getObj().getClass().getSimpleName());
        genericHolder.setObj(333);
        System.out.println(genericHolder.getObj());
        System.out.println(genericHolder.getObj().getClass().getSimpleName());

        System.out.println("=================object=holder=================");
        ObjectHolder objectHolder = new ObjectHolder(123);
        System.out.println(objectHolder.getObj());
        System.out.println(objectHolder.getObj().getClass().getSimpleName());
        objectHolder.setObj("TEST");
        System.out.println(objectHolder.getObj());
        System.out.println(objectHolder.getObj().getClass().getSimpleName());

        System.out.println("================generic=holder================");
        GenericHolder<Integer> genericHolder1 = new GenericHolder(30);
        System.out.println(genericHolder1.getObj());
        System.out.println((int)genericHolder1.getObj() + 1);

        System.out.println("===================compare====================");
        Compare compare = new Compare();
        compare.compareValues("00001", "54");

        System.out.println("===================generic====================");
        compare.compareValuesG(123, 123);

    }
}
