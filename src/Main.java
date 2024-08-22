// Abstract class representing a student
abstract class Student {
    // Private field for student number
    private String studentNumber;

    // Getter method for student number
    public String getStudentNumber() {
        return studentNumber;
    }

    // Setter method for student number
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    // Abstract method that must be implemented by subclasses to display a specific announcement
    public abstract void displayAnnouncement();
}

// Class for first-year students
class FirstYear extends Student {
    @Override
    public void displayAnnouncement() {
        // Print a message specific to first-year students
        System.out.println("Welcome, First-Year Student! Get ready for an exciting start to your college journey.");
    }
}

// Class for second-year students
class SecondYear extends Student {
    @Override
    public void displayAnnouncement() {
        // Print a message specific to second-year students
        System.out.println("Hello, Second-Year Student! You’re now more familiar with the college life. Keep up the good work!");
    }
}

// Class for third-year students
class ThirdYear extends Student {
    @Override
    public void displayAnnouncement() {
        // Print a message specific to third-year students
        System.out.println("Greetings, Third-Year Student! It's time to focus on your future career and finalize your plans.");
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        // Create instances for each year of student
        Student firstYear = new FirstYear();
        Student secondYear = new SecondYear();
        Student thirdYear = new ThirdYear();

        // Set student numbers for each year
        firstYear.setStudentNumber("FY123456");
        secondYear.setStudentNumber("SY123456");
        thirdYear.setStudentNumber("TY123456");

        // Display announcements for each year
        firstYear.displayAnnouncement();
        secondYear.displayAnnouncement();
        thirdYear.displayAnnouncement();

        // Print out student numbers to verify
        System.out.println("First Year Student Number: " + firstYear.getStudentNumber());
        System.out.println("Second Year Student Number: " + secondYear.getStudentNumber());
        System.out.println("Third Year Student Number: " + thirdYear.getStudentNumber());
    }
}
