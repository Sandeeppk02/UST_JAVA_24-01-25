class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product Name: " + name + ", Price: Rs:" + price);
    }
}

class Electronics extends Product {
    int warrantyPeriod;

    Electronics(String name, double price, int warrantyPeriod) {
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    void warrantyDetails() {
        System.out.println("Warranty Period: " + warrantyPeriod + " years");
    }
}

public class InheritanceExample3 {
    public static void main(String[] args) {
        Electronics laptop = new Electronics("Laptop", 800, 2);
        laptop.display();
        laptop.warrantyDetails();
    }
}
