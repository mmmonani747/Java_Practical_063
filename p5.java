import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize arrays for product codes and prices
        int[] productCodes = new int[5];
        double[] prices = new double[5];

        // Prompt the user to input product codes and prices
        for (int i = 0; i < productCodes.length; i++) {
            System.out.print("Enter product code for item " + (i + 1) + ": ");
            productCodes[i] = scanner.nextInt();
            System.out.print("Enter price for item " + (i + 1) + ": ");
            prices[i] = scanner.nextDouble();
        }

        // Prepare the bill
        double totalBill = 0.0;
        for (int i = 0; i < productCodes.length; i++) {
            double taxRate = getTaxRate(productCodes[i]);
            double taxAmount = prices[i] * (taxRate / 100);
            double totalAmount = prices[i] + taxAmount;
            System.out.println(
                    "Item " + (i + 1) + ": Price = " + prices[i] + ", Tax = " + taxAmount + ", Total = " + totalAmount);
            totalBill += totalAmount;
        }

        System.out.println("Total Bill: " + totalBill);
    }

    /**
     * Returns the tax rate based on the product code.
     *
     * @param productCode the product code
     * @return the tax rate
     */
    public static double getTaxRate(int productCode) {
        double taxRate = 0.0;
        switch (productCode) {
            case 1:
                taxRate = 8.0;
                break;
            case 2:
                taxRate = 12.0;
                break;
            case 3:
                taxRate = 5.0;
                break;
            case 4:
                taxRate = 7.5;
                break;
            default:
                taxRate = 3.0;
                break;
        }
        return taxRate;
    }
}