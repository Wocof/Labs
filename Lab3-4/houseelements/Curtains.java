package houseelements;

import java.util.Objects;

public final class Curtains extends HouseElement{
    private final String features;

    public Curtains(String description, String features) {
        super(description);
        this.features = features;
    }

    public String getFeatures() {
        return features;
    }

    @Override
    public void uniqueAction() {
        System.out.println("А " + description + " " + features + " раскачивались так, словно махали им на прощание.");
    }

    @Override
    public String toString() {
        return description + " " + features;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Curtains curtains = (Curtains) o;
        return Objects.equals(features, curtains.features);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), features);
    }
}



