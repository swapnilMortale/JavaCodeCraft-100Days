import java.util.Scanner;

public class CoffeeMachineIndia {

    static int water = 300;
    static int milk = 200;
    static int coffee = 100;
    static double money = 0.0;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            System.out.print("\nWhat would you like? (espresso/latte/cappuccino/report/off): ");
            String choice = scanner.nextLine().toLowerCase();

            switch (choice) {
                case "off":
                    System.out.println("Machine is shutting down. Thank you!");
                    isRunning = false;
                    break;

                case "report":
                    showReport();
                    break;

                case "espresso":
                case "latte":
                case "cappuccino":
                    serveCoffee(choice);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    static void showReport() {
        System.out.println("\n📊 Machine Report:");
        System.out.println("Water: " + water + "ml");
        System.out.println("Milk: " + milk + "ml");
        System.out.println("Coffee: " + coffee + "g");
        System.out.printf("Money: ₹%.2f\n", money);
    }

    static void serveCoffee(String coffeeType) {
        int requiredWater = 0, requiredMilk = 0, requiredCoffee = 0;
        double cost = 0;

        switch (coffeeType) {
            case "espresso":
                requiredWater = 50;
                requiredCoffee = 18;
                cost = 15.0;
                break;

            case "latte":
                requiredWater = 200;
                requiredMilk = 150;
                requiredCoffee = 24;
                cost = 25.0;
                break;

            case "cappuccino":
                requiredWater = 250;
                requiredMilk = 100;
                requiredCoffee = 24;
                cost = 30.0;
                break;
        }

        if (!checkResources(requiredWater, requiredMilk, requiredCoffee)) return;

        double paidAmount = acceptCoins();

        if (paidAmount < cost) {
            System.out.println("Sorry, not enough money. ₹" + paidAmount + " returned.");
        } else {
            double change = paidAmount - cost;
            if (change > 0) {
                System.out.printf("Here is your change: ₹%.2f\n", change);
            }

            money += cost;
            water -= requiredWater;
            milk -= requiredMilk;
            coffee -= requiredCoffee;

            System.out.println("✅ Here is your " + coffeeType + ". Enjoy! ☕");
        }
    }

    static boolean checkResources(int w, int m, int c) {
        if (water < w) {
            System.out.println("❌ Not enough water.");
            return false;
        }
        if (milk < m) {
            System.out.println("❌ Not enough milk.");
            return false;
        }
        if (coffee < c) {
            System.out.println("❌ Not enough coffee.");
            return false;
        }
        return true;
    }

    static double acceptCoins() {
        System.out.println("💰 Please insert coins (Indian currency):");

        System.out.print("₹10 coins: ");
        int ten = scanner.nextInt();

        System.out.print("₹5 coins: ");
        int five = scanner.nextInt();

        System.out.print("₹2 coins: ");
        int two = scanner.nextInt();

        System.out.print("₹1 coins: ");
        int one = scanner.nextInt();

        scanner.nextLine(); // Clear input buffer

        double total = 10 * ten + 5 * five + 2 * two + 1 * one;
        System.out.printf("You inserted ₹%.2f\n", total);
        return total;
    }
}
