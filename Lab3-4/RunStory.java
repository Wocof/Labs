import aliveCreatures.Habitant;
import buildings.CarlsonsHouse;
import buildings.Location;
import buildings.RoofHouse;
import environment.Food;
import environment.TimeOfDay;
import environment.View;
import houseelements.Curtains;
import houseelements.Porch;
import houseelements.Shutters;
import java.util.Random;

public class RunStory {
    public static void main(String[] args) {

        Food juice = new Food("сок", true);
        Food gingerbreads = new Food("пряники", true);
        View stockholmView = new View(", как солнце встаёт над крышами домов где-то за Остермальмом");
        Location stockholm = new Location("Стокгольм", "Остермальмом");

        Curtains tulleCurtains = new Curtains("тюлевые занавески", "с чёрной бахромой");
        System.out.println(tulleCurtains);
        Shutters greenShutters = new Shutters("ставенки", "зелёные");
        System.out.println(greenShutters);
        Porch tinyPorch = new Porch("крылечко", "крохотное");
        System.out.println(tinyPorch);

        RoofHouse smallRoofHouse = new RoofHouse(stockholm, "очень уютный", "Маленкий");
        smallRoofHouse.addHouseElement(tulleCurtains);
        smallRoofHouse.addHouseElement(greenShutters);
        smallRoofHouse.addHouseElement(tinyPorch);
        System.out.println(smallRoofHouse);

        Random random = new Random();
        boolean IsTooHotInside = random.nextBoolean();
        CarlsonsHouse carlsonsHouseOnRoof = new CarlsonsHouse(stockholm,"особенно уютный", "маленький", IsTooHotInside);
        carlsonsHouseOnRoof.addFood(juice);
        carlsonsHouseOnRoof.addFood(gingerbreads);
        carlsonsHouseOnRoof.addHouseElement(tulleCurtains);
        carlsonsHouseOnRoof.addHouseElement(greenShutters);
        carlsonsHouseOnRoof.addHouseElement(tinyPorch);
        System.out.println(carlsonsHouseOnRoof);

        Habitant carlson = new Habitant("Карлсон", stockholmView, tinyPorch, carlsonsHouseOnRoof);
        System.out.println(carlson);

        System.out.println();

        tulleCurtains.uniqueAction();

        System.out.println(smallRoofHouse.description() + ", a " + carlsonsHouseOnRoof.description() + ".");

        System.out.println("Представьте себе " + greenShutters + " и " + tinyPorch + ".");

        carlson.performAction(TimeOfDay.Evening, carlsonsHouseOnRoof);
        carlson.performAction(TimeOfDay.Day, carlsonsHouseOnRoof);
        carlson.performAction(TimeOfDay.Night, carlsonsHouseOnRoof);
        carlson.performAction(TimeOfDay.Morning, carlsonsHouseOnRoof);
    }
}