import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    Employee testObject;



    @Test
    public void test_Employee_Constructor(){
        testObject = new Employee("Jenny", "Mitteli", 28, 30000);
        assertEquals("Jenny", testObject.getFirstName());
        assertEquals("Mitteli", testObject.getLastName());
        assertEquals(28, testObject.getAge());
        assertEquals(30000, testObject.getSalary());
    }

    @Test
    public void test_Id_Employee_Constructor(){
        testObject = new Employee("exempel","exempel",20,20000);
        int actual = testObject.getEmployeeID();
        assertEquals(1, actual);
    }


    @Test
    public void test_Employee_GetFirstName(){
        testObject = new Employee();
       String actual = testObject.getFirstName();
       assertNull(actual);
    }

    @Test
    public void compareAge(){
        int diff =18;
        int actual = testObject.compareAge(17);


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

