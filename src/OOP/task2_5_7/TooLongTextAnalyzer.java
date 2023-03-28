package OOP.task2_5_7;

public class TooLongTextAnalyzer implements TextAnalyzer {
    private final int maxLength;
    @Override
    public Label processText(String text) {
        if (text.length() >= maxLength) {
            return Label.TOO_LONG;
        }
        return Label.OK;
    }
    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }
}
