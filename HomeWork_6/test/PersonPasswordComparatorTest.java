package HomeWork_6.test;

import HomeWork_6.dto.Person;
import HomeWork_6.сomparator.PersonNickComparator;
import HomeWork_6.сomparator.PersonPasswordComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonPasswordComparatorTest {


        @Test
        public void compare1 (){
            Person o1 = new Person("Имя1", "56456654");
            Person o2 = new Person("Имя2", "1115648");
            PersonPasswordComparator personPasswordComparator = new PersonPasswordComparator ();

            Assertions.assertEquals(1,personPasswordComparator.compare(o1,o2));
        }
    @Test
    public void compare2 (){
       Person o1 = new Person("Имя2", "5645665");
       Person o2 = new Person("Имя1 ", "11156486");
        PersonPasswordComparator personPasswordComparator = new PersonPasswordComparator ();

        Assertions.assertEquals(-1,personPasswordComparator.compare(o1,o2));
    }
    @Test
    public void compare3 (){
        Person o1 = new Person("Имя", "5645665");
        Person o2 = new Person("Имя", "1115648");
        PersonPasswordComparator personPasswordComparator = new PersonPasswordComparator ();

        Assertions.assertEquals(0,personPasswordComparator.compare(o1,o2));
    }
    }

