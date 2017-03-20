package com.tab.srednia_arytmetyczna;

public class Main {

    public static void main(String[] args) {

        int n = 7;
        int a = 5;
        int Wynik = 0;
        int i = 0; //ilość obiegow

        for(i=0; i<n; i++){

            Wynik = Wynik +a;
        }

        System.out.println("Średnia z sumy a to: "+Wynik/n);

    }
}
