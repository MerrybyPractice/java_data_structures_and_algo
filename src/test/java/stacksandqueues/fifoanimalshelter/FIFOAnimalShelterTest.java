package stacksandqueues.fifoanimalshelter;

import org.junit.Test;

import static org.junit.Assert.*;

public class FIFOAnimalShelterTest {

    @Test
    public void testEnqueue() {
        FIFOAnimalShelter test = new FIFOAnimalShelter<>();

        Cat salem = new Cat("Salem", "Black", "Bites");
        test.enqueue(salem);

        assertEquals(salem, test.shelter.front.value);

        Dog andrea = new Dog("Andrea", "Black", "Escaping");
        test.enqueue(andrea);

        assertEquals(salem, test.shelter.front.value);
        assertEquals(andrea, test.shelter.front.reference.value);
    }

}