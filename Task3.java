package Procom;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        // Create students
        ArrayList<String> student1Skills = new ArrayList<>();
        student1Skills.add("Java");
        student1Skills.add("Python");
        student1Skills.add("SQL");
        Student student1 = new Student("Hamza", student1Skills);

        ArrayList<String> student2Skills = new ArrayList<>();
        student2Skills.add("Machine Learning");
        student2Skills.add("Python");
        student2Skills.add("Power BI");
        Student student2 = new Student("Abdullah", student2Skills);

        // Create companies
        ArrayList<String> company1Skills = new ArrayList<>();
        company1Skills.add("Java");
        company1Skills.add("Python");
        company1Skills.add("SQL");
        Company company1 = new Company("Systems Limited", "Software", "Software Engineer", company1Skills);

        ArrayList<String> company2Skills = new ArrayList<>();
        company2Skills.add("Machine Learning");
        company2Skills.add("Python");
        company2Skills.add("Power BI");
        Company company2 = new Company("Folio3", "Data Science", "Data Analyst", company2Skills);

        // Schedule interviews
        company1.scheduleInterview(student1);
        company1.scheduleInterview(student2);

        company2.scheduleInterview(student1);
        company2.scheduleInterview(student2);

        System.out.println("\nCompany 1 Details:");
        company1.displayCompanyDetails();
        System.out.println();

        System.out.println("Company 2 Details:");
        company2.displayCompanyDetails();
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package Procom;
import java.util.ArrayList;

    public class Company {
        String companyName;
        String industryType;
        String jobRole;
        ArrayList<String> requiredSkills;
        ArrayList<Student> scheduledInterviews;

        public Company(String companyName, String industryType, String jobRole, ArrayList<String> requiredSkills) {
            this.companyName = companyName;
            this.industryType = industryType;
            this.jobRole = jobRole;
            this.requiredSkills = requiredSkills;
            this.scheduledInterviews = new ArrayList<>();
        }

        public void scheduleInterview(Student student) {
            if (student.hasRequiredSkills(requiredSkills)) {
                scheduledInterviews.add(student);
                System.out.println("Interview scheduled for " + student.getName() + " with " + companyName);
            } else {
                System.out.println(student.getName() + " does not have the required skills for this role.");
            }
        }
        public void displayCompanyDetails() {
            System.out.println("Company Name: " + companyName);
            System.out.println("Industry Type: " + industryType);
            System.out.println("Job Role: " + jobRole);
            System.out.println("Required Skills: " + String.join(", ", requiredSkills));
            System.out.println("Scheduled Interviews: ");
            for (Student student : scheduledInterviews) {
                System.out.println("- " + student.getName());
            }
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Procom;

import java.util.ArrayList;
public class Student {
    String name;
    ArrayList<String> skills;
    public Student(String name, ArrayList<String> skills) {
        this.name = name;
        this.skills = skills;
    }
    public boolean hasRequiredSkills(ArrayList<String> requiredSkills) {
        return skills.containsAll(requiredSkills);
    }
    public String getName() {
        return name;
    }
}
