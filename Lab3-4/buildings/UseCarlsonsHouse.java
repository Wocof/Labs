package buildings;

import environment.Food;
import environment.NoFoodException;
import environment.View;
import houseelements.Porch;
import java.util.ArrayList;

public interface UseCarlsonsHouse {
    void eat(Porch porch, ArrayList<Food> carlsonsHouseFood) throws NoFoodException;
    void sit(Porch porch);
    void watchStars(Porch porch);
    void sleep(Porch porch, boolean isTooHotInside);
    void admireView(Porch porch, View view);
}
