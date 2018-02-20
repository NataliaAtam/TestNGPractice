import org.testng.annotations.*;

public class TestNew {
    @BeforeClass
    public void classSetup(){
        System.out.println("In class Setup");
    }

    @Test
    public void test1(){
        System.out.println("test");
    }

    @AfterClass
    public void classCleanup(){
        System.out.println("class clean up");
    }

    @AfterMethod
    public void cleanupMethod(){
        System.out.println("clean up method");
    }

    @BeforeMethod
    public void setupMethod(){
        System.out.println("setup method");
    }



}