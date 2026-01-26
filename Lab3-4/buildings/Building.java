package buildings;

import java.util.Objects;

public abstract class Building {
    private final Location location;
    private final String atmosphere;

    public Building(Location location, String atmosphere){
        this.location = location;
        this.atmosphere = atmosphere;
    }

    public Location getLocation() {
        return location;
    }

    public String getAtmosphere() {
        return atmosphere;
    }

    public abstract String description();

    @Override
    public String toString() {
        return atmosphere + " постройка в " + location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(location, building.location) && Objects.equals(atmosphere, building.atmosphere);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, atmosphere);
    }
}
