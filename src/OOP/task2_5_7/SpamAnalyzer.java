package OOP.task2_5_7;


public class SpamAnalyzer extends KeywordAnalyzer {
    private String[] keywords;

    public String[] getKeywords(String[] keywords) {
        return this.keywords = keywords;
    }

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    public Label getLabel() {
        return Label.SPAM;
    }

}

