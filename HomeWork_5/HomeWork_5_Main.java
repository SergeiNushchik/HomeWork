package HomeWork_5;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork_5_Main {
    public static void main(String[] args) {
        DataContainer<String> container = new DataContainer<>(new String[0]); //Тут есть подвох в конструкторе, думайте пока сами
        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");
       // String a = container.getData(3);
        container.delete("Как дела");
        String text1 = container.getData(index1);
        String text2 = container.getData(index2);
        String text3 = container.getData(index3);
        String text4 = container.getData(index4);
     // System.out.println(text1); //Привет
     // System.out.println(text2); //Как дела
     // System.out.println(text3); //Работаю
     // System.out.println(text4); //Давай потом
     // container.delete(index1);
      // System.out.println(container.getData(index1)); //Как дела
        container.delete("Как дела");
        //System.out.println(a);
        System.out.println(text1); //Привет
        System.out.println(text2); //Как дела
        System.out.println(text3); //Работаю
        System.out.println(text4); //Давай потом


    }
}
