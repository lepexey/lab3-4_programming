package objects;

import abstracts.Feelings;
import abstracts.Visitor;

public class Moonwalker extends Visitor {
    public Moonwalker(String name) {
        super(name);
    }

    public void eatSaltSoup(Salt salt) {
        System.out.println(this + ", не разобравшись, в чем дело, попробовал есть " + salt + " в чистом виде и тут же " +
                Feelings.DISGUST.getFeeling() + " выплюнул.");
    }

    public void groupChangeSantik(Santik santik, Salt salt) {
        System.out.println("Тут и другие посетители " +
                "начали подходить к нему. Каждый протягивал ему сантик, взамен которого получал " + salt + ".");
    }

    public void buySalt(Visitor donut, Santik tenSantiks) {
        System.out.print(this + " купил у " + donut.getName() + "а сразу десять щепоток соли за " + tenSantiks + " и ");
    }

    public void throwSalt() {
        System.out.println("бросил всю эту соль в тарелку с супом.");
    }
    @Deprecated
    public void badSoup() {
        System.out.println("Ясно, суп у него получился такой, что в рот взять было нельзя.");
    }

    public void bringTheSoup(Shorters var1, Salt var2) {
        System.out.println("Как раз в это время официант принес ему каши. Он протянул " + var1 + " еще " + var2 + ".");
    }

    public void seeProgress(Donut var1, Salt var2) {
        System.out.println(this.getName() + " увидела, что дела ее ресторана сразу улучшились, и была очень " +
                Feelings.SATISFIED.getFeeling() + ". К концу дня " + var1.getName() + " распродал весь свой запас " +
                var2 + " и ушел с карманами, туго набитыми медяками.");
    }

    public void makeSaltStore(Salt var) {
        System.out.println("Здесь он увидел, что хозяйка приготовила для него специальный столик, над которым " +
                "висела табличка с надписью: \"Продажа " + var + "\".");
    }
}
