package instructor;
import student.Person;

public class Instructor extends Person {
    private String employeeNumber;
    private Subject subject;

    // Constructors:
    public Instructor(String employeeNumber,Subject subject) {
        this.employeeNumber = employeeNumber;

        this.subject = subject;
        subject.setInstructor(this);
    }

    public Instructor(String secondName, String firstName, String telephone, String email, String employeeNumber) {
        super(secondName, firstName, telephone, email);
        this.employeeNumber = employeeNumber;
    }

    // Getters and Setters:
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    // cleanEmployeeNumber():
    public String cleanEmployeeNumber() {
        return employeeNumber == null ? "" : employeeNumber.replaceAll("\\s+", "");
    }

    // summaryLine()
    public String summaryLine(){
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",
                employeeNumber,secondName,firstName);
    }
    
    // toCard
    public String toCard(){
        StringBuilder sb = new StringBuilder("Instructor \n ---------- \n");
        sb.append("Employee#: " + employeeNumber + "\n");
        sb.append("Name: " + secondName + ", " + firstName + "\n");
        sb.append("Email: " + email + "\n");
        sb.append("Phone: " + phone + "\n");


        return sb.toString();
    }
    
    // displayName():
    public String displayName(){
        StringBuilder sb = new StringBuilder();
        if (firstName != null){
            sb.append(firstName + " ");
        }
        if (secondName != null){
            sb.append(secondName);
        }
        return sb.toString();
    }
}
