package student;

public class Test {
    public static void main(String[] args) {
        // Create majors
        Major cs = new Major("23", "Computer Science");
        Major ai = new Major("42", "Artificial Intelligence");

        // Create students
        Student s1 = new Student("Amal", "Safi", "0600000001", "amal.safi@gmail.com", "22885676", cs);
        Student s2 = new Student("Samir", "Alami", "0600000002", "samir.alami@gmail.com", "23585976", cs);
        Student s3 = new Student("Youssef", "Berrada", "0600000003", "y.berrada@gmail.com", "24585976", ai);

        // Display CS students
        cs.displayStudents();

        // Example: find student
        System.out.println("\nSearching for CNE 23585976: ");
        Student found = cs.findStudentByCNE("23585976");
        if (found != null)
            System.out.println("Found: " + found.getFullNameFormatted());
        else
            System.out.println("Not found");

        // Remove student
        System.out.println("\nRemoving student 22885676...");
        cs.removeStudent("22885676");
        cs.displayStudents();

        // Occupancy rate
        System.out.printf("\nOccupancy rate for %s: %.1f%%\n", cs.getName(), cs.getOccupancyRate());

        // String list
        System.out.println("\nStudent list as String:\n" + cs.getStudentListAsString());
    }
}

