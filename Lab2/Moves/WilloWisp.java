package Moves;
import ru.ifmo.se.pokemon.*;

public final class WilloWisp extends StatusMove {
    public WilloWisp () {
        super(Type.FIRE, 0, 85);
    }

    @Override protected void applyOppEffects(Pokemon p) {

        Effect.burn(p);

    }

    @Override protected String describe() {
        return "Использует Will-o-Wisp ";
    }
}