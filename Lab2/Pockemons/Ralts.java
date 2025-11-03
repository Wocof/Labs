package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;

public final class Ralts extends Pokemon {

    public Ralts(String name, int level) {

        super(name, level);
        setType(Type.PSYCHIC, Type.FAIRY);
        setStats(28, 25, 25, 45, 35, 40);
        this.setMove(new ThunderWave(), new WilloWisp());

    }

}
