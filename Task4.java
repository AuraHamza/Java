public class main {
    public static void main(String[] args) {
        Course course = new Course();

        course.setCourseCode("CS101");
        course.setCourseName("Object-Oriented Programming");
        course.setCreditHours(3);

        course.displayCourseDetails();
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Course {
    private String courseCode;
    private String courseName;
    private int creditHours;

    public void setCourseCode(String code)
    {
        if (code.length() == 5) {
            courseCode = code;
        } else {
            System.out.println("Invalid course code. Example: CS101");
        }
    }
    public void setCourseName(String name)
    {
        courseName = name;
    }

    public void setCreditHours(int hours)
    {
        if (hours >= 1 && hours <= 4) {
            creditHours = hours;
        } else {
            System.out.println("Credit hours must be between 1 and 4.");
        }
    }

    public String getCourseCode()
    {
        return courseCode;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void displayCourseDetails()
    {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Credit Hours: " + creditHours);
    }
}
