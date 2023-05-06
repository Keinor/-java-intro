package com.nastyabelova.bookMagazine;

public class Main {
    public static void main(String[] args) {

        Book scienceBook = new Book("Квантовая физика", "Эйнштейн", 100, true, 5, "том 1", true);
        Book kindBook = new Book("Книга для детей", "Фроловы", 10, false, 10, "том 2", true);
        Magazine fashionMagazine = new Magazine("Fashion", "дом Бурда", 15, 40, "16.04.2022", true);
        Magazine educationMagazine = new Magazine("Education", "дом Бурда", 35, 40, "16.04.2022", true);

        kindBook.hardcover(kindBook.isHardcover(), kindBook.getTitle());
        kindBook.read(kindBook.getNumberPictures(), kindBook.getNumberPages());
        scienceBook.hardcover(scienceBook.isHardcover(), scienceBook.getTitle());
        scienceBook.read(scienceBook.getNumberPictures(), kindBook.getNumberPages());

        fashionMagazine.read(fashionMagazine.getNumberPictures(), fashionMagazine.getNumberPages());
        fashionMagazine.costMagazine(fashionMagazine.getNumberPages(), fashionMagazine.getTitle());
        fashionMagazine.getInfoEForm(fashionMagazine.isEMagazine());
    }
}
