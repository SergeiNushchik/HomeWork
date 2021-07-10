package HomeWork_6.сomparator;

import HomeWork_6.dto.Person;

import java.util.Comparator;

public class PersonPasswordComparator implements Comparator<Person>   {

  public int compare(Person o1, Person o2) {
      String str1 = o1.getPassword();
      int len1 = str1.length();
      String str2 = o2.getPassword();
      int len2 = str2.length();
      
        return len1 - len2;

      }
  }
