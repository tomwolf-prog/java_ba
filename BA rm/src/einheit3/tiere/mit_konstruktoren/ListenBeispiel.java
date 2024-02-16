package einheit3.tiere.mit_konstruktoren;
import einheit3.tiere.mit_konstruktoren.Hund;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListenBeispiel {

    public static void main(String[] args) {
        ArrayList someList = new ArrayList();
        someList.add(new Hund("Wauwau"));
        someList.add(new Hund("Wuffwuff"));
        someList.add(new Hund("HamHam"));
        ListIterator iterator = someList.listIterator();
        while (iterator.hasNext()){
            Hund hund = (Hund) iterator.next();
            System.out.println(hund.toString());
        }
        Hund hund = (Hund) iterator.next();
        System.out.println(hund.toString());
    }


}
