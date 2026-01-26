package houseelements;

import java.util.Objects;

public abstract class HouseElement {
    protected final String description;

    public HouseElement(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract void uniqueAction();

    @Override public String toString() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HouseElement houseElement = (HouseElement) o;
        return Objects.equals(description, houseElement.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }
}
