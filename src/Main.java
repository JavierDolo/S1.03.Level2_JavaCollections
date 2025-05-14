import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Restaurant> restaurants = new TreeSet<>();

        restaurants.add(new Restaurant("Collonut", 8));
        restaurants.add(new Restaurant("Collonut", 9));
        restaurants.add(new Restaurant("Collonut", 8));
        restaurants.add(new Restaurant("Zolito Lindo", 7));
        restaurants.add(new Restaurant("Burger Town", 5));
        restaurants.add(new Restaurant("Burger Town", 3));
        restaurants.add(new Restaurant("Noodle House", 4));
        restaurants.add(new Restaurant("Noodle House", 5));
        restaurants.add(new Restaurant("Noodle House", 4));

        System.out.println("=== Restaurants Set (Unordered)===");
        for (Restaurant r : restaurants) {
            System.out.println(r);
        }

        System.out.println("=== Restaurants Sorted by name and rating descending ===");
        for (Restaurant r : restaurants) {
            System.out.println(r);
        }
    }
}
