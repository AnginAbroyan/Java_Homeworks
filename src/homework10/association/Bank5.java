package homework10.association;


//Aggregation
public class Bank5 {
    public int countEmployee;
    public String department;
    public String name;

    private Employee5 employee;

    public Bank5(Employee5 employee){
        this.employee = employee;
    }
}
