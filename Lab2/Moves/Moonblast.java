package Moves;
import ru.ifmo.se.pokemon.*;

public final class Moonblast extends SpecialMove {
    public Moonblast() {
        super(Type.FAIRY, 95, 100);
    }

    @Override protected void applyOppEffects(Pokemon p) {

        p.addEffect(new Effect().chance(0.3).stat(Stat.SPECIAL_ATTACK, -1));
    }

    @Override protected String describe() {
        return "Использует Attacks.Moonblast";
    }
}