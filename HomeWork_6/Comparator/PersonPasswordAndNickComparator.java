package HomeWork_6.Comparator;

import HomeWork_6.dto.Person;

import java.util.Comparator;

public class PersonPasswordAndNickComparator implements Comparator<Person> {

  public int compare(Person o1, Person o2) {
      String str1 = o1.getPassword();
      int len1 = str1.length();
      String str2 = o2.getPassword();
      int len2 = str2.length();
      if(str1 == null && str2 != null) {
          return 1;
      }

      if(str1 != null && str2 == null) {
          return -1;
      }

      if(str1 == null && str2 == null) {
          return 0;

      }
      int result =  len1 - len2;
      if (result == 0){
          return comareName(o1,o2);

      }else {
          return result;
      }
  }
    public int  comareName (Person o1, Person o2){
      String str1 = o1.getNick();
      String str2 = o2.getNick();

        return str1.compareTo(str2);
    }
}