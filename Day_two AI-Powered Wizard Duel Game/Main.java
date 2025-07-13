// File: Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to AI-Powered Wizard Duel Game!");

        System.out.print("Enter your wizard name: ");
        String name = sc.nextLine();

        System.out.println("Choose your class:");
        System.out.println("1. Fire Mage");
        System.out.println("2. Ice Mage");
        System.out.println("3. Dark Mage");
        int choice = sc.nextInt();

        Wizard player;
        switch (choice) {
            case 1 -> player = new FireMage(name);
            case 2 -> player = new IceMage(name);
            case 3 -> player = new DarkMage(name);
            default -> {
                System.out.println("Invalid choice. Defaulting to Fire Mage.");
                player = new FireMage(name);
            }
        }

        // Create AI opponent
        Wizard opponent = new DarkMage("swapnil");

        // Start the duel
        DuelEngine engine = new DuelEngine();
        engine.startDuel(player, opponent);
        sc.close();
    }
}
