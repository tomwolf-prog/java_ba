package vorlesung8;

/**
 * TODO: Class description here!
 * <p>
 * Created at 16.02.2024
 *
 * @author TomTWolf
 */
public class House implements Comparable<House> {
    private int hausnummer;
    private String besitzer;
    public House(int hausnummer, String besitzer){
        this.hausnummer = hausnummer;
        this.besitzer = besitzer;
    }


    @Override
    public String toString() {
        return "House{" +
                "hausnummer=" + hausnummer +
                ", besitzer='" + besitzer + '\'' +
                '}';
    }

    @Override
    public int compareTo(House anderesHaus) {
//        if(this.hausnummer < anderesHaus.hausnummer){
//            return -1;
//        } else if(this.hausnummer > anderesHaus.hausnummer) {
//            return +1;
//        }else {
//            return 0;
//        }
        return this.hausnummer - anderesHaus.hausnummer;

    }
}
