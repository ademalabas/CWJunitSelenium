package Day01_SeleniumMaven;

import org.junit.*;

public class C02_JunitAnnotations {

    // 1. test
    // 2. test
    // 3. test
    // 4. test (gelistirme asamasinda bu yuzden rapora dahil olmasin)

    // Her testimizden once ve sonra calismasi gereken kod bloklarimiz (methodlarimiz) mevcut
    // Tum testlerin oncesinde ve sonrasinda calismasi gereken methodlarimiz mevcut.

    //    1. @Test -> Marks a method as a TEST CASE.
//        2. @Before : Runs before EACH @Test annotation.
//        3. @After : Runs after EACH @Test annotation.
//        4. @BeforeClass : Runs before each class only once.
//        5. @AfterClass : Runs after each class only once.
//        6. @Ignore : Skipping a test case.


    @Test
    public void test01() {
        System.out.println("1.test yapiliyor");
    }


    @Test
    public void test02() {
        System.out.println("2.test yapiliyor");
    }


    @Test
    public void test03() {
        System.out.println("3.test yapiliyor");
    }

    @Test
    @Ignore
    public void test04() {
        System.out.println("4.test yapiliyor");
    }



    @Before
    public void beforeEach() {
        System.out.println("Metod oncesi kod blogu calisti");
    }

    @After
    public void afterEach() {
        System.out.println("Metod sonrasi kod blogu calisti");
    }

    @BeforeClass
    public static void beforeAll() {
        System.out.println("Metodlarin oncesindekii kod blogu calisti");
    }

    @AfterClass
    public static void afterAll() {
        System.out.println("Metodlarin sonrasindaki kod blogu calisti");
    }


}
