package abstracts;

import exceptions.IllegalNameException;

public abstract class Visitor implements Humanable {
    private String name;

    protected Visitor(String name) {
        if (name == null || name.isEmpty() ) {
            throw new IllegalNameException("Имя некорректно");
        } else {
            this.name = name;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Visitor visitor = (Visitor) o;
        return name.equals(visitor.name);
    }

    public class Moves{
        private final String move;
        public Moves(String move){
            this.move = move;
        }
        public void move() {
            System.out.println(Visitor.this.name + " " + this.move);
        }
    }

}
