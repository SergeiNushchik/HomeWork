package HomeWork_6.сomparator;

import HomeWork_6.dto.Person;

import java.util.Comparator;

public class PersonNickComparator implements Comparator<Person> {

  public int compare(Person o1, Person o2) {
      String str1 = o1.getNick();
      String str2 = o2.getNick();

      return str1.compareTo(str2);
      }
  }
