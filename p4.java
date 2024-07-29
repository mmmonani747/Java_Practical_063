import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] dailyExpenses = new double[30]; 
        for (int i = 0; i < dailyExpenses.length; i++) {
            System.out.print("Enter expense for day " + (i + 1) + ": ");
            dailyExpenses[i] = scanner.nextDouble();
        }
        double totalExpenses = 0;
        for (double expense : dailyExpenses) {
            totalExpenses += expense;
        }
        System.out.println("Total expenses for the month: $" + totalExpenses);
    }
}