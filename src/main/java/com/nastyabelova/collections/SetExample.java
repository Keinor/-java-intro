package com.nastyabelova.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public void getSet() {
        Set<String> materialsSet = new HashSet<>();
        materialsSet.add("дерево");
        materialsSet.add("велюр");
        materialsSet.add("пластик");

        System.out.printf("Содержит кол-во материалов %d штук/и \n", materialsSet.size());

        for (String s : materialsSet) {
            System.out.println(s);
        }

        System.out.println("Удаляем из набора материал - пластик");
        materialsSet.remove("пластик");

        Set<String> newMaterials = new HashSet<>();
        newMaterials.add("бумага обычная");
        newMaterials.add("натуральная кожа");

        materialsSet.addAll(newMaterials);
        System.out.println("После слияния 2х сетов:\n");
        for (String s : materialsSet) {
            System.out.println(s);
        }
    }
}
