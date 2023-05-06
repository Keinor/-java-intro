package com.nastyabelova.bookMagazine;

public class Magazine extends PaperProduct implements ElectronicForm {

    private final String release;
    private final boolean isEMagazine;

    public Magazine(String title, String author, int numberPages, int numberPictures, String release, boolean isEMagazine) {
        super(title, author, numberPages, numberPictures);
        this.release = release;
        this.isEMagazine = isEMagazine;
    }

    public String getRelease() {
        return release;
    }

    public boolean isEMagazine() {
        return isEMagazine;
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

    @Override
    public void read(int countPictures, int countPages) {
        {
            if (countPictures < 20) {
                System.out.println("\nЖурнал является образовательным! Время прочтения: " + countPages * 3 + " минут");
            } else {
                System.out.println("\nЖурнал для отдыха. Время прочтения: " + countPages + " минут");
            }
        }
    }

    @Override
    public void getInfoEForm(boolean isEMagazine) {
        if (isEMagazine & getRelease().contains("2023")) {
            System.out.println("Вы можете заказать журнал на сайте:\nwww.lovereadmag.com");
        }
    }
}
