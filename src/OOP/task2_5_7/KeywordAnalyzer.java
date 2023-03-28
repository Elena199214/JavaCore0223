package OOP.task2_5_7;

public abstract class KeywordAnalyzer implements TextAnalyzer {
    private String[] keywords;

    abstract protected String[] getKeywords();

    abstract protected Label getLabel();

    public Label processText(String text) {
        for (String keyword : getKeywords()) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}

