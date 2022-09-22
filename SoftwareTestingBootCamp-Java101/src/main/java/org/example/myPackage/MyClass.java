package org.example.myPackage;

public class MyClass {
    public void vergiHesapla(int motorHacmi) {


        if (motorHacmi < 1301) {
            System.out.println("Verginiz 300 TL'dir.");
        } else if (motorHacmi>1300 && motorHacmi<1601) {
            System.out.println("Verginiz 400 TL'dir.");
        }else{
                System.out.println("Verginiz 500 TL'dir");
            }

        }

    }
