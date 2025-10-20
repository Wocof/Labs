package Moves;
import ru.ifmo.se.pokemon.*;

public final class StoneEdge extends PhysicalMove {
    public StoneEdge() {
        super(Type.ROCK, 100, 80);
    }

    @Override protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if (Math.random() <= 1.0 / 8.0) {
            return 2;
        }
         else return 1;
    }



    @Override protected String describe() {
        return "Использует Stone Edge";
    }
}