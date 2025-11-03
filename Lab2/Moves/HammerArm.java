package moves;
import ru.ifmo.se.pokemon.*;

public final class HammerArm extends PhysicalMove {
    public HammerArm() {
        super(Type.FIGHTING, 90, 100);
    }

    @Override protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().stat(Stat.SPEED, -1));
    }

    @Override protected String describe() {
        return "Использует Hammer Arm";
    }

}
