import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    Employee testObject;

    @Test
    public void test_Employee_NoArg_Constructor(){
        testObject = new Employee();
    }

    @Test
    public void test_Employee_Name_Constructor(){
        String firstName = "Jennifer";
        String lastName = "Toivanen";
        testObject = new Employee(firstName, lastName);
    }

    @Test
    public void test_Employee_NameAndAge_Constructor(){
        String firstName = "Jennifer";
        String lastName = "Toivanen";
        int age = 26;
        testObject = new Employee(firstName, lastName, age);
        assertEquals("Jennifer", testObject.getFirstName());
        assertEquals("Toivanen", testObject.getLastName());
        assertEquals(26, testObject.getAge());
    }

    @Test
    public void test_Employee_NameAgeSalary_Constructor(){
        testObject = new Employee("Jenny", "Mitteli", 28, 30000);
        assertEquals("Jennifer", testObject.getFirstName());
        assertEquals("Toivanen", testObject.getLastName());
        assertEquals(26, testObject.getAge());
        assertEquals(30000, testObject.getSalary());
    }

    @Test
    public void test_Employee_GetFirstName(){
        testObject = new Employee();
       String actual = testObject.getFirstName();
       assertNull(actual);
    }

    @Test
    public void test_Employee_SetFirstName(){
        testObject = new Employee();
        testObject.setFirstName("Jennifer");
        String actual = testObject.getFirstName();
        String expected = "Jennifer";
        assertEquals(expected, actual);
    }

    @Test
    public void test_Employee_SetAndGetLastName(){
        testObject = new Employee();
        testObject.setLastName("Toivanen");
        String actual = testObject.getLastName();
        String expected = "Toivanen";
        assertEquals(expected, actual);

    }






}

