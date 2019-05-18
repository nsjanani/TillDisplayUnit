import java.math.BigDecimal;
import java.util.Scanner;

public class TillDisplayCalculator {

    public static void main(String[] args) {
        System.out.println("Hello ! Welcome to the Till...");
        TillDisplayCalculator tillDisplayCalculator = new TillDisplayCalculator();
        tillDisplayCalculator.getNValidateUserInput();
    }

    public void getNValidateUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of items (in number) : ");
        int noOfItems;
        while(!scanner.hasNextInt()){
            String itemNumberInput = scanner.next();
            System.out.println("Sorry, invalid input ! Please enter a valid input in number.");
        }
        noOfItems = scanner.nextInt();

        System.out.println("Please enter the item name and price (in $) for all the items : ");
        for(int i=0; i<noOfItems; i++) {

            System.out.println("Item Name : ");
            String itemName = scanner.next();


            BigDecimal price;
            do {
                System.out.println("Price (in $ with exactly two decimal places as 32.00) : ");
                while(!scanner.hasNextBigDecimal()) {
                    String priceInput = scanner.next();
                    System.out.println("Sorry, invalid input ! Please enter a valid input in number with 2 decimal places");
                }
                price = scanner.nextBigDecimal();
            } while(isPriceDecimalValid(price));


            while(!scanner.hasNextBigDecimal()) {
                String priceInput = scanner.next();
                System.out.println("Sorry, invalid input ! Please enter a valid input in number with exactly 2 decimal places");
            }
            price = scanner.nextBigDecimal();
            if(isPriceDecimalValid(price))
                continue;
            else
                break;
        }
    }

    public boolean isPriceDecimalValid(BigDecimal price) {
       if(price.scale() == 2)
           return true;
       else {
           System.out.println("Sorry, invalid input ! Please enter valid input with exactly 2 decimal places");
           return false;
       }
    }
}