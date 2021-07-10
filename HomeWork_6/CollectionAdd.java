package HomeWork_6;

import HomeWork_6.dto.Animal;
import HomeWork_6.dto.Person;

import java.util.Collection;

import static HomeWork_6.filling.Filling.*;
import static HomeWork_6.filling.Filling.ageAnimal;

public class CollectionAdd {

    /**
     * Метод производит наполнение колекций объектами Person
     * @param collection
     */
   public static  void  addPerson(Collection<Person> collection, long quantity){
           for (int i = 0; i < 100_000; i++) {
               String namesPerson = namesPerson();
               String passwordPerson = passwordPerson();
                collection.add(new Person(namesPerson, passwordPerson));
           }
   }

    /**
     * Метод производит наполнение колекций объектами Animal
     * @param collection
     */
    public static void addAnimal(Collection<Animal> collection){
        for (int i = 0; i < 100; i++) {
            String nameAnimal =   nameAnimal();
            int  ageAnimal = ageAnimal();
            collection.add(new Animal(nameAnimal, ageAnimal));
            }
    }
}


