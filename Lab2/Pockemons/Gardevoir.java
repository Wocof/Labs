package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;

public final class Gardevoir extends Pokemon {

    public Gardevoir(String name, int level) {

        super(name, level);
        setType(Type.PSYCHIC, Type.FAIRY);
        setStats(68, 65, 65, 125, 115, 80);
        this.setMove(new ThunderWave(), new WilloWisp(), new Charm(), new Moonblast());

    }

}