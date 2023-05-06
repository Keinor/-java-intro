package com.nastyabelova.collections;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nArrays:\n");
        ArraysExample arraysExample = new ArraysExample();
        arraysExample.getArrays();

        System.out.println("\nMap:\n");
        MapExample mapExample = new MapExample();
        mapExample.getMap();

        System.out.println("\nList:\n");
        ListExample listExample = new ListExample();
        listExample.getList();

        System.out.println("\nSet:\n");
        SetExample setExample = new SetExample();
        setExample.getSet();
    }
}
