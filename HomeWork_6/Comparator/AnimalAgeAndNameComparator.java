package HomeWork_6.Comparator;

import HomeWork_6.dto.Animal;

import java.util.Comparator;

public class AnimalAgeAndNameComparator implements Comparator<Animal> {

    /**
     * Метод проиводит сортировку коллекции Animal по двум параметрам.
     * Основной параметр age(возраст)
     * Второстепенный параметр имя
     * @param o1 первый параметр
     * @param o2 второй параметр
     * @return
     */
    @Override
    public int compare(Animal o1, Animal o2) {
      int a1 = o1.getAge();
      int a2 = o2.getAge();

      if ( a1 != 0 && a2 == 0){
          return -1;
      }
      if (a1 == 0 && a2 != 0){
          return 1;
      }
      if (a1 == 0 && a2 == 0){
          return 0;
      }
        int result =  a1 - a2;
        if (result == 0){
            return comareN(o1,o2);

        }else {
            return result;
        }
    }

    /**
     * Метод проиводит сортировку коллекции Animal по именам
     * @param o1 первый параметр
     * @param o2 второй параметр
     * @return
     */
    public int  comareN (Animal o1, Animal o2){
        String str1 = o1.getNick();
        String str2 = o2.getNick();

        return str1.compareTo(str2);
    }
}

