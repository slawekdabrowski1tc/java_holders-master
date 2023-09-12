package com.company;

public class Compare<anyType extends Comparable>  {
    public void compareValues(int x, int y) {
        if (x > y ) System.out.println(x + " > " + y);
        else if (x < y ) System.out.println(x + " < " + y);
        else if (x == y ) System.out.println(x + " == " + y);
    }

    public void compareValues(float x, float y) {
        if (x > y ) System.out.println(x + " > " + y);
        else if (x < y ) System.out.println(x + " < " + y);
        else if (x == y ) System.out.println(x + " == " + y);
    }

    public void compareValues(double x, double y) {
        if (x > y ) System.out.println(x + " > " + y);
        else if (x < y ) System.out.println(x + " < " + y);
        else if (x == y ) System.out.println(x + " == " + y);
    }

    public void compareValues(String x, String y) {
//        System.out.println("test");
//        System.out.println(x);
//        System.out.println(y);
//        if (x.compareTo(y) == 1) System.out.println(x + " > " + y);
//        else if (x.compareTo(y) == 0) System.out.println(x + " < " + y);
//        else System.out.println(x + " == " + y);

        if (x.compareTo(y) > 0) {
            System.out.println(x + " > " + y);
        } else if(x.compareTo(y) < 0) {
            System.out.println(x + " < " + y);
        }
    }

    public void compareValues(byte x, byte y) {
        if (x > y ) System.out.println(x + " > " + y);
        else if (x < y ) System.out.println(x + " < " + y);
        else if (x == y ) System.out.println(x + " == " + y);
    }

    public void compareValuesG(anyType x, anyType y) {
        if (x.compareTo(y) > 0) {
            System.out.println(x + " > " + y);
        } else if(x.compareTo(y) < 0) {
            System.out.println(x + " < " + y);
        } else System.out.println(x + " == " + y);
    }
}
