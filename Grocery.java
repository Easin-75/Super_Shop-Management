
package super_shop;

public class Grocery extends Product{
     
     public String manufactured_by;

    public Grocery(String manufactured_by, String name, int id, double price,double quantity) {
        super(name, id, price,quantity);
      
        this.manufactured_by = manufactured_by;
    }

    @Override
    public void show_Product() {
        super.show_Product();
        System.out.println("Manufactured By :"+manufactured_by);
    }

   
     
   
}
