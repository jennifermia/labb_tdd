import java.util.ArrayList;

public class EmployeeSystem {

    ArrayList<Employee> EmployeeList = new ArrayList<>();

    public void addEmployee(Employee tjomme) {
        EmployeeList.add(tjomme);
    }

    public ArrayList<Employee> getEmployeeList() {

        return EmployeeList;
    }


    public void removeEmployee(Employee tjomme) {
        EmployeeList.remove(tjomme);
    }

    public void increaseAllSalaries(double inc) {
        if (inc > 1 && inc < 2) {
            for (Employee e : EmployeeList) {
                double incSal = e.getSalary() * inc;
                e.setSalary(incSal);
            }

        }

    }

    public void increaseOneSalary() {
    }


}
