package com.nastyabelova;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class PaperProduct {

    private String title;
    private String author;
    private int numberPages;
    private int numberPictures;

    public abstract void read(int countPictures, int countPages);
}
