package moves;
import ru.ifmo.se.pokemon.*;

public final class IceBeam extends SpecialMove {
    public IceBeam() {
        super(Type.ICE, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {

        p.addEffect(new Effect().chance(0.1).condition(Status.FREEZE));
    }

    @Override
    protected String describe() {
        return "Использует Ice Beam";
    }

}
