
package super_shop;

public class Product {
    public String name;
   public int id;
   public double price;
   public double quantity;

    public Product(String name, int id, double price, double quantity) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    

    public void show_Product(){
        System.out.println("Name :"+name);
        System.out.println("Id :"+id);
        System.out.println("Price :"+price);
        System.out.println("Quantity: "+quantity);
    }
}
