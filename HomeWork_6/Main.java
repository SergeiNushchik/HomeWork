package HomeWork_6;

import HomeWork_6.dto.Person;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Person> personArrayList = new ArrayList<>();
        List<Person> personLinkedList = new LinkedList<>();

        Set<Person> personHashSetList = new HashSet<>();


        CollectionAdd.addPerson(personHashSetList);

        for (Person person : personHashSetList) {
            System.out.println(person);
        }

        System.out.println("----------------------------");
        Set<Person> personTreeSetList = new TreeSet<>();


        for (Person person : personTreeSetList) {
            System.out.println(person);
        }
    }
}
