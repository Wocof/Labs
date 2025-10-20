import Pokemons.*;
import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Mewtwo p1 = new Mewtwo("Игорь", 10);
        Golett p2 = new Golett("Паша", 10);
        Golurk p3 = new Golurk("Гоша", 10);
        Ralts p4 = new Ralts("Вася", 10);
        Kirlia p5 = new Kirlia("Гена", 10);
        Gardevoir p6 = new Gardevoir("Коля", 10);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();

    }
}