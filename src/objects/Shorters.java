package objects;

import abstracts.Feelings;
import abstracts.Visitor;
import exceptions.NothingToAddSaltWith;

public class Shorters extends Visitor {
    public Shorters(String name) {
        super(name);
    }

    public void throwSalt(Salt salt) throws NothingToAddSaltWith {
        if (salt.getName().length() == 0) {
            throw new NothingToAddSaltWith("Коротышка еще не купил соль, и солить ему нечем");
        }
        System.out.println(this.getName() + " бросил " + salt + " в суп, размешал ложкой и " +
                Feelings.FEAR.getFeeling() + ", " + "словно боялся обжечься, попробовал. ");
    }

    public void seatWithSmile() {
        System.out.println("Сначала он сидел застыв на месте и только моргал глазами, будто прислушивался к своим " +
                "внутренним ощущениям, а потом все увидели, как его лицо медленно расплылось " +
                Feelings.SMILE.getFeeling() + ". ");
    }

    public void exclaimed() {
        System.out.println("Проглотив еще ложку супа, он воскликнул:");
    }

    public void startToEat() {
        System.out.println("Склонившись над тарелкой, он принялся хлебать суп, " + Feelings.QUACKING.getFeeling() +
                ", чмокая губами и расхваливая кушанье на все лады. ");
    }

    public void saltTheSoup(Donut name) {
        System.out.println(this.getName() + " посолил кашу и принялся есть с таким удовольствием, что " + name.getName() +
                ", который давно расправился со своей кашей, даже " + Feelings.BECAME_ENVY.getFeeling() + ".");
    }

    public void interestedInSalt(Salt var1, Salt var2) {
        System.out.println("Все это чрезвычайно заинтересовало " + this.getName() +
                ", которые даже не представляли себе," +
                " что пишу можно было есть " + var1 + ". Каждому хотелось проверить новый метод питания. Некоторые," +
                " пообедав без " + var2 + ", начинали обедать вторично, на этот раз " + var1 + ". Многие, отведав "
                + var1 + " супа" + " или борща, тут же проверяли, насколько улучшится от добавки " + var2 +
                " вкус щей или макарон, оладий, " + "картофеля, жареных кабачков и других блюд.");
    }
}
