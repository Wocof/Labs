package buildings;

import java.util.ArrayList;
import java.util.Objects;
import houseelements.HouseElement;

public class RoofHouse extends Building {
    private final String roofHouseSize;
    private final ArrayList<HouseElement> houseElements;

    public RoofHouse(Location location, String atmosphere, String roofHouseSize) {
        super(location, atmosphere);
        this.houseElements = new ArrayList<>();
        this.roofHouseSize = roofHouseSize;
    }

    public ArrayList<HouseElement> getHouseElements() {
        return houseElements;
    }

    public void addHouseElement(HouseElement houseElement) {
        if (houseElement == null) {
            throw new IllegalArgumentException("Нельзя добавить null-элемент в домик Карлсона.");
        }
        this.houseElements.add(houseElement);
    }

    public String getRoofHouseSize() {
        return roofHouseSize;
    }

    @Override
    public String description() {
        return getRoofHouseSize() + " домик на крыше" + " всегда " + getAtmosphere();
    }

    @Override
    public String toString() {
        return getAtmosphere() + " " + roofHouseSize + " домик на крыше в " + getLocation() + ". В нём есть " + houseElements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RoofHouse roofHouse = (RoofHouse) o;
        return Objects.equals(roofHouseSize, roofHouse.roofHouseSize) && Objects.equals(houseElements, roofHouse.houseElements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), houseElements, roofHouseSize);
    }
}
