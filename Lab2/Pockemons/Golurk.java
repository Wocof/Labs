package pokemons;
import moves.*;

public final class Golurk extends Golett {

    public Golurk(String name, int level) {

        super(name, level);
        setStats(89, 124, 80, 55, 80, 55);
        this.setMove(new StoneEdge());

    }

}
