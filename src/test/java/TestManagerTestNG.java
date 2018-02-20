import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



    public class TestManagerTestNG{

//        //set
//        @BeforeClass
//        public void setUp() {
//        System.out.println("Open page and log in");
//        }
//
//        //test
//        @Test
//        public void testGetBonus(){
//         System.out.println("Test case");
//
//        }
//         //clean
//        @AfterClass
//        public void tearDown(){
//        System.out.println("In teardown");
//
//        }
//
//        int equal = Double.compare(actualBonus, bonus);
//        Assert.assertEquals(equal, 0, "Validation failed for getBonus method");
//
//        //test
//        @Test
//        public void testGetBonus1() {
//            System.out.println("In test 1");
//        }
//
//    }
//
//

        Manager m;
        //setup
        @BeforeClass
        private void setUp(){
            System.out.println("In  setup method");
            m = new Manager("John", 50, 7000);
        }
        //test
        @Test
        public void testGetBonus(){
            System.out.println("In test");
            //set the experience for John
            m.setExp(11);
            //compute actual bonus you are expecting
            double actualBonus = m.getSalary() * .15;
            //validation
            int experience = m.getExp();
            double bonus = m.getBonus(experience);

            int equal = Double.compare(actualBonus, bonus);
            Assert.assertEquals(equal, 0, "Validation failed for the test get bonus method");
        }
        //test
        @Test
        public void testGetBonus1(){
            System.out.println("In test 1");

        }

        @Test(expectedExceptions = ArithmeticException.class)
        public void testException(){
            System.out.println("test Exception");
            int a=4;
            int b=0;
            int result = a/b;
            System.out.println(4/0);
        }







        //cleanup
        @AfterClass
        public void tearDown(){

            System.out.println("In teardown");
        }
    }