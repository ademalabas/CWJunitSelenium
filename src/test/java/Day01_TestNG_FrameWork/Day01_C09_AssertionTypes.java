package Day01_TestNG_FrameWork;

import org.junit.Assert;
import org.junit.Test;

public class Day01_C09_AssertionTypes {

    @Test
    public void hardAssertion(){


        System.out.println("Assertion oncesi calisiyor");

        Assert.assertEquals(1,2);

        System.out.println("Assertion sonrasi calisiyor");


    }





}
