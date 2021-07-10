package HomeWork_6.test;

import HomeWork_6.dto.Animal;
import HomeWork_6.сomparator.AnimalNameComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnimalNameComparatorTest {


        @Test
        public void compare1 (){
            Animal o1 = new Animal("Имя2 ", 10);
            Animal o2 = new Animal("Имя1", 11);
            AnimalNameComparator animalNameComparator = new AnimalNameComparator();

            Assertions.assertEquals(1,animalNameComparator.compare(o1,o2));
        }
    @Test
    public void compare2 (){
        Animal o1 = new Animal("Имя 1", 11);
        Animal o2 = new Animal("Имя 2", 10);
        AnimalNameComparator animalNameComparator = new AnimalNameComparator();


        Assertions.assertEquals(-1,animalNameComparator.compare(o1,o2));
    }
    @Test
    public void compare3 (){
        Animal o1 = new Animal("Имя", 10);
        Animal o2 = new Animal("Имя", 10);
        AnimalNameComparator animalNameComparator = new AnimalNameComparator();


        Assertions.assertEquals(0,animalNameComparator.compare(o1,o2));
    }
    }

