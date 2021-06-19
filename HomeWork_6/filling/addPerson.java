package HomeWork_6.filling;

import HomeWork_6.dto.Person;

import java.util.List;

import static HomeWork_6.filling.filling.namesPerson;
import static HomeWork_6.filling.filling.passwordPerson;

public class addPerson {
    public void addPerson(List<Person> personList, int number  ){
        for (int i = 0; i < number; i++) {
        String namesPerson = namesPerson();
        String passwordPerson = passwordPerson();
        personList.add(new Person(namesPerson, passwordPerson));
      }
    }
}
