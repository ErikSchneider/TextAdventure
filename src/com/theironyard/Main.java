package com.theironyard;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Player player = new Player();

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome Traveler!");

        Player player = new Player();

        player.chooseName();
        player.chooseWeapon();
        player.chooseLocation();

        player.findItem("armor");
        player.findItem("potion");

        System.out.println(player.name);
    }

    public static String nextLine() {
        String line = scanner.nextLine();
        while (line.startsWith("/")) {       // Does line still start with "/" ? if it does loop will continue
            if (line.equals("/inv")) {
                for (String item : player.items) {
                    System.out.println(item);

                }
            }
            else {
                System.out.println("Command not found.");
            }

            line = scanner.nextLine();

        }
        return line;
    }


}


