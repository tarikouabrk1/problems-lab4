package student;

public class Student extends Person {
    private String cne;
    private Major major;


    // No-args constructor
    public Student() {
        super();
    }

    // Constructor with major
    public Student(String firstName, String secondName, String phone, String email, String cne, Major major) {
        super(firstName, secondName, phone, email);
        this.cne = cne;
        this.major = major;
        major.addStudent(this);
    }

    // Constructor without specifying major (default = Computer Science)
    public Student(String firstName, String secondName, String phone, String email, String cne) {
        this(firstName, secondName, phone, email, cne, Major.DEFAULT_MAJOR);
    }

    // Getters and Setters
    public String getCne() { return cne; }
    public Major getMajor() { return major; }

    public void setCne(String cne) { this.cne = cne; }
    public void setMajor(Major major) { this.major = major; }

    // Method to get formatted full name
    public String getFullNameFormatted() {
        return String.format("%s, %s", secondName.toUpperCase(), firstName);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", cne, secondName.toUpperCase(), firstName);
    }
}
