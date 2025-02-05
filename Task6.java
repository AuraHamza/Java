package COURSE;

public class Student {
        public int Age;
        public String Name;
        public String Course;

        public static void main(String[] args) {
            Student student = new Student();
            student.Name = "Hamza Salahuddin";
            student.Age = 19;
            student.Course = "OOP in JAVA";

            System.out.println("My name is " + student.Name + ", I'm " + student.Age + " years old, and I am studying " + student.Course + ".");
        }
}


