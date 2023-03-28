package OOP.task2_5_7;

public class Main {
public Label checkLabels(TextAnalyzer[] analyzers, String text) {
    for (TextAnalyzer t : analyzers) {
        if ((t.processText(text) == Label.TOO_LONG) || (t.processText(text) == Label.NEGATIVE_TEXT) || (t.processText(text) == Label.SPAM)) {
            return t.processText(text);
        }
    }
    return Label.OK;
}

}
//        public static void main (String[]args){
//            // инициализация анализаторов для проверки в порядке данного набора анализаторов
//            String[] spamKeywords = {"spam", "bad"};
//            int commentMaxLength = 40;
//            TextAnalyzer[] textAnalyzers1 = {
//                    new NegativeTextAnalyzer(spamKeywords),
//                    new SpamAnalyzer(),
//                    new TooLongTextAnalyzer(commentMaxLength)
//            };
//            TextAnalyzer[] textAnalyzers2 = {
//                    new NegativeTextAnalyzer(spamKeywords),
//                    new TooLongTextAnalyzer(commentMaxLength),
//                    new SpamAnalyzer()
//            };
//            TextAnalyzer[] textAnalyzers3 = {
//                    new TooLongTextAnalyzer(commentMaxLength),
//                    new NegativeTextAnalyzer(spamKeywords),
//                    new SpamAnalyzer()
//            };
//            TextAnalyzer[] textAnalyzers4 = {
//                    new TooLongTextAnalyzer(commentMaxLength),
//                    new SpamAnalyzer(),
//                    new NegativeTextAnalyzer(spamKeywords)
//            };
//            TextAnalyzer[] textAnalyzers5 = {
//                    new SpamAnalyzer(),
//                    new NegativeTextAnalyzer(spamKeywords),
//                    new TooLongTextAnalyzer(commentMaxLength)
//            };
//            TextAnalyzer[] textAnalyzers6 = {
//                    new SpamAnalyzer(),
//                    new TooLongTextAnalyzer(commentMaxLength),
//                    new NegativeTextAnalyzer(spamKeywords)
//            };
//            // тестовые комментарии
//            String[] tests = new String[8];
//            tests[0] = "This comment is so good.";                            // OK
//            tests[1] = "This comment is so Loooooooooooooooooooooooooooong."; // TOO_LONG
//            tests[2] = "Very negative comment !!!!=(!!!!;";                   // NEGATIVE_TEXT
//            tests[3] = "Very BAAAAAAAAAAAAAAAAAAAAAAAAD comment with :|;";    // NEGATIVE_TEXT or TOO_LONG
//            tests[4] = "This comment is so bad....";                          // SPAM
//            tests[5] = "The comment is a spam, maybeeeeeeeeeeeeeeeeeeeeee!";  // SPAM or TOO_LONG
//            tests[6] = "Negative bad :( spam.";                               // SPAM or NEGATIVE_TEXT
//            tests[7] = "Very bad, very neg =(, very ..................";      // SPAM or NEGATIVE_TEXT or TOO_LONG
//            TextAnalyzer[][] textAnalyzers = {textAnalyzers1, textAnalyzers2, textAnalyzers3,
//                    textAnalyzers4, textAnalyzers5, textAnalyzers6};
//            Main testObject = new Main();
//            int numberOfAnalyzer; // номер анализатора, указанный в идентификаторе textAnalyzers{№}
//            int numberOfTest = 0; // номер теста, который соответствует индексу тестовых комментариев
//            for (String test : tests) {
//                numberOfAnalyzer = 1;
//                System.out.print("test #" + numberOfTest + ": ");
//                System.out.println(test);
//                for (TextAnalyzer[] analyzers : textAnalyzers) {
//                    System.out.print(numberOfAnalyzer + ": ");
//                    System.out.println(testObject.checkLabels(analyzers, test));
//                    numberOfAnalyzer++;
//                }
//                numberOfTest++;
//            }
//        }
//}

