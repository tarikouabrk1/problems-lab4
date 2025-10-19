package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;

    public static final int MAX_STUDENTS = 50;

    public static final Major DEFAULT_MAJOR = new Major("23", "Computer Science");

    // No-args constructor
    public Major() {
        this("23", "Computer Science");
    }

    // Initialization constructor
    public Major(String code, String name) {
        this.id = nextId++;
        this.code = code;
        this.name = name;
        this.students = new Student[MAX_STUDENTS];
        this.studentCount = 0;
    }

    // Add a student to the major
    public void addStudent(Student s) {
        if (studentCount >= MAX_STUDENTS) {
            System.out.println("⚠️ Cannot add more students to " + name + ". Capacity reached!");
            return;
        }
        students[studentCount++] = s;
        if (s.getMajor() != this) {
            s.setMajor(this);
        }
    }

    // Find student by CNE
    public Student findStudentByCNE(String cne) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getCne().equals(cne)) {
                return students[i];
            }
        }
        return null;
    }

    // Remove student by CNE
    public boolean removeStudent(String cne) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getCne().equals(cne)) {
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--studentCount] = null;
                return true;
            }
        }
        return false;
    }

    // Getters
    public String getCode() { return code; }
    public String getName() { return name; }
    public int getStudentCount() { return studentCount; }

    // Display all students in the major
    public void displayStudents() {
        System.out.println("The list of students in the " + name + " major is:");
        for (int i = 0; i < studentCount; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }
    }

    // Occupancy rate
    public double getOccupancyRate() {
        return (studentCount * 100.0) / MAX_STUDENTS;
    }

    // Return list as string (StringBuilder)
    public String getStudentListAsString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < studentCount; i++) {
            sb.append((i + 1))
                    .append(". ")
                    .append(students[i].toString())
                    .append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return String.format("Major{id=%d, code='%s', name='%s', students=%d}", id, code, name, studentCount);
    }
}
