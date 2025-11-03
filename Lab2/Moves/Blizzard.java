package moves;
import ru.ifmo.se.pokemon.*;

public final class Blizzard extends SpecialMove {
    public Blizzard() {
        super(Type.ICE, 110, 70);
    }

    @Override protected void applyOppEffects(Pokemon p) {

        p.addEffect(new Effect().chance(0.1).condition(Status.FREEZE));
    }

    @Override protected String describe() {
        return "Использует Attacks.Blizzard";
    }
}
