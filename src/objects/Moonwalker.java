package objects;

import abstracts.Feelings;
import abstracts.Visiter;

public class Moonwalker extends Visiter {
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

    public void buySalt(Visiter donut, Santik tenSantiks) {
        System.out.print(this + " купил у " + donut.getName() + "а сразу десять щепоток соли за " + tenSantiks + " и ");
    }

    public void throwSalt() {
        System.out.println("бросил всю эту соль в тарелку с супом.");
    }

    public void badSoup() {
        System.out.println("Ясно, суп у него получился такой, что в рот взять было нельзя.");
    }
}
