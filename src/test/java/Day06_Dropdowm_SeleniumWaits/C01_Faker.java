package Day06_Dropdowm_SeleniumWaits;

import com.github.javafaker.Faker;
import org.junit.Test;

public class C01_Faker {


    @Test
    public void  fakerExample() {
        Faker faker = new Faker();
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        System.out.println("faker.address().fullAddress() = " + faker.address().fullAddress());
    }



}
