package de.telran;

public class WordsTransformerApp {
    public static void main(String[] args) {

        WordsChecker wc = new WordsChecker() {
            @Override
            public boolean checkWord(String word) {
                return word.length()==3;
            }
        };

        WordsChecker wordsChecker = s -> s.length()==4;

        WordTransformer wordTransformer = new WordTransformer() {
            @Override
            public String transformWord(String word) {
                return word.toUpperCase();
            }
        };

        WordTransformer wt = s -> s.replaceAll(".","*");
        WordTransformer wt2 = WordsTransformerApp::transformWord;


        System.out.println(wc.checkWord("hell"));
        System.out.println(wordsChecker.checkWord("hell"));

        String str = "aa RtUf fgH RTYHJ";
        System.out.println(WordsTransform.transformWord(str, wc, wordTransformer));
        System.out.println(WordsTransform.transformWord(str, s -> s.length() == 2, String::toUpperCase));
    }

    private static String transformWord(String s) {
        return s.toUpperCase();
    }
}
