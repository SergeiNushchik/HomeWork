package HomeWork_6;


import HomeWork_6.iterator.IteratorsList;
import HomeWork_6.iterator.api.Iterators;
import HomeWork_6.supplier.AnimalSupplierAuto;
import HomeWork_6.supplier.PersonSupplierAuto;
import HomeWork_6.сomparator.AnimalNameComparator;
import HomeWork_6.сomparator.PersonNickComparator;

import java.util.*;
import java.util.function.Supplier;


public class Main {


    public static void main(String[] args) {

        joblist(new ArrayList<>(),
                100_000,
                new PersonSupplierAuto(),
                new PersonNickComparator(),
                new IteratorsList<>());
        joblist(new ArrayList<>(),
                100_000,
                new AnimalSupplierAuto(),
                new AnimalNameComparator(),
                new IteratorsList<>());


        joblist(new LinkedList<>(),
                100_000,
                new PersonSupplierAuto(),
                new PersonNickComparator(),
                new IteratorsList<>());

        joblist(new LinkedList<>(),
                100_000,
                new AnimalSupplierAuto(),
                new AnimalNameComparator(),
                new IteratorsList<>());

        jobSet(new HashSet<>(),
                100_000,
                new PersonSupplierAuto(),
                new PersonNickComparator(),
                new IteratorsList<>());

        jobSet(new HashSet<>(),
               100_000,
               new AnimalSupplierAuto(),
               new AnimalNameComparator(),
               new IteratorsList<>());

        jobSet(new TreeSet<>(),
               100_000,
               new PersonSupplierAuto(),
               new PersonNickComparator(),
               new IteratorsList<>());

        jobSet(new TreeSet<>(),
                100_000,
                new AnimalSupplierAuto(),
                new AnimalNameComparator(),
                new IteratorsList<>());

    }
    public static <T> void joblist(List<T> data,
                               long quantity,
                               Supplier<T> supplier,
                               Comparator<T> comparator,
                               Iterators<T> iterator ){

        long start;
        long stop;


        start = System.currentTimeMillis();

        for (int i = 0; i < quantity; i++) {

            data.add((supplier.get()));
        }
        stop = System.currentTimeMillis();

        System.out.println("Время затраченное на добавление "   + quantity + " объектов: " + (stop-start) + " мс.");

        start = System.currentTimeMillis();

        data.sort(comparator);

        stop = System.currentTimeMillis();

        System.out.println("Время затраченное на сортировку  " + quantity + " объектов: " + (stop-start) + " мс.");


        start = System.currentTimeMillis();
        iterator.run(data);
        stop = System.currentTimeMillis();
        System.out.println("Время затраченное на итерирование " + quantity + " объектов: " + (stop-start) + " мс.");


        start = System.currentTimeMillis();
        iterator.remove(data);
        stop = System.currentTimeMillis();

        System.out.println("Время затраченное на итерирование  " + quantity + " объектов: " + (stop-start) + " мс.");


        System.out.println("--------End--------");



    }
    public static <T> void jobSet(Set<T> data,
                               long quantity,
                               Supplier<T> supplier,
                               Comparator<T> comparator,
                               Iterators<T> iterator ){

        long start;
        long stop;


        start = System.currentTimeMillis();

        for (int i = 0; i < quantity; i++) {

            data.add((supplier.get()));
        }
        stop = System.currentTimeMillis();

        System.out.println("Время затраченное на добавление "   + quantity + " объектов: " + (stop-start) + " мс.");


        start = System.currentTimeMillis();



        stop = System.currentTimeMillis();

        System.out.println("Время затраченное на сортировку  " + quantity + " объектов: " + (stop-start) + " мс.");


        data.stream().sorted(comparator);

        start = System.currentTimeMillis();
        iterator.run(data);
        stop = System.currentTimeMillis();
        System.out.println("Время затраченное на итерирование " + quantity + " объектов: " + (stop-start) + " мс.");






        start = System.currentTimeMillis();
        iterator.remove(data);
        stop = System.currentTimeMillis();

        System.out.println("Время затраченное на итерирование  " + quantity + " объектов: " + (stop-start) + " мс.");


        System.out.println("--------End--------");



    }
}
