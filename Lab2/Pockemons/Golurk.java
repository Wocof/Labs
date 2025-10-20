package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;

public final class Golurk extends Pokemon {

    public Golurk(String name, int level) {

        super(name, level);
        setType(Type.GROUND, Type.GHOST);
        setStats(89, 124, 80, 55, 80, 55);
        this.setMove(new HammerArm(), new Rest(), new IceBeam(), new StoneEdge());

    }

}
