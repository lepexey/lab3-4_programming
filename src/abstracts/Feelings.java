package abstracts;

public enum Feelings {
    GREED("жадность"),
    ENVY("с завистью"),
    BECAME_ENVY("завидно стало"),
    SATISFIED("довольна"),
    PLEASURE ("с удовольствием"),
    MUCH_PLEASURE("с таким удовольствием"),
    DISGUST("с отвращением"),
    SMILE("в улыбке"),
    QUACKING("крякая от удовольствия"),
    ENVIABLE("завидно"),
    FEAR("с некоторой опаской");

    private final String feeling;

    Feelings(String feeling) {
        this.feeling = feeling;
    }

    public String getFeeling(){
        return feeling;
    }
}
