package Moves;
import ru.ifmo.se.pokemon.*;

public final class Recover extends StatusMove {
    public Recover() {
        super(Type.NORMAL, 0, 0);
    }

    @Override protected void applySelfEffects(Pokemon p) {

       p.setMod(Stat.HP, (int) (p.getHP() * 1.5));

    }

    @Override protected String describe() {
        return "Использует Attacks.Recover";
    }
}