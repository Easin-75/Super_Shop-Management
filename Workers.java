
package super_shop;

public class Workers extends Person{
protected float salary;
    protected String address;

    public Workers(float salary, String address, String name, String contact, int age, int id) {
        super(name, contact, age, id);
        this.salary = salary;
        this.address = address;
    }
    

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    void display() {
        super.display(); 
        System.out.println("Salary:"+salary + "Address: "+address);
   }
    
}
