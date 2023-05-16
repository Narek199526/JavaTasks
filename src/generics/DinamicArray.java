package generics;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class DinamicArray <E> {
    private Object array1[] = new Object[15];
    private E array[] = (E[])array1;
    private int index = 0;

    private E [] dynamicArray() {
        Object array2[] = new Object[array.length + 10];
        System.arraycopy(array, 0, array2, 0, index);
        array = (E[]) array2;
        return array;
    }

    public void add(E element) {
        if (index == array.length) {
            array = dynamicArray();
        }
        array[index++] = element;
    }

    public E getElement(int index){
        if (index >= 0 && index <= this.index) {
            return array[index];
        } else
            throw new  IndexOutOfBoundsException();

    }

    public int size() {
        return index;
    }

    public void add(int index, E element) {
        if (index == array.length){
            array = dynamicArray();
        }
        if (index >= 0 && index <= this.index) {
            for (int i = this.index + 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = element;
        }
        this.index++;
    }

    public void remove(int index) {
        if (index >= 0 && index <= this.index) {
            for (int i = index; i < this.index; i++) {
                array[i] = array[i + 1];
            }
            this.index--;
        }
    }
}
