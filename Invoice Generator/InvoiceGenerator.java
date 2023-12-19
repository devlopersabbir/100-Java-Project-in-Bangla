import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Invoice {

    List<String> items = new ArrayList<>();
    List<Double> prices = new ArrayList<>();

    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.run();
    }
    public void run(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Invoice Generator");
        System.out.println("-----------------");

        while(true){
            System.out.print("Enter item name (or 'done' to finished): ");
            String itemName = scan.nextLine();
            if(itemName.equalsIgnoreCase("done")){
                break;
            }
            System.out.print("Enter item price: ");
            double price = scan.nextDouble();
            scan.nextLine();

            this.items.add(itemName);
            this.prices.add(price);
        }
        // calculate total
        double total = this.getPrice(this.prices);
        this.generate(total);
    }
    // get total price
    double getPrice(List<Double> prices){
        double total = 0;
        for(double price : prices){
            total += price;
        }
        return total;
    }
    // generate and display our invoice
    public void generate(double total){
        System.out.println("\nInvoice");
        System.out.println("---------");
        for(int i = 0; i < this.items.size(); i++) {
            System.out.printf("%s: $%.2f\n", items.get(i), prices.get(i));
        }
        System.out.println("---------------");
        System.out.printf("Total: $%.2f\n", total);
    }
}
