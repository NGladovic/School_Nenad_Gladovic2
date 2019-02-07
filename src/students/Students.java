package students;
import course.Course;
import computer.Computer;
        
public class Students {
    
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Course course;
    private Computer computer;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return this.course;
    }
    
    public void setComputer(Computer computer) {
        this.computer = computer;
    }
    
    public Computer getComputer(){
        return this.computer;
    } 
    
    public Students(){
        
        this.firstName = "Nenad";
        this.lastName = "Gladovic";
        this.yearOfBirth = 1989;
        this.course = new Course();
        this.computer = new Computer();
        
       
    }
    
    public Students(String customName,String customLastname,int birthYear){
        this.firstName = customName;
        this.lastName = customLastname;
        this.yearOfBirth = birthYear;
    }
    
    public void studentsInfo(){
        System.out.println("Ime " + this.firstName);
        System.out.println("Prezime " + this.lastName);
        System.out.println("Godina rodjenja: " + this.yearOfBirth);
        
        
    }
    
    
    
    
}
