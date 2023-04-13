package com.nastyabelova;

public class Magazine extends PaperProduct {

    public Magazine(String title, String author, int numberPages, boolean isHardcover, int numberPictures) {
        super(title, author, numberPages, isHardcover, numberPictures);
    }

    public void costMagazine(int numberPages, String title) {
        String[] cost;

        if (numberPages > 10) {
            cost = new String[]{"Цена без скидки: " + numberPages * 10, "Цена со скидкой: " + numberPages * 5};
        } else {
            cost = new String[]{"Цена без скидки: " + numberPages * 5, "Цена со скидкой: " + numberPages * 4};
        }

        System.out.println("\nЦена для журнала " + title + ":");
        for (String s : cost) {
            System.out.println(s);
        }
    }
}
