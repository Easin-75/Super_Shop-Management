
package super_shop;

public class Drinks extends Product{
    public String color;

    public Drinks(String color, String name, int id, double price,double quantity) {
        super(name, id, price,quantity);
        this.color = color;
     }

    @Override
    public void show_Product() {
        super.show_Product(); 
        System.out.println("Color: "+color);
    }
    
    
}
