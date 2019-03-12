package parser;
import org.testng.Assert;

public class UnitTestingStudentProfile {
    public static void main(String[] args) {
        //Retrieve map data and display output.
        try {
            XmlReader obj = new XmlReader();
            Assert.assertEquals(obj.convertIntToChar("85"), "B");
            System.out.println("Unit testing passed");
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
}
