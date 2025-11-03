package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;

public final class Mewtwo extends Pokemon {

    public Mewtwo(String name, int level) {

        super(name, level);
        setType(Type.PSYCHIC);
        setStats(106, 110, 90, 154, 90, 130);
        this.setMove(new EnergyBall(), new ShadowBall(), new Recover(), new Blizzard());

    }


}
