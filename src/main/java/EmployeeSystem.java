import java.util.ArrayList;

public class EmployeeSystem {

    ArrayList<Employee> EmployeeList = new ArrayList<Employee>();

    public void addEmployee(Employee tjomme) {
    EmployeeList.add(tjomme);
    }

    public ArrayList<Employee> getEmployeeList() {

        return EmployeeList;
    }


}
