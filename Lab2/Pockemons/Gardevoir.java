package pokemons;
import moves.*;

public final class Gardevoir extends Kirlia {

    public Gardevoir(String name, int level) {

        super(name, level);
        setStats(68, 65, 65, 125, 115, 80);
        this.addMove(new Moonblast());

    }

}
