package org.example;

import java.text.MessageFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Happy Halloween\n");
        System.out.println("What is your name?");
        String playerName = sc.nextLine();
        System.out.println("What are you dressed up as?");
        String playerCostume = sc.nextLine();
        System.out.println("How many houses are you visiting tonight?");
        int housesToVisit = Integer.parseInt(sc.nextLine());
        Player player = new Player();
        player.setName(playerName);
        player.setCostume(playerCostume);
//        player.setPiecesOfCandy(0);
        for(int i = 1; i <= housesToVisit; i++){
            System.out.println("------------------------------\n");
            System.out.println(MessageFormat.format("House #{0}", i));
            player.TrickOrTreat();
            System.out.println(" ");
        }
    }
}