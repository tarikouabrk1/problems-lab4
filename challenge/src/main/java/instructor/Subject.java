package instructor;

public class Subject {
    private static int nextID;
    private int id;
    private String code;
    private String title;
    private Instructor instructor;

    //Constructor
    public Subject(String code, String title){
        this.id = nextID++;
        this.code = code;
        this.title = title;
    }

    // Getters and Setters:
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Instructor getInstructor() {
        return instructor;
    }
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    // normalizedCode()
    public String normalizedCode(){
        return code.toUpperCase().trim();
    }
    // properTitle()
    public String properTitle(){
        String[] elements = title.split(" ");
        String properTitle = "";

        for (String e : elements){
            e = e.substring(0,0).toUpperCase() + e.substring(1);
            properTitle += e + " ";
        }

        return properTitle.trim();
    }
    // isIntroCourse
    public boolean isIntroCourse(){
        return title.toUpperCase().contains("INTRO") || code.contains("INTRO-");
    }
    // SyllabusLine
    public String syllabusLine(){
        StringBuilder sb = new StringBuilder(code + "-" + title + "(Instructor" + instructor.getFirstName() + instructor.getSecondName()+" )");
        return sb.toString();
    }

}