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
        ArrayList<Employee> actualList = testObject.getEmployeeList();
        assertEquals(0,actualList.size());
        //assertTrue(actualList.size() == 0);
    }

    @Test
    public void test_SpecificEmployeeInList(){
        tjomme = new Employee("exempel","exempel",2,22222);
        testObject.addEmployee(tjomme);
        tjomme = new Employee("exempel","exempel",20,22222);
        testObject.addEmployee(tjomme);
        ArrayList<Employee> EmployeeList = testObject.getEmployeeList();
        EmployeeList.forEach(employee -> System.out.println(employee.getAge()));
        assertEquals("exempel", EmployeeList.get(0).getFirstName());

    }


}
