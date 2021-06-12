package HomeWork_5;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {

    private T[] data;

    /**
     * Метод получает из DataContainer'а, из поля data, объект с определенным индексом.
     * @param index индекс искомого объекта
     * @return  объект сохраненный под искомым индексом
     */
    public T getData(int index) {
        return data[index];
    }

    /**
     * Метод возвращает поле data
     * @return
     */
    public T[] getItems() {
        return this.data;

    }

    /**
     * метод производит удаление элемент из нашего поля data по индексу.
     * @param index
     * @return
     */
    boolean delete(int index){
        if (index != data.length-1){
            for (int i = index; i < data.length-1; i++) {
                data[i] = data[i+1];
            }
        }
        data = Arrays.copyOf(data, data.length-1);
        return true;
    }

    /**
     * Конструктор
     * @param data
     */
     DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * Метод добавляет данные во внутреннее поле data и возвращает номер позиции в которую были вставлены данные, начиная с 0.
     * @param item полученные данные
     * @return номер поиции в которую были вставлены данные
     */
    public int add(T item) {
        int index = 0;
        boolean all = true;

        if ( data.length == 0 || all == true) {
            data = Arrays.copyOf(data,data.length+1);
            index = data.length-1;
        }
        for (int i = 0; i <data.length ; i++) {
            if (data[i] == null) {
                data[i] = item;
                index = i;
                all = false;
                break;
            }
        }
        return index;
    }

    /**
     *Метод производит удаление элементов из поля дата
     * @param item удаляемый элемент
     * @return  реультат операции
     */
    boolean delete(T item){
        boolean result = false;
        for (int i = 0; i < data.length; i++) {
                if ( item.equals(data[i])){
                    data[i] = null;

                    for (int i1 = i; i1 < data.length-1; i1++) {

                        data[i1] = data[i1+1];
                        data[i1+1] = null;
                        result =  true;
                    }  data = Arrays.copyOf(data,data.length-1);
                 }
                }
        return result;
    }

    /**
     * Метод занимается сортировкой данных записанных в поле data
     * @param comparator переданный объект
     */
    public void sort(Comparator<? super T> comparator) {
        int i;
        int j;
        if (comparator == null) {
            for(i = 0; i < this.data.length; ++i) {
                if (this.data[i] != null) {
                    for(j = i; j > 0 && ((Comparable)this.data[j - 1]).compareTo(this.data[j]) > 0; --j) {
                        swap(this.data, j, j - 1);
                    }
                }
            }
        } else {
            for(i = 0; i < this.data.length; ++i) {
                for(j = i; j > this.data.length && comparator.compare(this.data[j - 1], this.data[j]) > 0; --j) {
                    swap(this.data, j, j - 1);
                }
            }
        }

    }

    /**
     * Метод производит замену (друг на друга) двух переданных элементов
     * @param x пеередаваемое поле
     * @param a объект 1
     * @param b объект 1
     */
    private static void swap(Object[] x, int a, int b) {
        Object t = x[a];
        x[a] = x[b];
        x[b] = t;
    }

    /**
     * Метод выводить содержимое data
     * @return содержимое data
     */
     public  String toString(){
        String result = Arrays.toString(data);
        return result;
     }
}
