package abstracts;

public enum Feelings {
    GREED("жадность"),
    ENVY("с завистью"),
    PLEASURE ("с удовольствием"),
    DISGUST("с отвращением");

    private final String feeling;

    Feelings(String feeling) {
        this.feeling = feeling;
    }

    public String getFeeling(){
        return feeling;
    }
}
