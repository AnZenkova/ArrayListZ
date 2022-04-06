package com.company;

import java.util.Arrays;
import java.util.Objects;

public class StringList {
    private int index;
    private String[] strings;


    public StringList(int index) {
        strings = new String[index];
    }

    public String[] getStrings() {
        return strings;
    }

    public int getIndex() {
        return index;
    }

    public String setStringListOfIndex(int index, String string) {
        return strings[index] = string;
    }

    public String getStringListOfIndex(int index) {
        return strings[index];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringList that = (StringList) o;
        return index == that.index && Arrays.equals(strings, that.strings);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(index);
        result = 31 * result + Arrays.hashCode(strings);
        return result;
    }

    @Override
    public String toString() {
        return "StringList{" +
                "index=" + index +
                ", strings=" + Arrays.toString(strings) +
                '}';
    }
}
