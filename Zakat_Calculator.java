import java.util.Scanner;

public class Zakat_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // For Savings
        System.out.println("FOR SAVINGS");
        System.out.print("Do you have savings not used for more than a year? (Y/N): ");
        String decider = scanner.next();

        String No = "N";
        String Yes = "Y";

        double totalZakat = 0;
        double zakat = 0;

        if (decider.equals(No)) {
            System.out.println("No Zakat is applicable in this condition");
        }

        else if (decider.equals(Yes)) {
            System.out.println("How much money do you have? ");
            int money = scanner.nextInt();

            zakat = money * 0.025;

            totalZakat += zakat;

            System.out.println("Zakat (for savings) applicable on you is: " + Math.floor(zakat));
        }

        // For Gold
        System.out.println("FOR GOLD");

        System.out.print("Do you have gold not used for more than a year? (Y/N): ");
        decider = scanner.next();

        if (decider.equals(No)) {
            System.out.println("No Zakat is applicable in this condition");
        }

        else if (decider.equals(Yes)) {
            System.out.print("How much tola gold do you have? ");
            int tola = scanner.nextInt();

            int currentRateGold = 203900; // Current Price of Gold

            int gold = tola * currentRateGold;

            zakat = gold * 0.025;
            totalZakat += zakat;

            System.out.println("Total Zakat (for savings) applicable on you is: " + Math.floor(zakat));
        }

        // For Silver
        System.out.println("FOR SILVER");

        System.out.print("Do you have silver not used for more than a year? (Y/N): ");
        decider = scanner.next();

        if (decider.equals(No)) {
            System.out.println("No Zakat is applicable in this condition");
        }

        else if (decider.equals(Yes)) {
            System.out.print("How much tola silver do you have? ");
            int tola = scanner.nextInt();
            scanner.close();

            int currentRateSilver = 2380; // Current Price of Silver

            int silver = tola * currentRateSilver;

            zakat = silver * 0.025;
            totalZakat += zakat;

            System.out.println("Total Zakat (for savings) applicable on you is: " + Math.ceil(zakat));
        }
        System.out.println("Total payable zakat is: " + Math.ceil(totalZakat));
    }
}
