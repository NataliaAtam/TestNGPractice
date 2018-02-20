import org.testng.annotations.*;

public class TestReports {
    @BeforeSuite(alwaysRun= true)
    public void suiteSetup() {
        System.out.println("suite setup");
    }

    @AfterSuite(alwaysRun= true)
    public void suiteCleanup() {
        System.out.println("suite cleanup");
    }

    @BeforeClass(alwaysRun= true)
    public void classSetup() {
        System.out.println("in class report setup");
    }

    @AfterMethod(alwaysRun =true)
    public void cleanupMethod() {
        System.out.println("report cleanup method");
    }

    @BeforeMethod(alwaysRun= true)
    public void setupMethod() {
        System.out.println("report setup method");
    }




    // this will desaible the test and won't run it
//    @Test(enabled = false)
//    public void testReport2() {
//        System.out.println("report test2");
//
//
//        //this will enable the test run
//        @Test(enabled = true,dependsOnMethods = {"testReport2"})
//        public void testReport112() {
//            System.out.println("report test2");
//        }

//        @Test(priority = 0)
//        public void test1 () {
//            System.out.println("test1");
//        }
//
//        @Test(priority = 1)
//        public void test2 () {
//            System.out.println("test2");
//        }


    @Test(groups = {"smoke"})
    public void testReport2(){
        System.out.println("report test1");

    }



    @Test(groups ={"smoke"}, expectedExceptions = ArithmeticException.class)
     public void testException(){
         System.out.println("test Exception");
          int a=4;
          int b=0;
          int result = a/b;
         System.out.println(result);
     }



    @Test(groups = {"smoke"})
    public void testReport112(){
        System.out.println("report test2");

    }

    @Test(groups ={"broken"})
    public void testReport3(){
        System.out.println("report test3");

    }


    @Test(groups ={"stress"})
        public void testReport4(){
        System.out.println("report test4");

        }


        @AfterClass(alwaysRun= true)
        public void classCleanup () {
            System.out.println("report class cleanup");
        }
    }






