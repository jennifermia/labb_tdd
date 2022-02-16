import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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


    }

}
