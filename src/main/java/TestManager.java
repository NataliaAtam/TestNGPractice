import org.testng.Assert;
import org.testng.annotations.Test;

public class TestManager {




    public static void main(String[] args) {
        Manager m = new Manager("John", 25, 50000);

        //our test starts here
        // set the experience for John
        m.setExp(11);
        //compute actual bonus you are expecting
        double actualBonus = m.getSalary() * .15;


        //validation
        int experience = m.getExp();
        double bonus = m.getBonus(experience);
        if (Double.compare(actualBonus,bonus)==0) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        //constractor overloading
        Manager manager = new Manager("Natalia", 25);
        manager.getExp();
        System.out.println("This is experience" + manager.getExp());
        manager.setExp(12);
        System.out.println("This is experience" + manager.getExp());
        //manager.getExp();
        //manager.getSalary();



        }


        }












