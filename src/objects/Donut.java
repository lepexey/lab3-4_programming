package objects;

import abstracts.Feelings;
import abstracts.Visitor;
import exceptions.IllegalNameException;

public class Donut extends Visitor {
    public Donut(String name) {
        super(name);
    }

    public void handInPocket(Salt salt) {
        System.out.println(this + " уже запустил руку в карман, чтоб достать " + salt + ", но так как вместе " +
                Feelings.ENVY.getFeeling() + " в нем проснулась и " + Feelings.GREED.getFeeling() + " он сказал:");
    }

    public void giveSaltToShorter(Visitor shorter, Santik santik, Salt salt) {
        System.out.println("Получив " + santik + ", он отпустил " + shorter + " " + salt + ". ");
    }

    public void watchWithPleasure(Coins coins) {
        System.out.println(this + " " + Feelings.PLEASURE.getFeeling() + " наблюдал, как перед ним на столе росла " +
                coins + ". Не обошлось тут и без недоразумений.");
    }

    public void startExplaining(Salt var) {
        System.out.println(this.getName() + " стал объяснять всем, что " + var + " надо употреблять в небольших " +
                "количествах, иначе вкус от нее теряется, и уж ни в каком случае нельзя есть " + var +
                " в чистом виде.");
    }

    public void bringEverything(Moonwalker var1, Salt var2) {
        class DonutMoney {
            private final int countMoney;

            private DonutMoney(int money) throws IllegalNameException {
                if (money < 0) {
                    throw new IllegalNameException("У него не может быть отрицательное количество денег");
                } else {
                    this.countMoney = money;
                }
            }

            public void calculateMove() {
                if (countMoney > 100) {
                    System.out.println("Поскольку у " + Donut.this.getName() + " завелись деньги, он и сам поминутно просил " +
                            var1.getName() + "а " + "принести ему то борща, то каши, то щей и наглядно демонстрировал перед " +
                            "новыми посетителями преимущества питания " + var2 + ".");
                } else {
                    System.out.println("Поскольку у " + Donut.this.getName() + " закончились деньги, он долго умолял " +
                            var1.getName() + "а " + "принести ему то борща, то каши, то щей, оплатив все напрямую солью " +
                            "и наглядно демонстрировал перед " + "новыми посетителями преимущества питания " + var2 + ".");
                }
            }
        }

        DonutMoney money = new DonutMoney(99);
        money.calculateMove();
    }

    @Deprecated
    public void makeSalt(Salt var) {
        System.out.println("На следующее утро он сбегал на берег моря, быстренько натолок " + var +
                " и снова явился на пищезаправочную станцию.");
    }

    public void seatAndSell(Salt var) {
        System.out.println("За этим столом " + this.getName() + " сидел, торговал " + var +
                "ю и одновременно закусывал, требуя " +
                "подать ему то одно, то другое блюдо. Все это было очень выгодно для него и к тому же удобно.");
    }
}

