package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;

public final class Golett extends Pokemon {

    public Golett(String name, int level) {

        super(name, level);
        setType(Type.GROUND, Type.GHOST);
        setStats(59, 74, 50, 35, 50, 35);
        this.setMove(new HammerArm(), new Rest(), new IceBeam());

    }


}
