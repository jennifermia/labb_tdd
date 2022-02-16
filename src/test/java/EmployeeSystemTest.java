import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class EmployeeSystemTest {

    EmployeeSystem testObject;
    Employee tjomme;


    @BeforeEach
    public  void setUpInit(){
       testObject = new EmployeeSystem();
    }
    @Test
    public void test_AddEmployee(){
        tjomme = new Employee();
        testObject.addEmployee(tjomme);
        ArrayList<Employee> employeeList = testObject.getEmployeeList();
        assertTrue(employeeList.size() != 0);
    }

    @Test
    public void test_RemoveEmployee(){
        tjomme = new Employee();
        testObject.addEmployee(tjomme);
        testObject.removeEmployee(tjomme);
        ArrayList<Employee> employeeList = testObject.getEmployeeList();
        assertTrue(employeeList.size() == 0);
    }

}
