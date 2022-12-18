package objects;

import abstracts.Feelings;
import abstracts.Visiter;

public class Donut extends Visiter {
    public Donut(String name) {
        super(name);
    }

    public void handInPocket(Salt salt) {
        System.out.println(this + " уже запустил руку в карман, чтоб достать " + salt + ", но так как вместе " +
                Feelings.ENVY.getFeeling() + " в нем проснулась и " + Feelings.GREED.getFeeling() + " он сказал:");
    }

    public void giveSaltToShorter(Visiter shorter, Santik santik, Salt salt) {
        System.out.println("Получив " + santik + ", он отпустил " + shorter + " " + salt + ". ");
    }

    public void watchWithPleasure(Coins coins) {
        System.out.println(this + " " + Feelings.PLEASURE.getFeeling() + " наблюдал, как перед ним на столе росла " +
                coins + ". Не обошлось тут и без недоразумений.");
    }
}
