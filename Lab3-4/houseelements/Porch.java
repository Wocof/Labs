package houseelements;

import java.util.Objects;

public final class Porch extends HouseElement {
    private final String porchSize;

    public Porch(String description, String porchSize) {
        super(description);
        this.porchSize = porchSize;
    }

    public String getPorchSize() {
        return porchSize;
    }

    @Override
    public void uniqueAction() {
        System.out.println(porchSize + " " + description + " украшает вход в дом");
    }

    @Override
    public String toString() {
        return porchSize + " " + description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Porch porch = (Porch) o;
        return Objects.equals(porchSize, porch.porchSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), porchSize);
    }
}
