package com.company;

import java.util.Arrays;

public class StringListServiceImpl implements StringListService {

    private StringList array = new StringList(8);


    public String add(String item) {
        for (int i = 0; i < array.getStrings().length; i++) {
            if (array.getStringListOfIndex(i) == null) {
                array.setStringListOfIndex(i, item);
                return array.getStringListOfIndex(i);
            }
        }
        return "Массив уже заполнен элементами";
    }

    public String add(int index, String item) {
        if (index >= array.getStrings().length) {
            throw new IndexLargerSizeOfArrayException("Значение индекса " + index + " больше чем размер массива!");
        } else {
            array.setStringListOfIndex(index, item);
        }
        return item;
    }

    public String set(int index, String item) {
        if (index >= array.getStrings().length) {
            throw new IndexLargerSizeOfArrayException("Значение индекса " + index + " больше чем размер массива!");
        } else if (array.getStringListOfIndex(index) == null) {
            throw new NullElementInTheArray("В ячейке " + index + " отсутсвует оъект, примените метод add()");
        } else {
            array.setStringListOfIndex(index,item);
        }
        return item;
    }

    public String remove(String item) {
        for (int i = 0; i < array.getStrings().length; i++) {
            if (array.getStringListOfIndex(i) == item) {
                array.setStringListOfIndex(i,null);
                return item + ": Удален";
            }
        }
        throw new NullElementInTheArray(item + ": данный объект не найден");
    }

    public String remove(int index) {
        String string = null;
        if (array.getStringListOfIndex(index) == null) {
            throw new NullElementInTheArray("В ячейке под индесом " + index + " null");
        } else {
            string = array.getStringListOfIndex(index);
            array.setStringListOfIndex(index, null);
        }
        return "Элемент: " + string + " под индексом " + index + " удален";
    }

    public boolean contains(String item) {
        for (String s : array.getStrings()) {
            if (s == item) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(String item) {
        for (int i = 0; i < array.getStrings().length; i++) {
            if (array.getStringListOfIndex(i) == item) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(String item) {
        for (int i = array.getStrings().length; i >= 0; i--) {
            if (array.getStringListOfIndex(i - 1) == item) {
                return i - 1;
            }
        }
        return -1;
    }

    public String get(int index) {
        if (array.getStringListOfIndex(index) == null) {
            throw new NullElementInTheArray("В ячейке под индексом " + index + " объект отсутствует");
        } else {
            return array.getStringListOfIndex(index);
        }
    }

    public boolean equals(StringList otherList) {
        if (otherList == null) {
            throw new NullElementInTheArray("Один из объектов отсутствует!");
        } else {
            return array.equals(otherList);
        }
    }

    public int size() {
        int size = 0;
        for (String s : array.getStrings()) {
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
        for (int i = 0; i < array.getStrings().length; i++) {
            array.setStringListOfIndex(i,null);
        }
    }

    public String[] toArray() {
        StringList arr = new StringList(8);
        return arr.getStrings();
    }
}
