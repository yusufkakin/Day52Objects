import java.util.ArrayList;

public class Product {

    double productCost;
    int productQuantity;
    String productName;

    public static void main(String[] args) {
        Product gas = new Product(4.0, 10, "Gallon of Gas");
        Product bagel = new Product(1.0, 2, "Bagel");
        ArrayList<Product> list = new ArrayList<Product>();
        list.add(gas);
        list.add(bagel);
        printProduct(list);
        totalCost(list);

    }

    public Product(double productCost, int productQuantity, String productName) {
        this.productCost = productCost;
        this.productQuantity = productQuantity;
        this.productName = productName;
    }

    public static void totalCost(ArrayList<Product> list) {
        double totalCost2 = 0;

        for (Product product : list) {
            double totalCost = (product.productCost) * (product.productQuantity);
            totalCost2 = totalCost2 + totalCost;
        }
        
        System.out.println("Total cost is " + totalCost2);
    }

    public static void printProduct(ArrayList<Product> list) {
        for(Product product : list) {
            System.out.println(product.productName + " costs " + product.productCost + " and " + product.productQuantity + " units were purchased." );
        }
    }
}

