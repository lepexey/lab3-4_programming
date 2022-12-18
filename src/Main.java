import abstracts.Visiter;
import objects.*;

public class Main {
    public static void main(String[] args) {
        Donut donut = new Donut("Пончик");
        Salt salt = new Salt("щепоть соли");
        donut.handInPocket(salt);

        Visiter shorter = new Shorters("коротышке");
        Salt salt2 = new Salt("щепотку соли");
        Santik santik = new Santik("сантик");
        donut.giveSaltToShorter(shorter, santik, salt2);

        Moonwalker groopMoonwalker = new Moonwalker("другие посетители");
        groopMoonwalker.groupChangeSantik(santik, salt);

        Coins coins = new Coins("кучка монеток");
        donut.watchWithPleasure(coins);

        Moonwalker moonwalker = new Moonwalker("Один лунатик");
        Salt justSalt = new Salt("соль");
        moonwalker.eatSaltSoup(justSalt);

        Moonwalker otherMoonwalker = new Moonwalker("Другой");
        Santik tenSantiks = new Santik("десять сантиков");
        otherMoonwalker.buySalt(donut, tenSantiks);
        otherMoonwalker.throwSalt();
        otherMoonwalker.badSoup();
    }
}