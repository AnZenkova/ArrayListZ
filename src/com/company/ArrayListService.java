package com.company;

public interface ArrayListService {

    String add(String item);
    String add(int index, String item);
    String set(int index, String item);
    String remove(String item);
    String remove(int index);
    boolean contains(String item);
    int indexOf(String item);
    int lastIndexOf(String item);
    String get(int index);
    boolean equals(Object otherList);
    int size();
    boolean isEmpty();
    void clear();
//
//        // Создать новый массив
//        // из строк в списке
//        // и вернуть его.
    String[] toArray();

}
