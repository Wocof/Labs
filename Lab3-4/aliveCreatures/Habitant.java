package aliveCreatures;

import buildings.CarlsonsHouse;
import buildings.UseCarlsonsHouse;
import environment.NoFoodException;
import environment.TimeOfDay;
import environment.View;
import houseelements.Porch;
import java.util.Objects;

public class Habitant {
    private final String name;
    private final View view;
    private final Porch porch;
    private final CarlsonsHouse carlsonsHouse;

    public Habitant(String name, View view, Porch porch, CarlsonsHouse carlsonsHouse) {
        this.name = name;
        this.view = view;
        this.porch = porch;
        this.carlsonsHouse = carlsonsHouse;
    }

    public View getView() {
        return view;
    }

    public String getName() {
        return name;
    }

    public Porch getPorch() {
        return porch;
    }

    public CarlsonsHouse getCarlsonsHouse() {
        return carlsonsHouse;
    }

    public void performAction(TimeOfDay timeOfDay, UseCarlsonsHouse useCarlsonsHouse) {
        switch (timeOfDay) {
            case Morning:
                System.out.print("А утром, когда проснешься, ");
                useCarlsonsHouse.admireView(porch, view);
                System.out.println(".");
                break;

            case Day:
                System.out.print("Днём");
                try {
                    useCarlsonsHouse.eat(porch, carlsonsHouse.getCarlsonsHouseFood());
                } catch (NoFoodException noFoodException) {
                    System.out.println(noFoodException.getMessage());
                }
                System.out.println(".");
                break;

            case Evening:
                System.out.print("По вечерам ");
                useCarlsonsHouse.sit(porch);
                System.out.print(" и ");
                useCarlsonsHouse.watchStars(porch);
                System.out.println(".");
                break;

            case Night:
                System.out.print("Ночью ");
                useCarlsonsHouse.sleep(porch, carlsonsHouse.getIsTooHotInside());
                System.out.println(".");
                break;
        }
    }

    @Override
    public String toString() {
        return name + " живёт в " + carlsonsHouse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Habitant habitant = (Habitant) o;
        return Objects.equals(name, habitant.name) && Objects.equals(view, habitant.view) && Objects.equals(porch, habitant.porch) && Objects.equals(carlsonsHouse, habitant.carlsonsHouse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, view, porch, carlsonsHouse);
    }
}




