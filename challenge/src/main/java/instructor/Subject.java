package instructor;

public class Subject {
    private static int nextID;
    private int id;
    private String code;
    private String title;
    private Instructor instructor;

    // Constructor
    public Subject(String code, String title) {
        this.id = nextID++;
        this.code = code;
        this.title = title;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public Instructor getInstructor() { return instructor; }
    public void setInstructor(Instructor instructor) { this.instructor = instructor; }

    // normalizedCode()
    public String normalizedCode() {
        return code == null ? "" : code.trim().toUpperCase();
    }

    // properTitle()
    public String properTitle() {
        if (title == null || title.isBlank()) return "";
        String[] words = title.trim().split("\\s+");
        StringBuilder proper = new StringBuilder();
        for (String w : words) {
            if (!w.isEmpty()) {
                proper.append(Character.toUpperCase(w.charAt(0)))
                      .append(w.substring(1).toLowerCase())
                      .append(" ");
            }
        }
        return proper.toString().trim();
    }

    // isIntroCourse()
    public boolean isIntroCourse() {
        return (title != null && title.toLowerCase().contains("intro")
                || normalizedCode().startsWith("INTRO-"));
    }

    // syllabusLine()
    public String syllabusLine() {
        StringBuilder sb = new StringBuilder();
        sb.append(normalizedCode())
          .append(" - ")
          .append(properTitle())
          .append(" (Instructor: ");
        if (instructor != null) {
            sb.append(instructor.getSecondName()).append(" ").append(instructor.getFirstName());
        } else {
            sb.append("TBD");
        }
        sb.append(")");
        return sb.toString();
    }
}
