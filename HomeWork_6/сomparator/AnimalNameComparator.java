package HomeWork_6.сomparator;

import HomeWork_6.dto.Animal;

import java.util.Collections;
import java.util.Comparator;

public class AnimalNameComparator implements Comparator<Animal> {

    /**
     * Метод проиводит сортировку коллекции Animal по именам
     * @param o1 первый параметр
     * @param o2 второй параметр
     * @return
     */
    @Override
    public int compare(Animal o1, Animal o2) {
        String str1 = o1.getNick();
        String str2 = o2.getNick();

        return str1.compareTo(str2);
        }
    }


