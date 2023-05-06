package com.nastyabelova.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {

    public void getList() {
        List<String> booksList = new ArrayList<>();
        booksList.add("Новая эра");
        booksList.add("Последняя эра");
        booksList.add("Будущая эра");
        booksList.add("Эра");
        System.out.println(booksList + "\nразмером " + booksList.size());

        System.out.printf("Удаляем из набора книгу - '%s' и перезапишем '%s' на новое значение \n", booksList.get(3), booksList.get(1));
        booksList.set(1, "Предпоследняя эра");
        booksList.remove("Эра");

        if (booksList.contains("Будущая эра")) {
            System.out.printf("\nВ коллекции есть книга '%s' \n", booksList.get(2));
        }
        Collections.sort(booksList);

        for (String s : booksList) {
            System.out.println(s);
        }
    }
}
