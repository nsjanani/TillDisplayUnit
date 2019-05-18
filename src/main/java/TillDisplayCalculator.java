import java.math.BigDecimal;
import java.util.Scanner;

public class TillDisplayCalculator {

    public static void main(String[] args) {
        System.out.println("Hello ! Welcome to the Till...");
        TillDisplayCalculator tillDisplayCalculator = new TillDisplayCalculator();
        tillDisplayCalculator.getInput();
    }

    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of items (in number) : ");
        int noOfItems = scanner.nextInt();
        System.out.println("Please enter the item name and price (in $) for all the items : ");
        for(int i=0; i<noOfItems; i++) {
            System.out.println("Item Name : ");
            String itemName = scanner.next();
            System.out.println("Price (in $) : ");
            BigDecimal price = scanner.nextBigDecimal();
            if(isPriceValid(price))
                continue;
            else
                break;
        }
    }

    public boolean isPriceValid(BigDecimal price) {
       if(price.scale() == 2)
           return true;
       else {
           System.out.println("Sorry ! Exiting... Price input should be exactly 2 decimal places");
           return false;
       }
    }
}
