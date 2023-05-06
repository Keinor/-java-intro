package com.nastyabelova.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public void getMap() {
        Map<Integer, String> authorMaps = new HashMap<>();
        authorMaps.put(1, "Pushkin");
        authorMaps.put(2, "Tolstoy");
        authorMaps.put(3, "Lermontov");

        Set<Integer> keys = authorMaps.keySet();
        System.out.println("Список ключей у авторов: " + keys);

        Collection<String> values = authorMaps.values();
        System.out.println("Список авторов: " + values);

        System.out.printf("Заменим элемент %s и удалим %s",authorMaps.get(1),authorMaps.get(2));
        authorMaps.replace(1, "Gogol");
        authorMaps.remove(2);
        System.out.println("\nПосле всех изменений размер стал = " + authorMaps.size());

        for (Map.Entry<Integer, String> el : authorMaps.entrySet()) {
            System.out.printf("Key: %d  Value: %s \n", el.getKey(), el.getValue());
        }
    }
}
