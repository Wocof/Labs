package houseelements;

import java.util.Objects;

public final class Shutters extends HouseElement{
    private final String colour;

    public Shutters(String description, String colour) {
        super(description);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public void uniqueAction() {
        System.out.println(colour + " " + description + "приветливо распахнуты");
    }

    @Override
    public String toString() {
        return colour + " " + description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Shutters shutters = (Shutters) o;
        return Objects.equals(colour, shutters.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), colour);
    }
}
