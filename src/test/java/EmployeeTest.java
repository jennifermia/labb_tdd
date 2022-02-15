import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    Employee testObject;



    @Test
    public void test_Employee_GetFirstName(){
        testObject = new Employee();
       String actual = testObject.getFirstName();
       assertNull(actual);
    }

    @Test public void test_Employee_SetFirstName(){
        testObject = new Employee();
        String actual = testObject.setFirstName();

    }



}

