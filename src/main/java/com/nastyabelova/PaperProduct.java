package com.nastyabelova;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PaperProduct {
    private String title;
    private String author;
    private int numberPages;
    private boolean isHardcover;
    private int numberPictures;

    public void read(int countPictures) {
        if (countPictures < 10) {
            System.out.println("Придется больше читать!");
        } else {
            System.out.println("Можно рассматривать много картинок!");
        }
    }

    public void hardcover(boolean isHard, String title) {
        if (isHard || title.contains("Книга")) {
            System.out.println("\nВы нашли книгу: " + title);
        } else {
            System.out.println("\nВы нашли журнал: " + title);
        }
    }
}
