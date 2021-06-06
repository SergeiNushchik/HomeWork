package HomeWork_5;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;

public class HomeWork_5_Main {
    public static void main(String[] args) {
        DataContainer<String> container = new DataContainer<>(new String[0]); //Тут есть подвох в конструкторе, думайте пока сами
        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");

        System.out.println(container.toString());

        container.delete("Давай потом");

        System.out.println(container.toString());

    }
}
