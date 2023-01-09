import abstracts.*;
import objects.*;
import exceptions.*;

public class Main {
    public static void main(String[] args) {
        Salt justSalt = new Salt("соль");
        Salt salt2 = new Salt("щепотку соли");
        Salt salt = new Salt("щепоть соли");
        Salt withSalt = new Salt("с солью");
        Salt salt3 = new Salt("соли");
        Shorters toShorter = new Shorters("коротышке");

        Shorters shorter = new Shorters("Коротышка");
        try {
            shorter.throwSalt(justSalt);
        } catch (NothingToAddSaltWith e) {
            System.out.println(e.getMessage());
        }
        shorter.seatWithSmile();
        shorter.exclaimed();
        shorter.startToEat();

        Moonwalker waiter = new Moonwalker("официант");
        waiter.bringTheSoup(toShorter, salt2);

        Donut toDonut = new Donut("Пончику");
        shorter.saltTheSoup(toDonut);

        Donut donut = new Donut("Пончик");
        donut.handInPocket(salt);

        Santik santik = new Santik("сантик");
        donut.giveSaltToShorter(toShorter, santik, salt2);

        Moonwalker groopMoonwalker = new Moonwalker("другие посетители");
        groopMoonwalker.groupChangeSantik(santik, salt);

        Coins coins = new Coins("кучка монеток");
        donut.watchWithPleasure(coins);

        Moonwalker moonwalker = new Moonwalker("Один лунатик");
        moonwalker.eatSaltSoup(justSalt);

        Moonwalker otherMoonwalker = new Moonwalker("Другой");
        Santik tenSantiks = new Santik("десять сантиков");
        otherMoonwalker.buySalt(donut, tenSantiks);
        otherMoonwalker.throwSalt();
//        otherMoonwalker.badSoup();

        Soup soup = new Soup("суп");

        Interactionable interactThing = new Interactionable() {
            @Override
            public void beingInteracted(Thingsable thing) {
                System.out.println("Ясно, " + thing + " у него получился такой, что в рот взять было нельзя.");
            }
        };


        interactThing.beingInteracted(soup);

        donut.startExplaining(justSalt);
        Shorters groupShorters = new Shorters("коротышек");
        groupShorters.interestedInSalt(withSalt, salt3);

        Donut donut2 = new Donut("Пончика");
        donut2.bringEverything(waiter, withSalt);

        Moonwalker missOwner = new Moonwalker("Хозяйка");
        missOwner.seeProgress(donut, salt3);
        // donut.makeSalt(salt3);

        Visitor.Moves run = donut.new Moves("сбегал на берег моря, быстренько натолок соли и снова явился на пищезаправочную станцию.");
        run.move();

        missOwner.makeSaltStore(salt3);

        donut.seatAndSell(justSalt);

    }
}
