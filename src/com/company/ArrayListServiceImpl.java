package com.company;

import java.util.Arrays;

public class ArrayListServiceImpl implements ArrayListService{

    String[] array = new String[8];

    public String add(String item) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = item;
                return array[i];
            }
        }
        return "Массив уже заполнен элементами";
    }

    public String add(int index, String item) {
        if (index >= array.length) {
            throw new IndexLargerSizeOfArrayException("Значение индекса " + index + " больше чем размер массива!", null);
        } else {
            array[index] = item;
        }
        return item;
    }

    public String set(int index, String item) {
        if (index >= array.length) {
            throw new IndexLargerSizeOfArrayException("Значение индекса " + index + " больше чем размер массива!", null);
        } else if (array[index] == null) {
            throw new NullElementInTheArray("В ячейке " + index + " отсутсвует оъект, примените метод add()", null);
        } else {
            array[index] = item;
        }
        return item;
    }

    public String remove(String item) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                array[i] = null;
                return item + ": Удален";
            }
        }
        throw new NullElementInTheArray(item + ": данный объект не найден", null);
    }

    public String remove(int index) {
        String string = null;
        if (array[index] == null) {
            throw new NullElementInTheArray("В ячейке под индесом " + index + " null", null);
        } else {
            string = array[index];
            array[index] = null;
        }
        return "Элемент: " + string + " под индексом " + index + " удален";
    }

    public boolean contains(String item) {
        for (String s : array) {
            if (s == item) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(String item) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(String item) {
        for (int i = array.length; i >= 0; i--) {
            if (array[i - 1] == item) {
                return i - 1;
            }
        }
        return -1;
    }

    public String get(int index) {
        if (array[index] == null) {
            throw new NullElementInTheArray("В ячейке под индексом " + index + " объект отсутствует", null);
        } else {
            return array[index];
        }
    }

    public boolean equals(Object StringList, Object otherList) {
        if (StringList == null || otherList == null) {
            throw new NullElementInTheArray("Один из объектов отсутствует!", null);
        } else {
            return StringList.equals(otherList);
        }
    }

    public int size() {
        int size = 0;
        for (String s : array) {
            if (s != null) {
                size++;
            }
        }
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    public String[] toArray() {
        String[] array = new String[8];
        return array;
    }
}
