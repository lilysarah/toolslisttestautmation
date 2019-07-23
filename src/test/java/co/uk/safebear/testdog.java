package co.uk.safebear;

import co.uk.safebear.kennels.Dog;
import org.junit.Test;

public class testdog {
    @Test
    public void testDog() {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.setColour("brown");
        dog2.setColour("white");

        dog1.setName("bruno");
        dog2.setName("fido");

        System.out.println("bruno's colour is " + dog1.getColour());
        System.out.println("fido's colour is " + dog2.getColour());
        System.out.print("fido");
        System.out.println(" here is a treat");
        dog2.treat();
        dog1.treat();

    }
}
//mut be inside curly brackets to be run
