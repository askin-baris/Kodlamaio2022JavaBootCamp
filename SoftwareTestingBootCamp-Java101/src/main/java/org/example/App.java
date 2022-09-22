package org.example;

import org.example.myPackage.MyClass;

import java.util.Locale;

public class App {
    public static void main(String[] args) {

        System.out.println("Hello World2!");
        String myName = "Özgür Kaya";
        //intellisense özelliği
        System.out.println(myName.toUpperCase());
        int dayOfMonth = 15;
        int dayOfMonth2 = 15;
        System.out.println(myName+dayOfMonth);
        System.out.println(dayOfMonth+dayOfMonth2);

        MyClass myClass = new MyClass();
        myClass.vergiHesapla(2000);
    }
}
