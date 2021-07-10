package HomeWork_6.сomparator;

import HomeWork_6.dto.Animal;

import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal> {
    /**
     * Метод производит сортировку коллекции Animal по age(возрасту)
     * @param o1
     * @param o2
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
        return a1 - a2;
    }
}
