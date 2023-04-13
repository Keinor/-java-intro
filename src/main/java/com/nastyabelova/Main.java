package com.nastyabelova;

public class Main {
    public static void main(String[] args) {

        Book scienceBook = new Book("Квантовая физика", "Эйнштейн", 100, true, 5);
        Magazine fashionMagazine = new Magazine("Fashion", "дом Бурда", 15, false, 40);
        Book kindBook = new Book("Книга для детей", "Фроловы", 10, false, 10);

        kindBook.hardcover(kindBook.isHardcover(), kindBook.getTitle());
        kindBook.read(kindBook.getNumberPictures());
        scienceBook.hardcover(scienceBook.isHardcover(), scienceBook.getTitle());
        scienceBook.read(scienceBook.getNumberPictures());
        fashionMagazine.hardcover(fashionMagazine.isHardcover(), fashionMagazine.getTitle());
        fashionMagazine.read(fashionMagazine.getNumberPictures());
        fashionMagazine.costMagazine(fashionMagazine.getNumberPages(), fashionMagazine.getTitle());
    }
}
