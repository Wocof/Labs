package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;

public final class Kirlia extends Pokemon {

    public Kirlia(String name, int level) {

        super(name, level);
        setType(Type.PSYCHIC, Type.FAIRY);
        setStats(38, 35, 35, 65, 55, 50);
        this.setMove(new ThunderWave(), new WilloWisp(), new Charm());

    }

}

