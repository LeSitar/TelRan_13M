package de.telran.controller;

import de.telran.data.ToLowerCase;
import de.telran.data.ToStarCase;
import de.telran.data.ToUpperCase;
import de.telran.data.WordsTransformer;

public class WordsTransformApp {

    public static void main(String[] args) {
        WordsTransformer wt = new WordsTransformer();
        String str = "aa RTYUI fgh GHfj";

        System.out.println(wt.transform(str, new ToUpperCase()));

    }


}
