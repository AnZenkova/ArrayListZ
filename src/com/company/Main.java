package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayListService arrayListService = new ArrayListServiceImpl();

        System.out.println(arrayListService.add("Привет"));
        System.out.println(arrayListService.add(3,"У меня всё хорошо"));
        System.out.println(arrayListService.set(3,"Или плохо?"));
        System.out.println(arrayListService.remove("Или плохо?"));
        System.out.println(arrayListService.remove(0));

        System.out.println(arrayListService.add("Привет"));

        System.out.println(arrayListService.contains("Привет"));
        System.out.println(arrayListService.indexOf("Привет"));
        System.out.println(arrayListService.lastIndexOf("Привет"));
        System.out.println(arrayListService.get(0));

        String[] strings = {"h", "p", "s"};

        System.out.println(arrayListService.equals(strings));
        System.out.println(arrayListService.size());

        System.out.println(arrayListService.remove(0));

        System.out.println(arrayListService.isEmpty());
        arrayListService.clear();

        String[] array = arrayListService.toArray();

    }
}
