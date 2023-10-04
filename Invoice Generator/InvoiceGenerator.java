import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class InvoiceGenerator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        List<String> items = new ArrayList<String>();
        List<Double> prices = new ArrayList<Double>();

        System.out.println("Invoice Generator");
        System.out.println("-----------------");

        while(true){
            System.out.print("Enter item name (or 'done' to finished): ");
            String itemName = scan.nextLine();

            if(itemName.equalsIgnoreCase("done")){
                 break;
//                System.exit(0);
            }

            System.out.print("Enter item price: ");
            double itemPrice = scan.nextDouble();
            scan.nextLine();

            items.add(itemName);
            prices.add(itemPrice);
        }

        // calculate total cost
        double total = 0;
        for(double price : prices){
            total += price;
        }

        // Generate and display the invoice
        System.out.println("\nInvoice");
        System.out.println("-------");
        for(int i = 0; i < items.size(); i++){
            System.out.printf("%s: $%.2f\n", items.get(i), prices.get(i));
        }
        System.out.println("---------------");
        System.out.printf("Total: $%.2f\n", total);
    }
}