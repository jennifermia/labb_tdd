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
    public void test_Employee_NameAndSalary_Constructor(){

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

