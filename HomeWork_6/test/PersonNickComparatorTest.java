package HomeWork_6.test;

import HomeWork_6.dto.Animal;
import HomeWork_6.dto.Person;
import HomeWork_6.сomparator.AnimalAgeComparator;
import HomeWork_6.сomparator.PersonNickComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonNickComparatorTest {


        @Test
        public void compare1 (){
            Person o1 = new Person("Имя1", "56456654");
            Person o2 = new Person("Имя2", "1115648");
            PersonNickComparator personNickComparator = new PersonNickComparator();

            Assertions.assertEquals(-1,personNickComparator.compare(o1,o2));
        }
    @Test
    public void compare2 (){
       Person o1 = new Person("Имя2", "56456654");
       Person o2 = new Person("Имя1 ", "1115648");
        PersonNickComparator personNickComparator = new PersonNickComparator();

        Assertions.assertEquals(1,personNickComparator.compare(o1,o2));
    }
    @Test
    public void compare3 (){
        Person o1 = new Person("Имя", "56456654");
        Person o2 = new Person("Имя", "1115648");
        PersonNickComparator personNickComparator = new PersonNickComparator();

        Assertions.assertEquals(0,personNickComparator.compare(o1,o2));
    }
    }

