package de.telran.controller;

import de.telran.data.TransformRuleLength6;
import de.telran.data.TransformerRuleLength3;
import de.telran.data.TransformerRulesLength4;
import de.telran.data.WordTransformer;

public class WordTransformerApp {

    public static void main(String[] args) {

        //System.out.println(WordTransformer.wordTransform2("AGHJ kLU jgkslg ttt",1));

        TransformerRuleLength3 tr3 = new TransformerRuleLength3();
        TransformerRuleLength3 tr4 = new TransformerRulesLength4();

        System.out.println(WordTransformer.wordTransform3("AGHJ kLU jgkslg ttt", tr3));
        System.out.println(WordTransformer.wordTransform3("AGHJ kLU jgkslg ttt", tr4));
        System.out.println(WordTransformer.wordTransform3("AGHJ kLU jgkslg ttt", new TransformRuleLength6()));


    }
}
