package HomeWork_6;





import HomeWork_6.Comparator.AnimalAgeAndNameComparator;
import HomeWork_6.Comparator.AnimalAgeComparator;
import HomeWork_6.Comparator.PersonPasswordAndNickComparator;


import java.util.*;

public class Main {


        public static void main(String[] args) {

            List<Person> personList = new ArrayList<>();

            personList.add(new Person("Der", "1234564"));
            personList.add(new Person("Cer", "78945689"));
            personList.add(new Person("Ber", "78945689"));
            personList.add(new Person("Aer", "4561234685"));

            for (Person person : personList) {
                System.out.println(" " + person.toString());
            }
            System.out.println("____________________");
            PersonPasswordAndNickComparator comparator = new PersonPasswordAndNickComparator();
            personList.sort(comparator);


            for (Person person : personList) {
                System.out.println(" " + person.toString());
            }
            System.out.println("____________________");
            List<Animal> animalList = new ArrayList<>();
            animalList.add(new Animal("Rex", 1));
            animalList.add(new Animal("Got", 1));
            animalList.add(new Animal("Vit", 15));
            animalList.add(new Animal("Afet", 15));

            for (Animal animal : animalList) {
                System.out.println(" " + animal.toString());
            }


            System.out.println("__________________");

            AnimalAgeAndNameComparator animalComparator = new AnimalAgeAndNameComparator();
            animalList.sort(animalComparator);


            for (Animal animal : animalList) {
                System.out.println(" " + animal.toString());
            }
            
        }


}
