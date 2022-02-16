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

    public void increaseAllSalaries() {

    }
}
