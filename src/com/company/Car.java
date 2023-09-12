package com.company;

public class Car {
    public String marka;
    public int masa, dlugosc, szerokosc;

    static int id;

    public Car(String marka, int masa, int dlugosc, int szerokosc) {
        this.marka = marka;
        this.masa = masa;
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }
}
