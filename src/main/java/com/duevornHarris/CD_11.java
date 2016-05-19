package com.duevornHarris;

import java.util.Scanner;

/**
 * Created by duevornharris on 5/19/16.
 */
public class CD_11 {
    Scanner sc = new Scanner(System.in);


    public void greetUser() {

        System.out.println("Who are you?");

        String userName = sc.nextLine();

        if (userName.equals("Bob")) {
            System.out.println("Hello Bob!");
        } else if (userName.equals("Alice")) {
            System.out.println("Hello Alice");
        } else {
            System.out.println("We aren't cool enough to be cordial!");
        }
    }

    public static void main(String[] args) {
        CD_11 newObject = new CD_11();
        newObject.greetUser();
    }
}


