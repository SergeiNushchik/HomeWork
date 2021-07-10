package HomeWork_6.test;

import HomeWork_6.dto.Animal;
import HomeWork_6.сomparator.AnimalAgeComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnimalAgeComparatorTest {


        @Test
        public void compare1 (){
            Animal o1 = new Animal("Nic", 10);
            Animal o2 = new Animal("Vik ", 11);
            AnimalAgeComparator animalAgeComparator = new AnimalAgeComparator();

            Assertions.assertEquals(-1,animalAgeComparator.compare(o1,o2));
        }
    @Test
    public void compare2 (){
        Animal o1 = new Animal("Nic", 11);
        Animal o2 = new Animal("Vik ", 10);
        AnimalAgeComparator animalAgeComparator = new AnimalAgeComparator();

        Assertions.assertEquals(1,animalAgeComparator.compare(o1,o2));
    }
    @Test
    public void compare3 (){
        Animal o1 = new Animal("Nic", 10);
        Animal o2 = new Animal("Vik ", 10);
        AnimalAgeComparator animalAgeComparator = new AnimalAgeComparator();

        Assertions.assertEquals(0,animalAgeComparator.compare(o1,o2));
    }
    }

