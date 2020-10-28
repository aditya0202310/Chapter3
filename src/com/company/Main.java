package com.company;

public class Main {

    public static void main(String[] args) {
        int myAge = 20;
        int Voteage = 18;
        System.out.println("Age : " + myAge);
        if (myAge >= Voteage) {
            System.out.println("You are of voting age");
        } else
            System.out.println("You're too young.");
    }
}