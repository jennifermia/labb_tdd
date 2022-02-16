import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class EmployeeSystemTest {

    EmployeeSystem testObject;
    Employee tjomme1;
    Employee tjomme2;
    Employee tjomme3;


    @BeforeEach
    public void setUpInit() {
        testObject = new EmployeeSystem();
        tjomme1 = new Employee("Gösta", "Karlsson", 34, 34000);
        tjomme2 = new Employee("Göran", "Karlsson", 23, 23000);
        tjomme3 = new Employee("Pelle", "Karlsson", 50, 33000);
    }

    @Test
    public void test_AddEmployee() {
        tjomme1 = new Employee();
        testObject.addEmployee(tjomme1);
        ArrayList<Employee> employeeList = testObject.getEmployeeList();
        assertTrue(employeeList.size() != 0);
    }

    @Test
    public void test_RemoveEmployee() {
        tjomme1 = new Employee();
        testObject.addEmployee(tjomme1);
        testObject.removeEmployee(tjomme1);
        ArrayList<Employee> actualList = testObject.getEmployeeList();
        assertEquals(0, actualList.size());
        //assertTrue(actualList.size() == 0);
    }

    @Test
    public void test_SpecificEmployeeInList() {
        tjomme1 = new Employee("exempel", "exempel", 2, 22222);
        testObject.addEmployee(tjomme1);
        tjomme1 = new Employee("exempel", "exempel", 20, 22222);
        testObject.addEmployee(tjomme1);
        ArrayList<Employee> EmployeeList = testObject.getEmployeeList();
        EmployeeList.forEach(employee -> System.out.println(employee.getAge()));
        assertEquals("exempel", EmployeeList.get(0).getFirstName());
    }

    @Test
    public void test_Increase_OneSalary() {
        testObject.addEmployee(tjomme1);
        testObject.increaseSpecificSalary();
    }

    @Test
    public void test_IncreaseAllSalaries() {
        testObject.addEmployee(tjomme1);
        testObject.addEmployee(tjomme2);
        testObject.addEmployee(tjomme3);
        double expectedNewSal1 = tjomme3.getSalary()*1.2;
        double expectedNewSal2 = tjomme2.getSalary()*1.2;
        double expectedNewSal3 = tjomme1.getSalary()*1.2;
        testObject.increaseAllSalaries(1.2);
        ArrayList<Employee> actualList = testObject.getEmployeeList();
        assertEquals(expectedNewSal1, actualList.get(2).getSalary());
        assertEquals(expectedNewSal2, actualList.get(1).getSalary());
        assertEquals(expectedNewSal3, actualList.get(0).getSalary());
    }

    @Test
    public void test_IncreaseAllSalaries_NegArg(){

    }

    @Test
    public void test_IncreaseAllSalaries_TooHighArg(){

    }



}
