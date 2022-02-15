import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class EmployeeTest {
    Employee testObject;

    @Test
    public void EmployeeConstructor(){
        new Employee();
        assertEquals(null, testObject.getFirstName());



    }

}

