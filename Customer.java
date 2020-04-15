
package super_shop;

public class Customer extends Person{
    private String choices;

    public Customer(String choices, String name, String contact, int age, int id) {
        super(name, contact, age, id);
        this.choices = choices;
    }
    

    public String getChoices() {
        return choices;
    }

    public void setChoices(String choices) {
        this.choices = choices;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Choices: "+choices);
    }
    
}
