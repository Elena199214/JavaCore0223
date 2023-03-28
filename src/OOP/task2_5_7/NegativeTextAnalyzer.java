package OOP.task2_5_7;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    public String[] keywords = {":(", "=(", ":|"};

    public NegativeTextAnalyzer() {
        this.keywords = keywords;
    }

    @Override
    public String[] getKeywords() {
        return keywords;
    }

    @Override
    public Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
