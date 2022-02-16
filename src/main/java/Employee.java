public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private static int counter;
    private int id;


    public Employee(){

    }

    public Employee(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        counter++;
        id = counter;
    }


    public String getFirstName() {
    return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public int getEmployeeID() {
        return id;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(){

    }
}
