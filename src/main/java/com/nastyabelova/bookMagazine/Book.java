package com.nastyabelova.bookMagazine;

public class Book extends PaperProduct implements ElectronicForm {

    private final String tom;
    private final boolean isEBook;
    private final boolean isHardcover;

    public Book(String title, String author, int numberPages, boolean isHardcover, int numberPictures, String tom, boolean isEBook) {
        super(title, author, numberPages, numberPictures);
        this.tom = tom;
        this.isEBook = isEBook;
        this.isHardcover = isHardcover;
    }

    public boolean isHardcover() {
        return isHardcover;
    }

    @Override
    public void read(int countPictures, int countPages) {
        {
            if (countPictures > 0) {
                System.out.println("\nКнига с иллюстрациями. Время прочтения: " + countPages * 2 + " минут");
            } else {
                System.out.println("\nКнига без иллюстраций. Время прочтения: " + countPages * 4 + " минут");
            }
        }
    }

    @Override
    public void getInfoEForm(boolean isEBook) {
        if (isEBook) {
            System.out.println("Вы можете заказать на сайтах:\nwww.lovereadbooks.com\nwww.boookk.ru");
        }
    }

    public void hardcover(boolean isHard, String title) {
        if (isHard) {
            System.out.println("\nКнига " + title + "в твердом переплёте.");
        } else {
            System.out.println("\nКнига " + title + " в мягкой обложке.");
        }
    }
}
