package HomeWork_5;

import java.util.Arrays;

public class DataContainer<T> {

    private T[] data;


    public T getData(int index) {
        return data[index];
    }

    public T[] getItems() {
        return this.data;

    }
    boolean delete(int index){
        if (index != data.length-1){
            for (int i = index; i < data.length-1; i++) {
                data[i] = data[i+1];
            }
        }
        data = Arrays.copyOf(data, data.length-1);
        return true;
    }


     DataContainer(T[] data) {
        this.data = data;
    }


    public int add(T item) {
        int index = 0;
        boolean all = true;

        for (int i = 0; i <data.length ; i++) {
            if (data[i] == null) {
                data[i] = item;
                index = i;
                all = false;
                break;
            }
        }
            if ( data.length == 0 || all == true) {
                data = Arrays.copyOf(data,data.length+1);
                index = data.length-1;
            }

        return index;
    }


}
