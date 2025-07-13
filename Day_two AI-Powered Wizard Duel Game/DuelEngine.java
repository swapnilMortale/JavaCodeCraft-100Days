// File: DuelEngine.java
import java.util.Scanner;

public class DuelEngine {
    private final Scanner scanner = new Scanner(System.in);

    public void startDuel(Wizard player, Wizard opponent) {
        System.out.println("\nDuel Begins!");
        while (player.isAlive() && opponent.isAlive()) {
            System.out.println("\n--- Your Turn ---");
            player.status();
            opponent.status();
            System.out.println("1. Cast Spell\n2. Defend\n3. Special Ability");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> player.castSpell(opponent);
                case 2 -> player.defend();
                case 3 -> player.specialAbility(opponent);
                default -> System.out.println("Invalid move.");
            }

            if (!opponent.isAlive()) break;

            // Opponent's turn
            System.out.println("\n--- Opponent Turn ---");
            if (opponent.getMana() >= 25) {
                opponent.specialAbility(player);
            } else {
                opponent.castSpell(player);
            }
        }

        // Final result
        System.out.println("\n--- Duel Over ---");
        if (player.isAlive()) {
            System.out.println(player.getName() + " wins the duel! 🏆");
        } else {
            System.out.println(opponent.getName() + " wins the duel. 😞");
        }
    }
}
