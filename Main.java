
package super_shop;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Grocery Product: \n");
        Grocery onion = new Grocery("India","Onion",101,40.0,2.5);
   onion.show_Product();
   
   Grocery garlic = new Grocery("Bangladeshi","Garlic",102,100.0,3.5);
   garlic.show_Product();
   
        System.out.println("\nMeat: \n");
        Meat beef=new Meat("Australian","Beef",201,550,5);
        Meat chicken=new Meat("Poltri","Chicken",202,120,2); 
        beef.show_Product();
        chicken.show_Product();
   
        System.out.println("\nDrinks: \n");
        
        Drinks mount=  new Drinks("White","Mountain Dew",301, 40,1.25);
        Drinks pepsi=  new Drinks("Black","Pepsi",302, 60,2);
   
        mount.show_Product();
        pepsi.show_Product();
    }
}
