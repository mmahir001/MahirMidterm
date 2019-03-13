package design;
import org.testng.Assert;
public class UnitTestingEmployeeInfo {

    public static void main(String[] args) {
        EmployeeInfo emp1 = new EmployeeInfo("Marty",3012);
        try {
            Assert.assertEquals("Marty", emp1.getEmployeeName());
            System.out.println("PASSED!");

        } catch (Exception ex) {
            ex.printStackTrace();
            Assert.assertEquals(3012, emp1.getEmployeeID());
        }
    }
}