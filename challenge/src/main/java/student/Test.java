package student;

public class Test {
    public static void main(String[] args) {
        // Create majors
        Major cs = new Major("23", "Computer Science");
        Major ai = new Major("42", "Artificial Intelligence");

        // Create students
        Student s1 = new Student("Amal", "Safi", "0600112001", "amal.safi@gmail.com", "29885676", cs);
        Student s2 = new Student("Samir", "Alami", "0645067002", "samir.alami@gmail.com", "26585976", cs);
        Student s3 = new Student("Youssef", "Berrada", "0602300103", "youssef.berrada@gmail.com", "24585976", ai);

        // Display CS students
        cs.displayStudents();

        // Example: find student
        System.out.println("\nSearching for CNE 26585976: ");
        Student found = cs.findStudentByCNE("26585976");
        if (found != null)
            System.out.println("Found: " + found.getFullNameFormatted());
        else
            System.out.println("Not found");

        // Remove student
        System.out.println("\nRemoving student 29885676...");
        cs.removeStudent("29885676");
        cs.displayStudents();

        // Occupancy rate
        System.out.printf("\nOccupancy rate for %s: %.1f%%\n", cs.getName(), cs.getOccupancyRate());

        // String list
        System.out.println("\nStudent list as String:\n" + cs.getStudentListAsString());
    }
}

