package employee;

public class Employee {
    private String fullName;
    private double salary;
    public Employee() { }
    public Employee(String fullName, double salary)
    {
        this.fullName = fullName;
        this.salary = salary;
    }
    public void setFullName (String fullName)
    {
        this.fullName = fullName;
    }
    public String getFullName ()
    {
        return this.fullName;
    }
    public void setSalary (double salary)
    {
        this.salary = salary;
    }

    public double getSalary ()
    {
        return this.salary;
    }
}
