package Dev_day;

public class main {
    public static void main(String[] args) {
        Session session1 = new Session("AI in Modern Applications", "Dr. Ali", 60, 11);
        Session session2 = new Session("Cybersecurity Trends", "Mr. Ahmed", 45, 12);

        session1.scheduleSession("Dr. Ali", 11);
        session2.scheduleSession("Mr. Ahmed", 12);

        System.out.println("Session 1 Details:");
        session1.displaySessionDetails();
        System.out.println();

        System.out.println("Session 2 Details:");
        session2.displaySessionDetails();
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Dev_day;

public class Session {
    String sessionTitle;
    String speakerName;
    int duration;
    int roomNumber;

    public Session(String title, String speaker, int duration, int room) {
        this.sessionTitle = title;
        this.speakerName = speaker;
        this.duration = duration;
        this.roomNumber = room;
    }

    public void scheduleSession(String speaker, int room) {
        this.speakerName = speaker;
        this.roomNumber = room;
    }

    public void displaySessionDetails() {
        System.out.println("Session Title: " + sessionTitle);
        System.out.println("Speaker Name: " + speakerName);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Room Number: " + roomNumber);
    }
}
