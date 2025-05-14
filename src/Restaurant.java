import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Restaurant implements Comparable<Restaurant> {
    private String name;
    private int rating;

    public Restaurant(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }
    public int getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Restaurant other = (Restaurant) obj;
        return rating == other.rating && Objects.equals (name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating);
    }

    @Override
    public String toString() {
        return name + " (" + rating + ")";
    }

        @Override
        public int compareTo(Restaurant obj) {
            int nameCompare = this.name.compareTo(obj.getName());
            if (nameCompare != 0) {
                return nameCompare;
            }
            return Integer.compare(obj.getRating(), this.getRating());
        }

}
