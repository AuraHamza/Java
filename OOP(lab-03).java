package ICC;
public class Main {
    public static void main(String[] args) {
        Stadium stadium1 = new Stadium("National Stadium Karachi", "Karachi", 34000);
        Stadium stadium2 = new Stadium("Gaddafi Stadium Lahore", "Lahore", 50000);

        stadium1.scheduleMatch("Pakistan vs India");
        stadium1.scheduleMatch("Australia vs England");

        stadium2.scheduleMatch("Sri Lanka vs New Zealand");
        stadium2.scheduleMatch("South Africa vs Bangladesh");

        stadium1.displayDetails();
        System.out.println();
        stadium2.displayDetails();
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////

package ICC;
import java.util.ArrayList;

public class Stadium {
    String name;
    String city;
    int capacity;
    ArrayList<String> matchesScheduled;

    public Stadium(String n, String c, int cap) {
        name = n;
        city = c;
        capacity = cap;
        matchesScheduled = new ArrayList<>();
    }


    public void scheduleMatch(String match) {
        matchesScheduled.add(match);
    }

    public void displayDetails() {
        System.out.println("Stadium Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Capacity: " + capacity);
        System.out.println("Matches Scheduled: ");
        for (String match : matchesScheduled) {
            System.out.println("- " + match);
        }
    }
}







