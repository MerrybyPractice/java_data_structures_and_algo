package stacksandqueues.fifoanimalshelter;

import org.junit.Test;

import static org.junit.Assert.*;

public class FIFOAnimalShelterTest {

    //happy path
    @Test
    public void testEnqueue() {
        FIFOAnimalShelter<Object> test = new FIFOAnimalShelter<>();

        Cat salem = new Cat("Salem", "Black", "Bites");
        test.enqueue(salem);

        assertEquals(salem, test.shelter.front.value);

        Dog andrea = new Dog("Andrea", "Black", "Escaping");
        test.enqueue(andrea);

        assertEquals(salem, test.shelter.front.value);
        assertEquals(andrea, test.shelter.front.reference.value);
    }

    //expected failure
    @Test
    public void failEnqueue() {
        FIFOAnimalShelter<Object> fail = new FIFOAnimalShelter();

        Object notAStray = new Animal();

        assertFalse(fail.enqueue(notAStray));
    }

    @Test
    public void testDequeue() {
        FIFOAnimalShelter<Object> test = new FIFOAnimalShelter<>();

        Cat salem = new Cat("Salem", "Black", "Bites");
        test.enqueue(salem);

        Cat bynx = new Cat("Bynx", "Black", "Cuddles");
        test.enqueue(bynx);

        Dog andrea = new Dog("Andrea", "Black", "Escaping");
        test.enqueue(andrea);

        //need to refactor as I currently cannot search the way I would like to.
    }
}