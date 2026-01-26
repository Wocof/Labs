package buildings;

import environment.Food;
import environment.NoFoodException;
import environment.View;
import houseelements.Porch;
import java.util.ArrayList;
import java.util.Objects;

public final class CarlsonsHouse extends RoofHouse implements UseCarlsonsHouse {

    private final ArrayList<Food> carlsonsHouseFood;
    private final boolean isTooHotInside;

    public CarlsonsHouse(Location location, String atmosphere, String roofHouseSize, boolean isTooHotInside) {
        super(location, atmosphere, roofHouseSize);
        this.isTooHotInside = isTooHotInside;
        this.carlsonsHouseFood = new ArrayList<>();
    }

    public ArrayList<Food> getCarlsonsHouseFood() {
        return carlsonsHouseFood;
    }

    public void addFood(Food type) {
        this.carlsonsHouseFood.add(type);
    }

    public boolean getIsTooHotInside() {
        return isTooHotInside;
    }

    @Override
    public String description() {
        return getRoofHouseSize() + " домик Карлсона - " + getAtmosphere();
    }

    @Override
    public void sit(Porch porch) {
        System.out.print("на " + porch.toString() + " так приятно сидеть");
    }

    @Override
    public void watchStars(Porch porch) {
        System.out.print("с " + porch.toString() + " так приятно глядеть на звезды");
    }

    @Override
    public void eat(Porch porch, ArrayList<Food> carlsonsHouseFood) throws NoFoodException {
        for (Food food : carlsonsHouseFood) {
            if (food.isAvailable()) {
                System.out.print(" на " + porch.toString() + " так приятно насытиться " + food.typeOfFood());
            } else {
                throw new NoFoodException("К сожалению, " + food.typeOfFood() + " больше нет");
            }
        }
    }

    @Override
    public void sleep(Porch porch, boolean isTooHotInside) {
        if (isTooHotInside) {
            System.out.print("на " + porch.toString() + " так приятно спать, если в домике слишком жарко");
        } else {
            System.out.print("Карлсон будет спать в домике, если в нём не жарко");
        }
    }

    @Override
    public void admireView(Porch porch, View view) {
        System.out.print("на " + porch.toString() + " так приятно любоваться" + view.view());
    }

    @Override
    public String toString() {
        return getAtmosphere() + " " + getRoofHouseSize() + " домик Карлсона в " + getLocation() + ". В нём есть " + getHouseElements() + ", " + carlsonsHouseFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CarlsonsHouse carlsonsHouse = (CarlsonsHouse) o;
        return Objects.equals(carlsonsHouseFood, carlsonsHouse.carlsonsHouseFood) && Objects.equals(isTooHotInside, carlsonsHouse.isTooHotInside);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),carlsonsHouseFood, isTooHotInside);
    }
}
