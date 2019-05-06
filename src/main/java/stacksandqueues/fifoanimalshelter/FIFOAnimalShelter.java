package stacksandqueues.fifoanimalshelter;

import stacksandqueues.NodeConstructor;
import stacksandqueues.Queue;

import javax.annotation.Nullable;

public class FIFOAnimalShelter<Animal> {
    Queue<Animal> shelter = new Queue<>();
    Queue<Animal> holdingShelter = new Queue<>();


    public boolean enqueue(Animal stray) {
        if (stray == Cat.class || stray == Dog.class) {
            shelter.enqueue(stray);
            return true;
        } else {
            return false;
        }
    }

    public Animal dequeue(@Nullable Animal pet) {
        Animal returnValue = null;
        if (pet.getClass() == shelter.front.value.getClass()) {
            returnValue = shelter.front.value;
            shelter.front = shelter.front.reference;
            return returnValue;
        } else if (pet.getClass() != shelter.front.value.getClass()) {
            returnValue = null;
            while (shelter.front != null) {
                if (shelter.front.value.getClass() == pet.getClass() && returnValue == null) {
                    returnValue = shelter.front.value;
                }

                holdingShelter.enqueue(shelter.front.value);
                shelter.dequeue();
            }
            if (returnValue == null) {
                System.out.println("I am so sorry, it looks like we don't have any strays of that type.");
                return returnValue;
            } else {
                return returnValue;
            }
        } else if (pet == null) {
            shelter.dequeue();
        } else if (pet.getClass() != Cat.class && pet.getClass() != Dog.class) {

            returnValue = null;
        }

        return returnValue;
    }
}
