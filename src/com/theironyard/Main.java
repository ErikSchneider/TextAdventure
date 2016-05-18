package com.theironyard;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome Traveler!");

        Player player = new Player();

        player.chooseName();

        player.chooseWeapon();

        player.chooseLocation();

        System.out.println("Type in a number...");
        String num = scanner.nextLine();
        int numInt = Integer.valueOf(num);

        if (numInt < 0 ) {
            System.out.println("That's a negative numbner!");
        }
        else {
            System.out.println("That's a positive number!");
        }
    }
}
