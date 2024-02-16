package vorlesung8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

/**
 * TODO: Class description here!
 * <p>
 * Created at 16.02.2024
 *
 * @author TomTWolf
 */
public class CompareClass {
    public static void main(String[] args) {
        ArrayList<House> houses = new ArrayList<House>();
        houses.add(new House(32, "Donald D."));
        houses.add(new House(99, "Donald .T"));
        houses.add(new House(1111, "Donald A."));
        houses.add(new House(9, "Donald B."));


        ListIterator<House> iterator = houses.listIterator();
        while (iterator.hasNext()){
            House h = iterator.next();
            System.out.println(h.toString());
        }

        System.out.println("*** Sortierung ***");

        Collections.sort(houses);

        iterator = houses.listIterator();

        while (iterator.hasNext()){
            House h = iterator.next();
            System.out.println(h.toString());
        }
    }
}
