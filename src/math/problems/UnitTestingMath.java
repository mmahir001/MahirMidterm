package math.problems;
import org.testng.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
        try {
            Assert.assertEquals(Factorial.recursion(5), 120, "It Works ");
            Assert.assertEquals(Factorial.iteration(5), 120, "It Works ");
            System.out.println("Unit testing passed");
        }catch(Exception ex){
            ex.getMessage();
        }


    }
}
