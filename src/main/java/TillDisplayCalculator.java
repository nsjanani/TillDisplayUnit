import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;
import java.util.Scanner;

public class TillDisplayCalculator {

    public static void main(String[] args) {
        System.out.println("Hello ! Welcome to the Till...");
        TillDisplayCalculator tillDisplayCalculator = new TillDisplayCalculator();
        tillDisplayCalculator.getInput();
    }

    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of items : ");
        int noOfItems = scanner.nextInt();
        System.out.println("Please enter the item name and price (in $) for all the items : ");
        for(int i=0; i<noOfItems; i++) {
            System.out.println("Item Name : ");
            String itemName = scanner.next();
            System.out.println("Price : ");
            BigDecimal price = scanner.nextBigDecimal();
        }
    }
}
