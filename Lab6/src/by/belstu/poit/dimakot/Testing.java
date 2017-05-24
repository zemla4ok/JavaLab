package by.belstu.poit.dimakot;

import by.belstu.poit.dimakot.enums.Form;
import by.belstu.poit.dimakot.enums.Spec;
import by.belstu.poit.dimakot.student.Student;

import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by dima- on 05.05.2017.
 */
public class Testing {
    private Student student = new Student(new String("Dmitry"),
            2, Form.DAY, Spec.POIT, 7.8);

    @BeforeSuite
    public void testBeforeSuite() {
        System.out.println("@BeforeSuite");
    }
    @BeforeTest
    public void testBeforeTest() {
        System.out.println("@BeforeTest");
    }
    @BeforeGroups
    public void testBeforeGroups() {
        System.out.println("@BeforeGroups");
    }
    @BeforeClass
    public void testBeforeClass() {
        System.out.println("@BeforeClass");
    }
    @BeforeMethod
    public void testBeforeMethod() {
        System.out.println("@BeforeMethod");
    }

    @AfterSuite
    public void testASuite() {
        System.out.println("@AfterSuite");
    }
    @AfterTest
    public void testATest() {
        System.out.println("@AfterTest");
    }
    @AfterGroups
    public void testAGroups() {
        System.out.println("@AfterGroups");
    }
    @AfterClass
    public void testAClass() {
        System.out.println("@AfterClass");
    }
    @AfterMethod
    public void testAMethod() {
        System.out.println("@AfterMethod");
    }

    @Test(alwaysRun = true)
    public void testObject(){
        try{
            if(student == null)
                throw new NullPointerException();
            Assert.assertEquals(student.getName(), "Dmitry");
            Assert.assertEquals(student.getCourse() , 2);
            System.out.println("@Test");
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    //4
    @Test(enabled = false, timeOut = 100)
    public void ignoredTest(){
        System.out.println("Ignored");
    }

    @Test(enabled = true)
    public void ExTst(){
        Assert.fail();
    }


    //5
    @Test(groups = {"Group"})
    public void test1Group(){
        System.out.println("method 1 test in group");
    }
    @Test(groups = {"Group"})
    public void test2Group(){
        System.out.println("method 2 test in group");
    }
    @Test(dependsOnGroups = "Group")
    public void testGroup(){
        System.out.println("Group test");
    }
}
