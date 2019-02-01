package students;
import course.Course;
import computer.Computer;
        
public  class Students{
    
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Course course = new Course();
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

    public Course getCourse() {
        return course;
    }
    public Computer getComputer(){
        return this.computer;
    } 
    
    public Students(){
        
        this.firstName = "Nenad";
        this.lastName = "Gladovic";
        this.yearOfBirth = 1989;
        
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
        System.out.println("Kurs: " + this.course);
        System.out.println("Naziv kursa " + this.computer);
//        System.out.println("Broj casova: " + this.numberOfClasses);
//        System.out.println("Operativni sistem: " + this.operatingSystem);
//        System.out.println("Procesor " + this.processTact + " GHz");
//        System.out.println("RAM memorija " + this.memory + " GB");
//        System.out.println("Hard disk " + this.hardDrive + " GB");
        System.out.println(" ");
    }
    
    
    
    
}
