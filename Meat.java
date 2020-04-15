
package super_shop;

public class Meat extends Product{
    public String type;

    public Meat(String type, String name, int id, double price, double quantity) {
        super(name, id, price, quantity);
        this.type = type;
    }

    @Override
    public void show_Product() {
        super.show_Product(); 
        System.out.println("Type: "+type);
    }
  
    
}
