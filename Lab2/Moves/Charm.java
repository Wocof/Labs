package moves;
import ru.ifmo.se.pokemon.*;

public final class Charm extends StatusMove {
    public Charm() {
        super(Type.FAIRY, 0, 100);
    }

    @Override protected void applyOppEffects(Pokemon p) {

        p.addEffect(new Effect().stat(Stat.ATTACK, -2));
    }

    @Override protected String describe() {
        return "Использует Attacks.Charm";
    }

}
